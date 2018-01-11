package com.ieasy360.yunshan.app.crm.network.bean;

import java.util.List;

/**
 * Created by lyf on 2017/1/4.
 */

public class TopupFeed {

    private String errorMsg;
    private String status;
    private TopupData data;

    public TopupFeed(String errorMsg, String status, TopupData data) {
        this.errorMsg = errorMsg;
        this.status = status;
        this.data = data;
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

    public TopupData getData() {
        return data;
    }

    public void setData(TopupData data) {
        this.data = data;
    }
}
