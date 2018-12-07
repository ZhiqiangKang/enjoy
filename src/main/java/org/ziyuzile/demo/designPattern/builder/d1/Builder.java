package org.ziyuzile.demo.designPattern.builder.d1;

/**
 * 抽象建造者类Builder
 */
public interface Builder {

    void buildPart1();

    void buildPart2();

    Product retrieveResult();
}
