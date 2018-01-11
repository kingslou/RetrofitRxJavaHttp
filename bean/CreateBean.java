package com.ieasy360.yunshan.app.crm.network.bean;

/**
 * Created by hfy on 11/30/16.
 */

public class CreateBean {
//    addTime	添加时间	number
//    addUser	添加人	string
//    addUserId	添加人ID	string
//    cardCode	卡号	string
//    cardLevelId	卡等级ID	string
//    cardLevelName	卡等级名称	string
//    cardMoney	账户余额	number
//    cardPoint	账户积分	number
//    cardTypeId	卡类型ID	string
//    cardTypeName	卡类型名称	string
//    groupCode	集团编码	string
//    groupId	集团ID	string
//    guid	卡ID	string
//    memberBirthday	会员生日	number	如果是无记名卡，返回为空
//    memberGuid	会员ID	string	如果是无记名卡，返回为空
//    memberMobile	会员手机号	string	如果是无记名卡，返回为空
//    memberName	会员名称	string	如果是无记名卡，返回为空
//    memberSex	会员性别	number	如果是无记名卡，返回为空（0:男,1:女,2:保密）
//    orgid	机构ID	string
//    originalOrgId	运营机构ID	string

    private long addTime;
    private String addUser;
    private String addUserId;
    private String cardCode;
    private String cardLevelId;
    private String cardLevelName;
    private double cardMoney;
    private int cardPoint;
    private String cardTypeId;
    private String cardTypeName;
    private String groupCode;
    private String groupId;
    private String guid;
    private long memberBirthday;
    private String memberGuid;
    private String memberMobile;
    private String memberName;
    private int memberSex;
    private String orgid;
    private String originalOrgId;

    public String getMemberGuid() {
        return memberGuid;
    }

    public String getCardCode() {
        return cardCode;
    }

    public double getCardMoney() {
        return cardMoney;
    }

    public int getCardPoint() {
        return cardPoint;
    }

    public int getMemberSex() {
        return memberSex;
    }

    public long getAddTime() {
        return addTime;
    }

    public long getMemberBirthday() {
        return memberBirthday;
    }

    public String getAddUser() {
        return addUser;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public String getCardLevelId() {
        return cardLevelId;
    }

    public String getCardLevelName() {
        return cardLevelName;
    }

    public String getCardTypeId() {
        return cardTypeId;
    }

    public String getCardTypeName() {
        return cardTypeName;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getGuid() {
        return guid;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getOrgid() {
        return orgid;
    }

    public String getOriginalOrgId() {
        return originalOrgId;
    }
}
