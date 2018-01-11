package com.ieasy360.yunshan.app.crm.network.pojo;

import android.content.Intent;
import android.support.annotation.IntegerRes;

/**
 * Created by ieasy360 on 16/11/24.
 */

public class ConsumePJ {

    private String addGroupId;	//添加集团ID	string
    private String addGroupIdType;	//	添加集团类型	string
    private String addUser;	//	添加人	string
    private String addUserId;	//	添加人ID	string
    private String cardCode;	//	卡号	string
    private String cardPassword;	//卡密码	string
    private String credentialNumber;	//	交易凭据号	string
    private String groupCode;	//	集团编码	string
    private String groupId;	//	集团ID	string
    private String groupIdType;	//		string
    private String orgName;	//	机构名称	string
    private String orgid;	//	机构ID	string
    private String originalOrgId;	//	运营机构ID	string
    private String  payType;	//	付款方式ID	string
    private String payTypeName;	//	付款方式名称	string
    private String pointToCash;	//	积分兑换现金值	string
    private String terminalNumber;	//	交易终端号	string
    private String tradeMoney;	//	交易金额	string
    private boolean payTypeIsJiFen;
    private Integer tradePoint;	//	交易积分	string
    private String consumeType;
    private String orderNo;

    public ConsumePJ() {
    }

    public ConsumePJ(String addGroupId, String addGroupIdType, String addUser, String addUserId, String cardCode, String cardPassword, String credentialNumber, String groupCode, String groupId, String groupIdType, String orgName, String orgid, String originalOrgId, String payType, String payTypeName, String pointToCash, String terminalNumber, String tradeMoney, boolean payTypeIsJiFen, int tradePoint, String consumeType, String orderNo) {
        this.addGroupId = addGroupId;
        this.addGroupIdType = addGroupIdType;
        this.addUser = addUser;
        this.addUserId = addUserId;
        this.cardCode = cardCode;
        this.cardPassword = cardPassword;
        this.credentialNumber = credentialNumber;
        this.groupCode = groupCode;
        this.groupId = groupId;
        this.groupIdType = groupIdType;
        this.orgName = orgName;
        this.orgid = orgid;
        this.originalOrgId = originalOrgId;
        this.payType = payType;
        this.payTypeName = payTypeName;
        this.pointToCash = pointToCash;
        this.terminalNumber = terminalNumber;
        this.tradeMoney = tradeMoney;
        this.payTypeIsJiFen = payTypeIsJiFen;
        this.tradePoint = tradePoint;
        this.consumeType = consumeType;
        this.orderNo = orderNo;
    }

    public String getAddGroupId() {
        return addGroupId;
    }

    public void setAddGroupId(String addGroupId) {
        this.addGroupId = addGroupId;
    }

    public String getAddGroupIdType() {
        return addGroupIdType;
    }

    public void setAddGroupIdType(String addGroupIdType) {
        this.addGroupIdType = addGroupIdType;
    }

    public String getAddUser() {
        return addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    public String getCredentialNumber() {
        return credentialNumber;
    }

    public void setCredentialNumber(String credentialNumber) {
        this.credentialNumber = credentialNumber;
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

    public String getGroupIdType() {
        return groupIdType;
    }

    public void setGroupIdType(String groupIdType) {
        this.groupIdType = groupIdType;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
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

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
    }

    public String getPointToCash() {
        return pointToCash;
    }

    public void setPointToCash(String pointToCash) {
        this.pointToCash = pointToCash;
    }

    public String getTerminalNumber() {
        return terminalNumber;
    }

    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    public String getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(String tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public boolean isPayTypeIsJiFen() {
        return payTypeIsJiFen;
    }

    public void setPayTypeIsJiFen(boolean payTypeIsJiFen) {
        this.payTypeIsJiFen = payTypeIsJiFen;
    }

    public int getTradePoint() {
        return tradePoint;
    }

    public void setTradePoint(Integer tradePoint) {
        this.tradePoint = tradePoint;
    }

    public String getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(String consumeType) {
        this.consumeType = consumeType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }


    /**
     * Created by lyf on 2017/1/4.
     */


}

