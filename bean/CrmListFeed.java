package com.ieasy360.yunshan.app.crm.network.bean;

import java.util.List;

/**
 * Created by hfy on 11/21/16.
 */

public class CrmListFeed {
    private String status;
    private String errorMsg;
    private List<CrmInfoBean> dataList;

    public CrmListFeed(String status, String errorMsg, List<CrmInfoBean> dataList) {
        this.status = status;
        this.errorMsg = errorMsg;
        this.dataList = dataList;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setDataList(List<CrmInfoBean> dataList) {
        this.dataList = dataList;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public List<CrmInfoBean> getDataList() {
        return dataList;
    }

    public String getStatus() {
        return status;
    }
}
