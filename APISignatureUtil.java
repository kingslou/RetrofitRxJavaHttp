package com.ieasy360.yunshan.app.crm.network;


import android.util.Log;

import com.ieasy360.yunshan.app.crm.AppConfig;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Samuel on 7/4/16.
 */
public class APISignatureUtil {

    /**
     * 这是针对 basic API 所做的签名认证
     * @param url ----- 不带?，? 之前的url
     * @param deviceNo
     * @param orgId
     * @param os
     * @param timestamp
     * @param token
     * @param userGuid
     * @return
     */
    public static String getSignature(String url, String timestamp, String token) {
        // 5 + APP_ID + APP_Secret
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put(RestDataSource.API_QUERY_PARAMETER_APP_ID, AppConfig.APP_ID);
        paramMap.put(RestDataSource.API_QUERY_PARAMETER_TIMESTAMP, timestamp);
        paramMap.put(RestDataSource.API_QUERY_PARAMETER_ACCESS_TOKEN, timestamp);
        Log.e("crm----","88888"+MD5Util.generateRequestToken(url, AppConfig.APP_SECRET, paramMap));
        return MD5Util.generateRequestToken(url, AppConfig.APP_SECRET, paramMap);
    }

    public static void helpTest() {
        String url = "http://192.168.1.19:8765/basic/api/v1/dmbapp/auth/login";
        String appSecret = "YG1YfMdEaCRX9mRCTfoc9Nq8oWZWJYZV";
        String appId = "damingbai";
        String device_no = "9B6EB554-2B22-48D5-BDC9-66122DA12191";
        String org_id = "";
        String os = "9.2";
        String t = "1460338457181";
        String token = "1460338457181";
        String user_id = "";


        Map<String, String> paramMap = new HashMap<>();
        paramMap.put(RestDataSource.API_QUERY_PARAMETER_APP_ID, appId);
        paramMap.put(RestDataSource.API_QUERY_PARAMETER_DEVICE_NO, device_no);
        paramMap.put(RestDataSource.API_QUERY_PARAMETER_ORG_ID, org_id);
        paramMap.put(RestDataSource.API_QUERY_PARAMETER_OS, os);
        paramMap.put(RestDataSource.API_QUERY_PARAMETER_TIMESTAMP, t);
        paramMap.put(RestDataSource.API_QUERY_PARAMETER_ACCESS_TOKEN, token);
        paramMap.put(RestDataSource.API_QUERY_PARAMETER_USER_ID, user_id);

        String signature = MD5Util.generateRequestToken(url, appSecret, paramMap);
    }
}
