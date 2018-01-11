package com.ieasy360.yunshan.app.crm.network.bean;

/**
 * Created by lyf on 2017/1/4.
 */

public class TopupBean {
    private long points;			//现账户积分
    private long prepaidBalance;		//	现账户余额
//    private long presentBalance;		//	现账户赠送余额

    public TopupBean(long points, long prepaidBalance) {
        this.points = points;
        this.prepaidBalance = prepaidBalance;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public long getPrepaidBalance() {
        return prepaidBalance;
    }

    public void setPrepaidBalance(long prepaidBalance) {
        this.prepaidBalance = prepaidBalance;
    }

}
