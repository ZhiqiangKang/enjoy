package org.ziyuzile.demo.designPattern.factoryMethod;

/**
 * 抽象工厂角色
 */
public interface ExportFactory {

    ExportFile factory(String type);
}
