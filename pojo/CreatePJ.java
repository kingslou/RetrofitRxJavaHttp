package com.ieasy360.yunshan.app.crm.network.pojo;

/**
 * Created by hfy on 11/30/16.
 */

public class CreatePJ {
//    addGroupId	添加集团ID	string	必填
//    addGroupIdType	添加集团类型	string	必填
//    addUser	添加人	string	必填
//    addUserId	添加人ID	string	必填
//    cardAddress	发卡地点	string	一般为门店名称：orgName,必填
//    cardFee	卡费	string	如果选择的卡等级里设置了卡费，必须填写
//    cardLevelId	发卡所属的等级ID	string	必填
//    cardPassword	卡密码	string	如果选择的卡等级里设置了需有密码，必须填写
//    cardPayType	卡费付款方式ID	string	如果此卡需要卡费，必须填写
//    cardPayTypeName	卡费付款方式名称	string	如果此卡需要卡费，必须填写
//    cardTypeId	发卡所属卡类型ID	string	必填
//    groupCode	集团编码	string	必填
//    groupId	集团ID	string	必填
//    groupIdType		string	必填
//    isAnonymous	是否为无记名卡	string
//    memberBirthday	会员生日	string	如果非无记名卡，必须填写
//    memberMobile	会员手机号	string	如果非无记名卡，必须填写
//    memberName	会员姓名	string	如果非无记名卡，必须填写
//    memberSex	会员性别	string	如果非无记名卡，必须填写（0:男,1:女,2:保密）
//    orgid	机构ID	string	必填
//    originalOrgId	运营机构ID	string	必填
//    terminalNumber	发卡终端号	string

    private String addGroupId;
    private String addGroupIdType;
    private String addUser;
    private String addUserId;
    private String cardFee;
    private String cardLevelId;
    private String cardPassword;
    private String cardPayType;
    private String cardPayTypeName;
    private String cardTypeId;
    private String groupCode;
    private String groupId;
    private String groupIdType;
    private String isAnonymous;
    private String hyBirthday;
    private String hyMobile;
    private String hyName;
    private String hySex;
    private String orgid;
    private String originalOrgId;
    private String terminalNumber;
    private String orgName;
    private String cardCode;
    public CreatePJ() {
    }

    public CreatePJ(String addGroupId, String addGroupIdType, String addUser, String addUserId, String cardFee, String cardLevelId, String cardPassword, String cardPayType, String cardPayTypeName, String cardTypeId, String groupCode, String groupId, String groupIdType, String isAnonymous, String hyBirthday, String hyMobile, String hyName, String hySex, String orgid, String originalOrgId, String terminalNumber, String orgName, String cardCode) {
        this.addGroupId = addGroupId;
        this.addGroupIdType = addGroupIdType;
        this.addUser = addUser;
        this.addUserId = addUserId;
        this.cardFee = cardFee;
        this.cardLevelId = cardLevelId;
        this.cardPassword = cardPassword;
        this.cardPayType = cardPayType;
        this.cardPayTypeName = cardPayTypeName;
        this.cardTypeId = cardTypeId;
        this.groupCode = groupCode;
        this.groupId = groupId;
        this.groupIdType = groupIdType;
        this.isAnonymous = isAnonymous;
        this.hyBirthday = hyBirthday;
        this.hyMobile = hyMobile;
        this.hyName = hyName;
        this.hySex = hySex;
        this.orgid = orgid;
        this.originalOrgId = originalOrgId;
        this.terminalNumber = terminalNumber;
        this.orgName = orgName;
        this.cardCode = cardCode;
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

    public String getCardFee() {
        return cardFee;
    }

    public void setCardFee(String cardFee) {
        this.cardFee = cardFee;
    }

    public String getCardLevelId() {
        return cardLevelId;
    }

    public void setCardLevelId(String cardLevelId) {
        this.cardLevelId = cardLevelId;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    public String getCardPayType() {
        return cardPayType;
    }

    public void setCardPayType(String cardPayType) {
        this.cardPayType = cardPayType;
    }

    public String getCardPayTypeName() {
        return cardPayTypeName;
    }

    public void setCardPayTypeName(String cardPayTypeName) {
        this.cardPayTypeName = cardPayTypeName;
    }

    public String getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(String cardTypeId) {
        this.cardTypeId = cardTypeId;
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

    public String getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(String isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public String getHyBirthday() {
        return hyBirthday;
    }

    public void setHyBirthday(String hyBirthday) {
        this.hyBirthday = hyBirthday;
    }

    public String getHyMobile() {
        return hyMobile;
    }

    public void setHyMobile(String hyMobile) {
        this.hyMobile = hyMobile;
    }

    public String getHyName() {
        return hyName;
    }

    public void setHyName(String hyName) {
        this.hyName = hyName;
    }

    public String getHySex() {
        return hySex;
    }

    public void setHySex(String hySex) {
        this.hySex = hySex;
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

    public String getTerminalNumber() {
        return terminalNumber;
    }

    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }
}
