package com.ieasy360.yunshan.app.crm.network;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by Samuel on 6/4/16.
 */
public class MD5Util {

    private static String parse2StrWithOrder(String url, Map<String, String[]> paramMap) {
        StringBuilder retStr = new StringBuilder();
        retStr = retStr.append(url);
        if (paramMap.size() != 0) {
            retStr = retStr.append("?");

            // sort
            Collection<String> keyset = paramMap.keySet();
            List<String> list = new ArrayList<String>(keyset);
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                String key = list.get(i);
                String[] values = paramMap.get(list.get(i));

                if (values.length == 1) {
                    retStr = retStr.append(key).append("=").append(values[0]);
                } else if (values.length > 1) {
                    for (int j = 0; j < values.length; j++) {
                        retStr = retStr.append(key).append("=").append(values[j]);
                        if (j != values.length - 1) {
                            retStr = retStr.append("&");
                        }
                    }
                }

                if (i != list.size() - 1) {
                    retStr = retStr.append("&");
                }
            }
        }
        return retStr.toString();
    }

    private static String encodeMD5Hex(String orgStr) {
        return MD5.GetMD5Code(orgStr).toUpperCase();
    }

    public static String encodeForMD5(String url, Map<String, String[]> paramMap) {
        String retStr = parse2StrWithOrder(url, paramMap);
        return encodeMD5Hex(retStr);
    }

    // －－－－－－－－－－－－－ basic API  签名认证 －－－－－－－－－－－－－
    public static String generateRequestToken(String url, String appSecret, Map<String, String> parameters) {
        String fullurl = url + appSecret + buildQueryString(parameters,true);

        return MD5.GetMD5Code(fullurl).toUpperCase();
    }

    public static String buildQueryString(Map<String, String> parameters) {
        return buildQueryString(parameters, false);
    }

    public static String buildQueryString(Map<String, String> parameters, boolean sortKey) {
        if (parameters == null) {
            return "";
        }
        StringBuilder queryString = new StringBuilder();
        if (sortKey) {
            List<String> sortedKeyList = new ArrayList<String>();
            sortedKeyList.addAll(parameters.keySet());
            Collections.sort(sortedKeyList);
            for (String key : sortedKeyList) {
                queryString.append(key).append("=").append(parameters.get(key)).append("&");
            }
        } else {
            for (String key : parameters.keySet()) {
                queryString.append(key).append("=").append(parameters.get(key)).append("&");
            }
        }
        queryString.delete(queryString.length() - 1, queryString.length());
        return queryString.toString();
    }
}
