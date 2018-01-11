package com.ieasy360.yunshan.app.crm.network.pojo;

/**
 * Created by lyf on 2017/1/4.
 */

public class TopupPJ {
    private String cardCode;
    private String orgid;
    private String originalOrgId;
    private String rechargeAmount;
    private String addGroupId;
    private String addGroupIdType;
    private String addUser;
    private String addUserId;
    private String groupCode;
    private String groupId;
    private String groupIdType;
    private String payType;
    private String rechargePresentAmount;
    private String terminalNumber;
    private String timestamp;
    private String payTypeName;
    private String orderNo;
    private String orderId;

    public TopupPJ() {
    }

    public TopupPJ(String cardCode, String orgid, String originalOrgId, String rechargeAmount, String addGroupId, String addGroupIdType, String addUser, String addUserId, String groupCode, String groupId, String groupIdType, String payType, String rechargePresentAmount, String terminalNumber, String timestamp, String payTypeName) {
        this.cardCode = cardCode;
        this.orgid = orgid;
        this.originalOrgId = originalOrgId;
        this.rechargeAmount = rechargeAmount;
        this.addGroupId = addGroupId;
        this.addGroupIdType = addGroupIdType;
        this.addUser = addUser;
        this.addUserId = addUserId;
        this.groupCode = groupCode;
        this.groupId = groupId;
        this.groupIdType = groupIdType;
        this.payType = payType;
        this.rechargePresentAmount = rechargePresentAmount;
        this.terminalNumber = terminalNumber;
        this.timestamp = timestamp;
        this.payTypeName = payTypeName;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
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

    public String getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(String rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
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

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getRechargePresentAmount() {
        return rechargePresentAmount;
    }

    public void setRechargePresentAmount(String rechargePresentAmount) {
        this.rechargePresentAmount = rechargePresentAmount;
    }

    public String getTerminalNumber() {
        return terminalNumber;
    }

    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }
}