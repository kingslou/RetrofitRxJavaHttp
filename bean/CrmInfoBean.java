package com.ieasy360.yunshan.app.crm.network.bean;

import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ieasy360 on 16/11/15.
 */
public class CrmInfoBean implements Serializable {


    private long addTime;//添加时间
    private String addUser;    //添加人
    private String addUserId;//	添加人ID	string
    private String cardCode;//	卡号	string
    private String cardLevelId;    //卡等级ID	string
    private String cardLevelName;//	卡等级名称	string
    private List<CardLevelRuleInfo> cardLevelRuleInfos;
    private double cardMoney;//	卡余额	number
    private int cardPoint;    //卡积分	number
    private String cardTypeId;    //卡类型ID	string
    private String cardTypeName;    //卡类型名称	string
    private boolean deleted;    //是否已经删除	boolean	0：未删除 1：删除
    private String groupCode;    //集团编码	string
    private String groupId;    //集团ID	string
    private String guid;
    private String hyBirthday;//	会员生日	number
    private String hyGuid;
    private String hyMobile;//	会员手机号	string
    private String hyName;//	会员姓名	string
    private int hySex;//	会员性别	number
    private long modTime;    //修改时间	number
    private String modUser;//	修改人	string
    private String modUserId;//	修改人ID	string
    private String orgid;//	机构ID	string
    private String originalOrgId;//	运营机构ID	string
    private boolean cardTypeIspwd; //会员卡是否需要密码
    private boolean payTypeIsJiFen;
    private String cardPassword;

    public CrmInfoBean() {
    }



    public CrmInfoBean(long addTime, String addUser, String addUserId, String cardCode, String cardLevelId, String cardLevelName,
                       List<CardLevelRuleInfo> cardLevelRuleInfos, double cardMoney, int cardPoint, String cardTypeId, String cardTypeName,
                       boolean deleted, String groupCode, String groupId, String guid, String hyBirthday, String hyGuid, String hyMobile,
                       String hyName, int hySex, long modTime, String modUser, String modUserId, String orgid, String originalOrgId,
                       boolean cardTypeIspwd, boolean payTypeIsJiFen, String cardPassword) {
        this.addTime = addTime;
        this.addUser = addUser;
        this.addUserId = addUserId;
        this.cardCode = cardCode;
        this.cardLevelId = cardLevelId;
        this.cardLevelName = cardLevelName;
        this.cardLevelRuleInfos = cardLevelRuleInfos;
        this.cardMoney = cardMoney;
        this.cardPoint = cardPoint;
        this.cardTypeId = cardTypeId;
        this.cardTypeName = cardTypeName;
        this.deleted = deleted;
        this.groupCode = groupCode;
        this.groupId = groupId;
        this.guid = guid;
        this.hyBirthday = hyBirthday;
        this.hyGuid = hyGuid;
        this.hyMobile = hyMobile;
        this.hyName = hyName;
        this.hySex = hySex;
        this.modTime = modTime;
        this.modUser = modUser;
        this.modUserId = modUserId;
        this.orgid = orgid;
        this.originalOrgId = originalOrgId;
        this.cardTypeIspwd = cardTypeIspwd;
        this.payTypeIsJiFen = payTypeIsJiFen;
        this.cardPassword  =  cardPassword;

    }

    public long getAddTime() {
        return addTime;
    }

    public void setAddTime(long addTime) {
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

    public String getCardLevelId() {
        return cardLevelId;
    }

    public void setCardLevelId(String cardLevelId) {
        this.cardLevelId = cardLevelId;
    }

    public String getCardLevelName() {
        return cardLevelName;
    }

    public void setCardLevelName(String cardLevelName) {
        this.cardLevelName = cardLevelName;
    }

    public List<CardLevelRuleInfo> getCardLevelRuleInfos() {
        return cardLevelRuleInfos;
    }

    public void setCardLevelRuleInfos(List<CardLevelRuleInfo> cardLevelRuleInfos) {
        this.cardLevelRuleInfos = cardLevelRuleInfos;
    }

    public double getCardMoney() {
        return cardMoney;
    }

    public void setCardMoney(double cardMoney) {
        this.cardMoney = cardMoney;
    }

    public int getCardPoint() {
        return cardPoint;
    }

    public void setCardPoint(int cardPoint) {
        this.cardPoint = cardPoint;
    }

    public String getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(String cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    public String getCardTypeName() {
        return cardTypeName;
    }

    public void setCardTypeName(String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
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

    public String getHyBirthday() {
        return hyBirthday;
    }

    public void setHyBirthday(String hyBirthday) {
        this.hyBirthday = hyBirthday;
    }

    public String getHyGuid() {
        return hyGuid;
    }

    public void setHyGuid(String hyGuid) {
        this.hyGuid = hyGuid;
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

    public int getHySex() {
        return hySex;
    }

    public void setHySex(int hySex) {
        this.hySex = hySex;
    }

    public long getModTime() {
        return modTime;
    }

    public void setModTime(long modTime) {
        this.modTime = modTime;
    }

    public String getModUser() {
        return modUser;
    }

    public void setModUser(String modUser) {
        this.modUser = modUser;
    }

    public String getModUserId() {
        return modUserId;
    }

    public void setModUserId(String modUserId) {
        this.modUserId = modUserId;
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

    public boolean isCardTypeIspwd() {
        return cardTypeIspwd;
    }

    public void setCardTypeIspwd(boolean cardTypeIspwd) {
        this.cardTypeIspwd = cardTypeIspwd;
    }

    public boolean isPayTypeIsJiFen() {
        return payTypeIsJiFen;
    }

    public void setPayTypeIsJiFen(boolean payTypeIsJiFen) {
        this.payTypeIsJiFen = payTypeIsJiFen;
    }
    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }
}
