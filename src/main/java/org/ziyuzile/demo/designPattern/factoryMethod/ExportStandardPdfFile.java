package org.ziyuzile.demo.designPattern.factoryMethod;

/**
 * 具体导出角色类-标准Pdf
 */
public class ExportStandardPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出标准版PDF文件");
        return false;
    }
}
