package com.ieasy360.yunshan.app.crm.network.bean;

/**
 * Created by hfy on 11/25/16.
 */

public class Voucher {
    private String code; // 凭据号
    private String cardCode; // 卡号
    private String name; // 会员名称
    private double consume; // 储值消费
    private double balance; // 账户余额
    private int consumePoint; // 积分消费
    private int balancePoint; // 剩余积分
    private String store; // 消费门店
    private String operator; // 操作员
    private String printTime; // 打印时间

    public Voucher() {

    }

    public Voucher(String code, String cardCode, String name, double consume, double balance,
                   int consumePoint, int balancePoint, String store, String operator, String printTime) {
        this.code = code;
        this.cardCode = cardCode;
        this.name = name;
        this.consume = consume;
        this.balance = balance;
        this.consumePoint = consumePoint;
        this.balancePoint = balancePoint;
        this.store = store;
        this.operator = operator;
        this.printTime = printTime;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBalancePoint(int balancePoint) {
        this.balancePoint = balancePoint;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setConsume(double consume) {
        this.consume = consume;
    }

    public void setConsumePoint(int consumePoint) {
        this.consumePoint = consumePoint;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setPrintTime(String printTime) {
        this.printTime = printTime;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public double getBalance() {
        return balance;
    }

    public double getConsume() {
        return consume;
    }

    public int getBalancePoint() {
        return balancePoint;
    }

    public int getConsumePoint() {
        return consumePoint;
    }

    public String getCardCode() {
        return cardCode;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getOperator() {
        return operator;
    }

    public String getPrintTime() {
        return printTime;
    }

    public String getStore() {
        return store;
    }
}
