package com.ieasy360.yunshan.app.crm.network.bean;

import java.util.List;

/**
 * Created by lyf on 2016/12/30.
 */

public class CardLevelBean {
    private long cardLevelBackCash;	//达到本等级奖励的费用	number
    private long cardLevelBackJifen;//	达到本等级奖励的积分	number
    private String cardLevelBadgeName;//	等级徽章名称	string
    private String cardLevelDesc;//	卡等级描述
    private long cardLevelFee;//	办理此卡等级的卡所需的费用	number
    private String cardLevelImgUrl;//	卡等级徽章图片Url
    private boolean cardLevelIsBadge;//	是否启用等级徽章启用	boolean
    private boolean cardLevelIsDeposit;//	卡等级的卡是否允许充值	boolean
    private boolean cardLevelIsJifen;//	卡等级的卡是否允许积分	boolean
    private boolean cardLevelIsLock;//	此等级是否被锁定	boolean
    private boolean cardLevelIsPrice;//	此等级的卡是否可以使用会员价	boolean
    private boolean cardLevelIsTimecard;//	此等级是否可用次卡	boolean
    private long cardLevelJifen;//	兑换本等级所需的积分	number
    private String cardLevelName;//	卡等级名称	string
    private long cardLevelNum; //	等级级别序号(1,2,3,4...)	number
//    private long cardLevelPriceNum;//	此等级的卡使用那个会员价(如果可以使用会员价)
    private long cardLevelStatus;//	卡等级状态	number
    private String groupCode;//	集团编码	string
    private String groupId;//		集团ID	string
    private String guid	;//	卡等级ID	string
    private String orgid;//		机构ID	string
    private String originalOrgId;//	运营机构ID
    private CardTypeInfoBean cardTypeInfo;

    public CardLevelBean() {
    }

    public CardLevelBean(long cardLevelBackCash, long cardLevelBackJifen, String cardLevelBadgeName, String cardLevelDesc, long cardLevelFee, String cardLevelImgUrl, boolean cardLevelIsBadge, boolean cardLevelIsDeposit, boolean cardLevelIsJifen, boolean cardLevelIsLock, boolean cardLevelIsPrice, boolean cardLevelIsTimecard, long cardLevelJifen, String cardLevelName, long cardLevelNum, long cardLevelStatus, String groupCode, String groupId, String guid, String orgid, String originalOrgId, CardTypeInfoBean cardTypeInfo) {
        this.cardLevelBackCash = cardLevelBackCash;
        this.cardLevelBackJifen = cardLevelBackJifen;
        this.cardLevelBadgeName = cardLevelBadgeName;
        this.cardLevelDesc = cardLevelDesc;
        this.cardLevelFee = cardLevelFee;
        this.cardLevelImgUrl = cardLevelImgUrl;
        this.cardLevelIsBadge = cardLevelIsBadge;
        this.cardLevelIsDeposit = cardLevelIsDeposit;
        this.cardLevelIsJifen = cardLevelIsJifen;
        this.cardLevelIsLock = cardLevelIsLock;
        this.cardLevelIsPrice = cardLevelIsPrice;
        this.cardLevelIsTimecard = cardLevelIsTimecard;
        this.cardLevelJifen = cardLevelJifen;
        this.cardLevelName = cardLevelName;
        this.cardLevelNum = cardLevelNum;
        this.cardLevelStatus = cardLevelStatus;
        this.groupCode = groupCode;
        this.groupId = groupId;
        this.guid = guid;
        this.orgid = orgid;
        this.originalOrgId = originalOrgId;
        this.cardTypeInfo = cardTypeInfo;
    }

    public long getCardLevelBackCash() {
        return cardLevelBackCash;
    }

    public void setCardLevelBackCash(long cardLevelBackCash) {
        this.cardLevelBackCash = cardLevelBackCash;
    }

    public long getCardLevelBackJifen() {
        return cardLevelBackJifen;
    }

    public void setCardLevelBackJifen(long cardLevelBackJifen) {
        this.cardLevelBackJifen = cardLevelBackJifen;
    }

    public String getCardLevelBadgeName() {
        return cardLevelBadgeName;
    }

    public void setCardLevelBadgeName(String cardLevelBadgeName) {
        this.cardLevelBadgeName = cardLevelBadgeName;
    }

    public String getCardLevelDesc() {
        return cardLevelDesc;
    }

    public void setCardLevelDesc(String cardLevelDesc) {
        this.cardLevelDesc = cardLevelDesc;
    }

    public long getCardLevelFee() {
        return cardLevelFee;
    }

    public void setCardLevelFee(long cardLevelFee) {
        this.cardLevelFee = cardLevelFee;
    }

    public String getCardLevelImgUrl() {
        return cardLevelImgUrl;
    }

    public void setCardLevelImgUrl(String cardLevelImgUrl) {
        this.cardLevelImgUrl = cardLevelImgUrl;
    }

    public boolean isCardLevelIsBadge() {
        return cardLevelIsBadge;
    }

    public void setCardLevelIsBadge(boolean cardLevelIsBadge) {
        this.cardLevelIsBadge = cardLevelIsBadge;
    }

    public boolean isCardLevelIsDeposit() {
        return cardLevelIsDeposit;
    }

    public void setCardLevelIsDeposit(boolean cardLevelIsDeposit) {
        this.cardLevelIsDeposit = cardLevelIsDeposit;
    }

    public boolean isCardLevelIsJifen() {
        return cardLevelIsJifen;
    }

    public void setCardLevelIsJifen(boolean cardLevelIsJifen) {
        this.cardLevelIsJifen = cardLevelIsJifen;
    }

    public boolean isCardLevelIsLock() {
        return cardLevelIsLock;
    }

    public void setCardLevelIsLock(boolean cardLevelIsLock) {
        this.cardLevelIsLock = cardLevelIsLock;
    }

    public boolean isCardLevelIsPrice() {
        return cardLevelIsPrice;
    }

    public void setCardLevelIsPrice(boolean cardLevelIsPrice) {
        this.cardLevelIsPrice = cardLevelIsPrice;
    }

    public boolean isCardLevelIsTimecard() {
        return cardLevelIsTimecard;
    }

    public void setCardLevelIsTimecard(boolean cardLevelIsTimecard) {
        this.cardLevelIsTimecard = cardLevelIsTimecard;
    }

    public long getCardLevelJifen() {
        return cardLevelJifen;
    }

    public void setCardLevelJifen(long cardLevelJifen) {
        this.cardLevelJifen = cardLevelJifen;
    }

    public String getCardLevelName() {
        return cardLevelName;
    }

    public void setCardLevelName(String cardLevelName) {
        this.cardLevelName = cardLevelName;
    }

    public long getCardLevelNum() {
        return cardLevelNum;
    }

    public void setCardLevelNum(long cardLevelNum) {
        this.cardLevelNum = cardLevelNum;
    }

    public long getCardLevelStatus() {
        return cardLevelStatus;
    }

    public void setCardLevelStatus(long cardLevelStatus) {
        this.cardLevelStatus = cardLevelStatus;
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

    public CardTypeInfoBean getCardTypeInfo() {
        return cardTypeInfo;
    }

    public void setCardTypeInfo(CardTypeInfoBean cardTypeInfo) {
        this.cardTypeInfo = cardTypeInfo;
    }
}
