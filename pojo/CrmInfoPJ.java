package com.ieasy360.yunshan.app.crm.network.pojo;

/**
 * Created by ieasy360 on 16/11/15.
 */
public class CrmInfoPJ {
    //卡号
    private String cardCode;
    //集团编号
    private String groupCode;
    //集团ID
    private String groupId;
   //机构ID
   private String orgid;
   //运营机构ID
   private String originalOrgId;

    public CrmInfoPJ() {

    }

    public CrmInfoPJ(String cardCode, String groupCode, String groupId, String orgid, String originalOrgId) {
        this.cardCode = cardCode;
        this.groupCode = groupCode;
        this.groupId = groupId;
        this.orgid = orgid;
        this.originalOrgId = originalOrgId;
    }
    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getOriginalOrgId() {
        return originalOrgId;
    }

    public void setOriginalOrgId(String originalOrgId) {
        this.originalOrgId = originalOrgId;
    }

    @Override
    public String toString() {
        return "cardCode=" + cardCode + "groupId=" + groupId + "groupCode=" + groupCode + "orgid=" + orgid + "originalOrgId=" + originalOrgId;
    }
}
