package org.ziyuzile.demo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;

public class Dom4jDemo {

    public static void main(String[] args) throws DocumentException {
        String info = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Message><log><_Timestamp>2017-11-17 14:11:14.168</_Timestamp><_UserId>300032094</_UserId><_ExpId>00151072767126400000030143856280000000010020070100000000097488850</_ExpId><_PrdCode>X19903W</_PrdCode><_PrdType>1</_PrdType></log></Message>";
        Document document = DocumentHelper.parseText(info);
        Node node = document.selectSingleNode("/Message/log1");
        System.out.println(node);
    }
}