package org.ziyuzile.demo.designPattern.templateMethod;

public class Client {
    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
        account = new CertificateDepositAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
    }
}
