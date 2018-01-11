package com.ieasy360.yunshan.app.crm.network.pojo;

/**
 * Created by ieasy360 on 16/11/23.
 */

public class FinancePJ {
    private String  orgid;
    private String  groupId;
    private String  groupCode;

    public FinancePJ(String orgid, String groupId, String groupCode) {
        this.orgid = orgid;
        this.groupId = groupId;
        this.groupCode = groupCode;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
}
