package com.ieasy360.yunshan.app.crm.network.bean;

import java.util.List;

/**
 * Created by ieasy360 on 16/11/23.
 */

public class FinanceFeed {
    private String status;
    private String errorMsg;
    private List<FinanceBean> dataList;

    public FinanceFeed() {
    }

    public FinanceFeed(String status, String errorMsg, List<FinanceBean> dataList) {
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

    public List<FinanceBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<FinanceBean> dataList) {
        this.dataList = dataList;
    }
}
