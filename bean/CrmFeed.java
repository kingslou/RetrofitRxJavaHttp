package com.ieasy360.yunshan.app.crm.network.bean;

import java.util.List;

/**
 * Created by hfy on 11/18/16.
 */

public class CrmFeed {
    //success, failed
    String status;
    //当status不为success时有错误信息,以对象形式展现错误信息
    Object errorDetails;
    CrmInfoBean data;
    //当status不为success时有错误信息, 以逗号隔开：比如卡号不能为空,机构(门店或公司)不能为空,运营机构ID不能为空,集团代码不能为空,集团id不能为空
    String errorMsg;
    String msg;



    public CrmFeed() {

    }

    public CrmFeed(String status, Object errorDetails, CrmInfoBean data, String errorMsg, String msg) {
        this.status = status;
        this.errorDetails = errorDetails;
        this.data = data;
        this.errorMsg = errorMsg;
        this.msg = msg;
    }


    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(Object errorDetails) {
        this.errorDetails = errorDetails;
    }

    public CrmInfoBean getData() {
        return data;
    }

    public void setData(CrmInfoBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }




}
