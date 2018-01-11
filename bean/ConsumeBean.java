package com.ieasy360.yunshan.app.crm.network.bean;

/**
 * Created by ieasy360 on 16/11/24.
 */

public class ConsumeBean {
    private int accountPoint;//	交易后账户积分余额	number
    private double accountPrepaidMoney;//	交易后账户储值余额	number
    private double accountPresentMoney;//	交易后账户储值赠送余额	number
    private double addTime;//	添加时间	number
    private String addUser;//	添加人	string
    private String addUserId;//	添加人ID	string
    private String cardCode;//	卡号	string
    private String couponCode;//	券号
    private String credentialNumber	;//交易凭据号	string
    private String groupCode;//	集团编号	string
    private String groupId;//	集团ID	string
    private int groupIdType;//		number
    private String guid;//	交易记录ID	string
    private String memberId;//	交易会员ID	string
    private String orgid;//	机构ID	string
    private String  originalOrgId;//	运营机构ID
    private int  prevAccountPoint;//	交易前账户积分余额	number
    private double  prevAccountPrepaidMoney;//	交易前账户储值余额	number
    private double  prevAccountPresentMoney;//	交易前账户储值赠送余额	number
    private String status;//	交易状态	string
    private String  terminalNumber;//	交易终端号	string
    private String  tradeAddress;//	交易地点
    private int     tradePoint;
    private double  tradeMoney;
    private String  tradeType;
    private String   tradeTypeName;
    private int   tradePresentPoint;

    public ConsumeBean(int accountPoint, double accountPrepaidMoney, double accountPresentMoney, double addTime, String addUser, String addUserId,
                       String cardCode, String couponCode, String credentialNumber, String groupCode, String groupId, int groupIdType, String guid,
                       String memberId, String orgid, String originalOrgId, int prevAccountPoint, double prevAccountPrepaidMoney,
                       double prevAccountPresentMoney, String status, String terminalNumber, String tradeAddress, int tradePoint,
                       double tradeMoney, String tradeType, String tradeTypeName, int tradePresentPoint) {
        this.accountPoint = accountPoint;
        this.accountPrepaidMoney = accountPrepaidMoney;
        this.accountPresentMoney = accountPresentMoney;
        this.addTime = addTime;
        this.addUser = addUser;
        this.addUserId = addUserId;
        this.cardCode = cardCode;
        this.couponCode = couponCode;
        this.credentialNumber = credentialNumber;
        this.groupCode = groupCode;
        this.groupId = groupId;
        this.groupIdType = groupIdType;
        this.guid = guid;
        this.memberId = memberId;
        this.orgid = orgid;
        this.originalOrgId = originalOrgId;
        this.prevAccountPoint = prevAccountPoint;
        this.prevAccountPrepaidMoney = prevAccountPrepaidMoney;
        this.prevAccountPresentMoney = prevAccountPresentMoney;
        this.status = status;
        this.terminalNumber = terminalNumber;
        this.tradeAddress = tradeAddress;
        this.tradePoint = tradePoint;
        this.tradeMoney = tradeMoney;
        this.tradeType = tradeType;
        this.tradeTypeName = tradeTypeName;
        this.tradePresentPoint = tradePresentPoint;
    }

    public int getAccountPoint() {
        return accountPoint;
    }

    public void setAccountPoint(int accountPoint) {
        this.accountPoint = accountPoint;
    }

    public double getAccountPrepaidMoney() {
        return accountPrepaidMoney;
    }

    public void setAccountPrepaidMoney(double accountPrepaidMoney) {
        this.accountPrepaidMoney = accountPrepaidMoney;
    }

    public double getAccountPresentMoney() {
        return accountPresentMoney;
    }

    public void setAccountPresentMoney(double accountPresentMoney) {
        this.accountPresentMoney = accountPresentMoney;
    }

    public double getAddTime() {
        return addTime;
    }

    public void setAddTime(double addTime) {
        this.addTime = addTime;
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

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
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

    public int getGroupIdType() {
        return groupIdType;
    }

    public void setGroupIdType(int groupIdType) {
        this.groupIdType = groupIdType;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
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

    public int getPrevAccountPoint() {
        return prevAccountPoint;
    }

    public void setPrevAccountPoint(int prevAccountPoint) {
        this.prevAccountPoint = prevAccountPoint;
    }

    public double getPrevAccountPrepaidMoney() {
        return prevAccountPrepaidMoney;
    }

    public void setPrevAccountPrepaidMoney(double prevAccountPrepaidMoney) {
        this.prevAccountPrepaidMoney = prevAccountPrepaidMoney;
    }

    public double getPrevAccountPresentMoney() {
        return prevAccountPresentMoney;
    }

    public void setPrevAccountPresentMoney(double prevAccountPresentMoney) {
        this.prevAccountPresentMoney = prevAccountPresentMoney;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTerminalNumber() {
        return terminalNumber;
    }

    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    public String getTradeAddress() {
        return tradeAddress;
    }

    public void setTradeAddress(String tradeAddress) {
        this.tradeAddress = tradeAddress;
    }

    public int getTradePoint() {
        return tradePoint;
    }

    public void setTradePoint(int tradePoint) {
        this.tradePoint = tradePoint;
    }

    public double getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(double tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeTypeName() {
        return tradeTypeName;
    }

    public void setTradeTypeName(String tradeTypeName) {
        this.tradeTypeName = tradeTypeName;
    }

    public int getTradePresentPoint() {
        return tradePresentPoint;
    }

    public void setTradePresentPoint(int tradePresentPoint) {
        this.tradePresentPoint = tradePresentPoint;
    }
}
