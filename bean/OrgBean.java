package com.ieasy360.yunshan.app.crm.network.bean;

/**
 * Created by ieasy360 on 16/11/21.
 */

public class OrgBean {

    private String hyOrigin;
    private String addUserId;
    private String addUser;

    public String getHyOrigin() {
        return hyOrigin;
    }

    public void setHyOrigin(String hyOrigin) {
        this.hyOrigin = hyOrigin;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    public String getAddUser() {
        return addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public OrgBean(String hyOrigin, String addUserId, String addUser) {

        this.hyOrigin = hyOrigin;
        this.addUserId = addUserId;
        this.addUser = addUser;
    }
}
