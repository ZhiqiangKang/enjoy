package org.ziyuzile.demo.designPattern.simpleFactory;

public interface Login {

    // 登录验证
    boolean verify(String name, String password);
}
