package org.ziyuzile.demo.designPattern.builder.d3;

public class Client {
    public static void main(String[] args) {
        InsuranceContract.ConcreteBuilder concreteBuilder =
                new InsuranceContract.ConcreteBuilder("contractId", 123, 456);

        InsuranceContract insuranceContract = concreteBuilder.setCompanyName("companyName").build();

        insuranceContract.someOperation();
    }
}
