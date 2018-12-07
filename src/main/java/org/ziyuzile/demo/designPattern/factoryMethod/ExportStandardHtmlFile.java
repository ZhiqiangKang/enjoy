package org.ziyuzile.demo.designPattern.factoryMethod;

/**
 * 具体导出角色类-标准Html
 */
public class ExportStandardHtmlFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出标准版HTML文件");
        return false;
    }
}
