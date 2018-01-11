package com.ieasy360.yunshan.app.crm.network.bean;

/**
 * Created by ieasy360 on 16/11/23.
 */

public class FinanceBean {
    //支付code
    private String cwkmCode;
    //支付名称
    private String cwkmName;

    private boolean isHyJf;

    public FinanceBean() {
    }

    public FinanceBean(String cwkmCode, String cwkmName, boolean isHyJf) {
        this.cwkmCode = cwkmCode;
        this.cwkmName = cwkmName;
        this.isHyJf = isHyJf;
    }

    public String getCwkmCode() {
        return cwkmCode;
    }

    public void setCwkmCode(String cwkmCode) {
        this.cwkmCode = cwkmCode;
    }

    public String getCwkmName() {
        return cwkmName;
    }

    public void setCwkmName(String cwkmName) {
        this.cwkmName = cwkmName;
    }

    public boolean isHyJf() {
        return isHyJf;
    }

    public void setHyJf(boolean hyJf) {
        isHyJf = hyJf;
    }
}
