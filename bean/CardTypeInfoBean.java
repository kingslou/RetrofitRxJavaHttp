package com.ieasy360.yunshan.app.crm.network.bean;

/**
 * Created by lyf on 2016/12/30.
 */

public class CardTypeInfoBean {
    private int anonymous;//	是否无记名卡	number	0:否,1:是
    private int cardTypeAttribute;//	卡类型属性：电子卡，实体卡	number	1:电子卡,2:实体卡
    private String cardTypeDesc;//	卡类型描述	string
    private String cardTypeImgUrl;//	卡类型图片Url	string
    private boolean cardTypeIsPermanent;//	卡类型是否永久有效	boolean
    private boolean cardTypeIspwd;//	卡类型是否需要密码	boolean
    private String cardTypeName;//	卡类型名称	string
    private String cardTypePwd;//	卡类型密码
    private int cardTypeStatus;//	卡类型状态	number
    private long cardTypeValidtime;//	卡类型有效期
    private String guid;//	卡类型ID	string
    private String orgid;//	机构ID	string
    private String originalOrgId;//	运营机构ID

    public CardTypeInfoBean(int anonymous, int cardTypeAttribute, String cardTypeDesc,
                            String cardTypeImgUrl, boolean cardTypeIsPermanent,
                            boolean cardTypeIspwd, String cardTypeName, String cardTypePwd,
                            int cardTypeStatus, long cardTypeValidtime, String guid, String orgid,
                            String originalOrgId) {
        this.anonymous = anonymous;
        this.cardTypeAttribute = cardTypeAttribute;
        this.cardTypeDesc = cardTypeDesc;
        this.cardTypeImgUrl = cardTypeImgUrl;
        this.cardTypeIsPermanent = cardTypeIsPermanent;
        this.cardTypeIspwd = cardTypeIspwd;
        this.cardTypeName = cardTypeName;
        this.cardTypePwd = cardTypePwd;
        this.cardTypeStatus = cardTypeStatus;
        this.cardTypeValidtime = cardTypeValidtime;
        this.guid = guid;
        this.orgid = orgid;
        this.originalOrgId = originalOrgId;
    }

    public int getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(int anonymous) {
        this.anonymous = anonymous;
    }

    public int getCardTypeAttribute() {
        return cardTypeAttribute;
    }

    public void setCardTypeAttribute(int cardTypeAttribute) {
        this.cardTypeAttribute = cardTypeAttribute;
    }

    public String getCardTypeDesc() {
        return cardTypeDesc;
    }

    public void setCardTypeDesc(String cardTypeDesc) {
        this.cardTypeDesc = cardTypeDesc;
    }

    public String getCardTypeImgUrl() {
        return cardTypeImgUrl;
    }

    public void setCardTypeImgUrl(String cardTypeImgUrl) {
        this.cardTypeImgUrl = cardTypeImgUrl;
    }

    public boolean isCardTypeIsPermanent() {
        return cardTypeIsPermanent;
    }

    public void setCardTypeIsPermanent(boolean cardTypeIsPermanent) {
        this.cardTypeIsPermanent = cardTypeIsPermanent;
    }

    public boolean isCardTypeIspwd() {
        return cardTypeIspwd;
    }

    public void setCardTypeIspwd(boolean cardTypeIspwd) {
        this.cardTypeIspwd = cardTypeIspwd;
    }

    public String getCardTypeName() {
        return cardTypeName;
    }

    public void setCardTypeName(String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }

    public String getCardTypePwd() {
        return cardTypePwd;
    }

    public void setCardTypePwd(String cardTypePwd) {
        this.cardTypePwd = cardTypePwd;
    }

    public int getCardTypeStatus() {
        return cardTypeStatus;
    }

    public void setCardTypeStatus(int cardTypeStatus) {
        this.cardTypeStatus = cardTypeStatus;
    }

    public long getCardTypeValidtime() {
        return cardTypeValidtime;
    }

    public void setCardTypeValidtime(long cardTypeValidtime) {
        this.cardTypeValidtime = cardTypeValidtime;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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
}
