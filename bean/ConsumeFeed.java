package com.ieasy360.yunshan.app.crm.network.bean;

import java.util.List;

/**
 * Created by ieasy360 on 16/11/24.
 */

public class ConsumeFeed {
    private String status;
    private String errorMsg;
    private ConsumeBean data;
    private List<DataListBean> dataList;

    public ConsumeFeed(String status, String errorMsg, ConsumeBean data, List<DataListBean> dataList) {
        this.status = status;
        this.errorMsg = errorMsg;
        this.data = data;
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

    public ConsumeBean getData() {
        return data;
    }

    public void setData(ConsumeBean data) {
        this.data = data;
    }

    public List<DataListBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<DataListBean> dataList) {
        this.dataList = dataList;
    }
}
