package com.ieasy360.yunshan.app.crm.network.pojo;

/**
 * Created by ieasy360 on 16/11/21.
 */

public class InitPJ {
    //?groupId=" + $scope.groupID + "&orgId=" + $scope.storeID + "&groupCode=" + $scope.groupCode
    private String groupId;
    private String guid;

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



    public InitPJ(String groupId, String guid) {

        this.groupId = groupId;
        this.guid = guid;
    }
}
