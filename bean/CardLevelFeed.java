package com.ieasy360.yunshan.app.crm.network.bean;

import java.util.List;

/**
 * Created by lyf on 2016/12/30.
 */

public class CardLevelFeed {
    private String status;
    private String errorMsg;
    private List<CardLevelBean> dataList;

    public CardLevelFeed(String status, String errorMsg, List<CardLevelBean> dataList) {
        this.status = status;
        this.errorMsg = errorMsg;
        this.dataList = dataList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public List<CardLevelBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<CardLevelBean> dataList) {
        this.dataList = dataList;
    }
}
