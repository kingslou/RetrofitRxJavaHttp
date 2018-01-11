package com.ieasy360.yunshan.app.crm.network.pojo;

/**
 * Created by hfy on 11/21/16.
 */

public class CrmListPJ {
    private String groupCode;
    private String groupId;
    private String hyMobile;
    private String orgid;
    private String originalOrgId;

    public CrmListPJ(String groupCode, String groupId, String memberMobile,
                     String orgid, String originalOrgId) {
        this.groupCode = groupCode;
        this.groupId = groupId;
        this.hyMobile = memberMobile;
        this.orgid = orgid;
        this.originalOrgId = originalOrgId;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setHyMobile(String hyMobile) {
        this.hyMobile = hyMobile;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public void setOriginalOrgId(String originalOrgId) {
        this.originalOrgId = originalOrgId;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getHyMobile() {
        return hyMobile;
    }

    public String getOrgid() {
        return orgid;
    }

    public String getOriginalOrgId() {
        return originalOrgId;
    }
}
