package org.ziyuzile.demo.designPattern.factoryMethod;

/**
 * 具体工厂角色-导出HTML格式
 */
public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if ("standard".equals(type)) {

            return new ExportStandardHtmlFile();

        } else if ("financial".equals(type)) {

            return new ExportFinancialHtmlFile();

        } else {
            throw new RuntimeException("没有找到对象");
        }
    }
}
