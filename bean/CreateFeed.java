package com.ieasy360.yunshan.app.crm.network.bean;

/**
 * Created by hfy on 11/30/16.
 */

public class CreateFeed {
    private String status;
    private String errorMsg;
    private CreateBean data;

    public CreateFeed(String status, String errorMsg, CreateBean data) {
        this.status = status;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    public CreateBean getData() {
        return data;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public String getStatus() {
        return status;
    }
}
