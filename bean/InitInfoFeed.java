package com.ieasy360.yunshan.app.crm.network.bean;

/**
 * Created by ieasy360 on 16/11/21.
 */

public class InitInfoFeed {
    private String status;
    private String msg;
    private String errorMsg;
    private OrgBean data;


    public InitInfoFeed(String status, String msg, String errorMsg, OrgBean data) {
        this.status = status;
        this.msg = msg;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public OrgBean getData() {
        return data;
    }

    public void setData(OrgBean data) {
        this.data = data;
    }
}
