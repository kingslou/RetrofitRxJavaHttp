package com.ieasy360.yunshan.app.crm.network.bean;

/**
 * Created by lyf on 2017/1/4.
 */

public class TopupData {

    private TopupBean crmCardAccountInfo;

    public TopupData(TopupBean crmCardAccountInfo) {
        this.crmCardAccountInfo = crmCardAccountInfo;
    }

    public TopupBean getCrmCardAccountInfo() {
        return crmCardAccountInfo;
    }

    public void setCrmCardAccountInfo(TopupBean crmCardAccountInfo) {
        this.crmCardAccountInfo = crmCardAccountInfo;
    }
}
