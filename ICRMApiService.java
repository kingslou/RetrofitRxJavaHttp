package com.ieasy360.yunshan.app.crm.network;


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

import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.POST;
import rx.Observable;


/**
 * Created by Samuel on 14/11/16.
 */
public interface ICRMApiService {
    String headUrl = AppConfig.DEV_BASE_URL;

    // 云账号 登录 API
    @Headers("Content-Type:application/json")
    //production  http://api.yunshan.ieasy360.com
    @POST("/basic/api/v1/login/login")
    Observable<LoginBean> callLoginAPI(@Body LoginPJ pj);

    @POST("/basic/api/v1/org/findorgbypk_groupid")
    Observable<InitInfoFeed> callInitAPI(@Body InitPJ pj);

    // 会员消费类---读卡 API
    //sop-crm-api/api/v1/mobile/card/read
    @POST("/crm/api/v1/mobile/card/read")
    Observable<CrmFeed> callCrmInfoAPI(@Body CrmInfoPJ pj);

    //根据手机号查询卡信息
    @POST("/crm/api/v1/mobile/card/readall")
    Observable<CrmListFeed> callCrmInfoListAPI(@Body CrmListPJ pj);

    //获取消费类型
    @POST("/pos/api/v1/fastcaiwukemu/all")
    Observable<FinanceFeed> callFinanceListAPI(@Body FinancePJ pj);

    //消费API
    @POST("/crm/api/v1/mobile/trade/consume")
    Observable<ConsumeFeed> callConsumeAPI(@Body ConsumePJ pj);
    //卡等级
    @POST("/crm/api/v1/mobile/card/level/find")
    Observable<CardLevelFeed> callCardLevel(@Body CrmInfoPJ pj);
    //开卡API
    @POST("/crm/api/v1/mobile/card/create")
    Observable<CreateFeed> callCreateAPI(@Body CreatePJ pj);
    //充值API

    @POST("/crm/api/v1/mobile/trade/recharge")
    Observable<TopupFeed>callRechargeAPI(@Body TopupPJ pj);
}
