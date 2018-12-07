package org.ziyuzile.demo.designPattern.templateMethod;

/**
 * 具体模板角色类-货币市场
 */
public class MoneyMarketAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Money Marker";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045;
    }
}
