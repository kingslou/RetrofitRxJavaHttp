package com.ieasy360.yunshan.app.crm.network;

import android.util.Log;

import com.ieasy360.yunshan.app.crm.AppConfig;
import com.ieasy360.yunshan.app.crm.network.bean.CardLevelFeed;
import com.ieasy360.yunshan.app.crm.network.bean.ConsumeFeed;
import com.ieasy360.yunshan.app.crm.network.bean.CreateFeed;
import com.ieasy360.yunshan.app.crm.network.bean.CrmFeed;
import com.ieasy360.yunshan.app.crm.network.bean.CrmListFeed;
import com.ieasy360.yunshan.app.crm.network.bean.FinanceFeed;
import com.ieasy360.yunshan.app.crm.network.bean.InitInfoFeed;
import com.ieasy360.yunshan.app.crm.network.bean.LoginBean;
import com.ieasy360.yunshan.app.crm.network.bean.TopupFeed;
import com.ieasy360.yunshan.app.crm.network.pojo.ConsumePJ;
import com.ieasy360.yunshan.app.crm.network.pojo.CreatePJ;
import com.ieasy360.yunshan.app.crm.network.pojo.CrmInfoPJ;
import com.ieasy360.yunshan.app.crm.network.pojo.CrmListPJ;
import com.ieasy360.yunshan.app.crm.network.pojo.FinancePJ;
import com.ieasy360.yunshan.app.crm.network.pojo.InitPJ;
import com.ieasy360.yunshan.app.crm.network.pojo.LoginPJ;
import com.ieasy360.yunshan.app.crm.network.pojo.TopupPJ;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;

import java.io.IOException;


import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Samuel on 14/11/16.
 */
public class RestDataSource {
    // basic API 签名认证
    public static String API_QUERY_PARAMETER_APP_ID = "appid";
    public static String API_QUERY_PARAMETER_APP_SECRET = "app_secret";


    public static String API_QUERY_PARAMETER_DEVICE_NO = "device_no";
    public static String API_QUERY_PARAMETER_ORG_ID = "org_id";
    public static String API_QUERY_PARAMETER_OS = "os";

    public static String API_QUERY_PARAMETER_TIMESTAMP = "t";

    public static String API_QUERY_PARAMETER_USER_ID = "user_id";

    public static String API_QUERY_PARAMETER_SIGNATURE = "signature";

    public static String API_QUERY_PARAMETER_ACCESS_TOKEN = "token";

    private static ICRMApiService instance;

    private static RestDataSource restDataSource;

    private String BASE_URL = "";

    private void init() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient();
        Log.e("crm----", "123123" + client.interceptors());
        client.interceptors().add(logging);

        String flavor = AppConfig.getServerFlavor();
        if(flavor.equals("dev")){
            BASE_URL = AppConfig.DEV_BASE_URL;
        }else{
            BASE_URL = AppConfig.PRO_BASE_URL;
        }
        // add 请求参数
        client.interceptors().add(mInterceptor);

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        instance = retrofit.create(ICRMApiService.class);
    }

    public static ICRMApiService getAPIService() {
        if (restDataSource == null) {
            restDataSource = new RestDataSource();
        }

        if (instance == null) {
            restDataSource.init();
        }

        return instance;
    }

    private Interceptor mInterceptor = new Interceptor() {

        @Override
        public Response intercept(Chain chain) throws IOException {
//            if (!NetWorkUtils.isNetworkAvailable(MyApplication.getInstance())) {
//                MyApplication.getInstance().showNoNetworkToast();
//                throw new IOException("No Network Available");
//            }

            Request original = chain.request();
            HttpUrl originalHttpUrl = original.httpUrl();

            long timestamp = System.currentTimeMillis();
            HttpUrl url = originalHttpUrl.newBuilder()
                    .addQueryParameter(API_QUERY_PARAMETER_APP_ID, AppConfig.APP_ID)
                    .addQueryParameter(API_QUERY_PARAMETER_TIMESTAMP, Long.toString(timestamp))
                    .addQueryParameter(API_QUERY_PARAMETER_ACCESS_TOKEN, Long.toString(timestamp))
                    .addQueryParameter(API_QUERY_PARAMETER_SIGNATURE, APISignatureUtil.getSignature(originalHttpUrl.toString(), Long.toString(timestamp), Long.toString(timestamp)))
                    .build();

            Log.e("hfy", url.toString());
            // Request customization: add request headers
            Request.Builder requestBuilder = original.newBuilder()
                    .url(url)
                    .method(original.method(), original.body());
            Request request = requestBuilder.build();
            return chain.proceed(request);
        }
    };


    public static void login(LoginPJ pj, Observer<LoginBean> observer) {
        setSubscribe(getAPIService().callLoginAPI(pj), observer);
    }

    public static void init(InitPJ pj, Observer<InitInfoFeed> observer) {
        setSubscribe(getAPIService().callInitAPI(pj), observer);
    }

    public static void getCrmInfo(CrmInfoPJ pj, Observer<CrmFeed> observer) {
        setSubscribe(getAPIService().callCrmInfoAPI(pj), observer);
    }

    public static void getCrmInfoList(CrmListPJ pj, Observer<CrmListFeed> observer) {
        setSubscribe(getAPIService().callCrmInfoListAPI(pj), observer);
    }

    public static void getFinanceInfoList(FinancePJ pj, Observer<FinanceFeed> observer) {
        setSubscribe(getAPIService().callFinanceListAPI(pj), observer);
    }

    public static void getConsumeInfoList(ConsumePJ pj, Observer<ConsumeFeed> observer) {
        setSubscribe(getAPIService().callConsumeAPI(pj), observer);
    }
    public static void getCardLevel(CrmInfoPJ pj, Observer<CardLevelFeed> observer) {
        setSubscribe(getAPIService().callCardLevel(pj), observer);
    }

    public static void getCreateInfo(CreatePJ pj, Observer<CreateFeed> observer) {
        setSubscribe(getAPIService().callCreateAPI(pj), observer);
    }
    public static void getTopupInfo(TopupPJ pj, Observer<TopupFeed> observer) {
        setSubscribe(getAPIService().callRechargeAPI(pj), observer);
    }

    /**
     * 插入观察者
     *
     * @param observable
     * @param observer
     * @param <T>
     */
    public static <T> void setSubscribe(Observable<T> observable, Observer<T> observer) {

        observable.subscribeOn(Schedulers.io())
                .subscribeOn(Schedulers.newThread())//子线程访问网络
                .observeOn(AndroidSchedulers.mainThread())//回调到主线程
                .subscribe(observer);
    }
}
