package org.ziyuzile.demo.designPattern.simpleFactory;

public class DomainLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        return true;
    }
}
