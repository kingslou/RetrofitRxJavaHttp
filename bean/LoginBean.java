package com.ieasy360.yunshan.app.crm.network.bean;

/**
 * Created by hfy on 11/16/16.
 */

public class LoginBean {
    private String status;
    private String msg;
    private AccountBean data;
    private String errorMsg;

    public LoginBean() {

    }

    public LoginBean(String status, String msg, AccountBean data, String errorMsg) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.errorMsg = errorMsg;
    }

    public void setData(AccountBean data) {
        this.data = data;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public AccountBean getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public String getStatus() {
        return status;
    }
}
