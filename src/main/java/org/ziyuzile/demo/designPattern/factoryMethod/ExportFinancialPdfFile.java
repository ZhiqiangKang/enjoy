package org.ziyuzile.demo.designPattern.factoryMethod;

/**
 * 具体导出角色类-财务Pdf
 */
public class ExportFinancialPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出财务版PDF文件");
        return false;
    }
}
