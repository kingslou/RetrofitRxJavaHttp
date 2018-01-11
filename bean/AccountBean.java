package com.ieasy360.yunshan.app.crm.network.bean;

/**
 * Created by hfy on 11/16/16.
 */
public class AccountBean {
    private String guid;
    private String groupId;
    private String groupCode;
    private String orgid;
    private String orgNo;
    private String orgName;
    private String userId;
    private String userName;
    private String loginName;
    private String password;
    private String deptId;
    private String deptNo;
    private String deptName;
    private String parentOrgId;

    private String originalOrgId;
    private String groupIdType;
    private String addGroupId;
    private String addGroupIdType;
    private String addUserId;
    private String addUser;
    private String modUserId;
    private String modUser;

    public AccountBean() {

    }

    public AccountBean(String guid, String groupId, String groupCode, String orgid, String orgNo, String orgName,
                       String userId, String userName, String loginName, String password,
                       String deptId, String deptNo, String deptName, String parentOrgId,
                       String originalOrgId, String groupIdType, String addGroupId, String addGroupIdType,
                       String addUserId, String addUser, String modUserId, String modUser) {
        this.guid = guid;
        this.groupId = groupId;
        this.groupCode = groupCode;
        this.orgid = orgid;
        this.orgNo = orgNo;
        this.orgName = orgName;
        this.userId = userId;
        this.userName = userName;
        this.loginName = loginName;
        this.password = password;
        this.deptId = deptId;
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.parentOrgId = parentOrgId;

        this.originalOrgId = originalOrgId;
        this.groupIdType = groupIdType;
        this.addGroupId = addGroupId;
        this.addGroupIdType = addGroupIdType;
        this.addUserId = addUserId;
        this.addUser = addUser;
        this.modUserId = modUserId;
        this.modUser = modUser;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public void setParentOrgId(String parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAddGroupId(String addGroupId) {
        this.addGroupId = addGroupId;
    }

    public void setAddGroupIdType(String addGroupIdType) {
        this.addGroupIdType = addGroupIdType;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    public void setGroupIdType(String groupIdType) {
        this.groupIdType = groupIdType;
    }

    public void setModUser(String modUser) {
        this.modUser = modUser;
    }

    public void setModUserId(String modUserId) {
        this.modUserId = modUserId;
    }

    public void setOriginalOrgId(String originalOrgId) {
        this.originalOrgId = originalOrgId;
    }

    public String getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getDeptNo() {
        return deptNo;
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

    public String getLoginName() {
        return loginName;
    }

    public String getOrgid() {
        return orgid;
    }

    public String getOrgName() {
        return orgName;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public String getParentOrgId() {
        return parentOrgId;
    }

    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddGroupId() {
        return addGroupId;
    }

    public String getAddGroupIdType() {
        return addGroupIdType;
    }

    public String getAddUser() {
        return addUser;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public String getGroupIdType() {
        return groupIdType;
    }

    public String getModUser() {
        return modUser;
    }

    public String getModUserId() {
        return modUserId;
    }

    public String getOriginalOrgId() {
        return originalOrgId;
    }

//    @Override
//    public String toString() {
//        return "guid: " + guid + ", groupId: " + groupId + ", groupCode: " + groupCode +
//                ", orgid: " + orgid + ", orgNo: " + orgNo + ", orgName: " + orgName +
//                ", userId: " + userId + ", userName: " + userName +", loginName: " + loginName + ", password: " + password +
//                ", deptId: " + deptId + ", deptNo: " + deptNo + ", deptName: " + deptName + ", parentOrgId: " + parentOrgId;
//    }
}
