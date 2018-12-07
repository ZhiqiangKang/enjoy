package org.ziyuzile.demo.designPattern.templateMethod;

/**
 * 具体模板角色类-定期存款
 */
public class CertificateDepositAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Certificate Deposit";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
