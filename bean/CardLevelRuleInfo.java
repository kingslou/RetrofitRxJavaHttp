package com.ieasy360.yunshan.app.crm.network.bean;

/**
 * Created by hfy on 11/21/16.
 */

public class CardLevelRuleInfo {
    private String ruleConditionValue;
    private String ruleDesc;
    private String ruleManualInput;
    private String ruleResultValue;
    private String ruleSubType;
    private String ruleSubTypeNum;
    private String ruleType;

    public CardLevelRuleInfo(String ruleConditionValue, String ruleDesc, String ruleManualInput,
                             String ruleResultValue, String ruleSubType, String ruleSubTypeNum, String ruleType) {
        this.ruleConditionValue = ruleConditionValue;
        this.ruleDesc = ruleDesc;
        this.ruleManualInput = ruleManualInput;
        this.ruleResultValue = ruleResultValue;
        this.ruleSubType = ruleSubType;
        this.ruleSubTypeNum = ruleSubTypeNum;
        this.ruleType = ruleType;
    }

    public void setRuleConditionValue(String ruleConditionValue) {
        this.ruleConditionValue = ruleConditionValue;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public void setRuleManualInput(String ruleManualInput) {
        this.ruleManualInput = ruleManualInput;
    }

    public void setRuleResultValue(String ruleResultValue) {
        this.ruleResultValue = ruleResultValue;
    }

    public void setRuleSubType(String ruleSubType) {
        this.ruleSubType = ruleSubType;
    }

    public void setRuleSubTypeNum(String ruleSubTypeNum) {
        this.ruleSubTypeNum = ruleSubTypeNum;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public String getRuleConditionValue() {
        return ruleConditionValue;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public String getRuleManualInput() {
        return ruleManualInput;
    }

    public String getRuleResultValue() {
        return ruleResultValue;
    }

    public String getRuleSubType() {
        return ruleSubType;
    }

    public String getRuleSubTypeNum() {
        return ruleSubTypeNum;
    }

    public String getRuleType() {
        return ruleType;
    }
}