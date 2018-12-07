package org.ziyuzile.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;

public class DateUtil {

    public static final String yyyyMMdd = "yyyyMMdd";
    public static final String yyyyMMddWithMinusSeperated = "yyyy-MM-dd";
    public static final String yyyyMMddWithSlashSeperated = "yyyy/MM/dd";
    public static final String HHmmss = "HHmmss";
    public static final String HHmmssWithColonSeperated = "HH:mm:ss";
    public static final String yyyyMMddWithMinusSeperatedAndHHmmssWithColonSeperated = "yyyy-MM-dd HH:mm:ss";
    public static final String HHmmssSSS = "HHmmssSSS";
    public static final String HHmmssSSSWithColonSeperated = "HH:mm:ss.SSS";
    public static final String yyyyMMddWithMinusSeperatedAndHHmmssSSSWithColonSeperated = "yyyy-MM-dd HH:mm:ss.SSS";

    private static final String[] patterns = {
            yyyyMMdd,
            yyyyMMddWithMinusSeperated,
            yyyyMMddWithSlashSeperated,
            HHmmss,
            HHmmssWithColonSeperated,
            yyyyMMddWithMinusSeperatedAndHHmmssWithColonSeperated,
            HHmmssSSS,
            HHmmssSSSWithColonSeperated,
            yyyyMMddWithMinusSeperatedAndHHmmssSSSWithColonSeperated
    };

    public static String format(Date date, String pattern){
        return DateFormatUtils.format(date, pattern);
    }

    public static Date now(){
        return new Date();
    }

    public static Date parse(String str) throws ParseException {
        return DateUtils.parseDate(str, patterns);
    }

    public static Date parse(String str, String pattern) throws ParseException {
        return DateUtils.parseDate(str, pattern);
    }
}
