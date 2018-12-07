package org.ziyuzile.demo;

import com.alibaba.fastjson.JSON;
import org.ziyuzile.util.DateUtil;

import java.math.BigDecimal;
import java.util.*;

public class Test {

    private static Random random = new Random();

    public static void main(String[] args) {
        dailyCount();
    }

    private static void topNFund(){
        String[] itemNames = {"华夏成长混合","易方达天天理财货币市场基金A类","南方中债中期票据指数债券型发起式证券投资基金",
                "富国宏观策略灵活配置混合型证券投资基金","易方达信用债债券型证券投资基金C类","长城久利保本混合型证券投资基金",
                "华夏沪深300指数","华夏盛世精选股票型证","华安保本混合型证券投资基金","富国信用增强债券型证券投资基金A类"};
        int[] counts = {127809, 56796, 20968, 9012, 8621, 3212, 3019, 2661, 2423, 970};

        topN(itemNames, counts);
    }

    private static void topNManageMoney(){
        String[] itemNames = {"慧财融金W201621Y133B","慧财养老无忧W201674Y132A","金鑫WU20160Y128B",
                "中国民生信托-中民永丰1号集合资金信托计划（定制187类2017年第四期）","中建投信托安泉166号（红星常州）集合资金信托计划","陆家嘴信托山水园65号集合信托计划（优先A类）",
                "陕国投大丰诚中应收账款质押贷款集合资金信托计划","山东信托长安14号集合资金信托计划","中建投信托涌泉51号(中南南通)集合资金信托计划","赢家尊崇君享WGFT17056S"};
        int[] counts = {197809, 106796, 10928, 9831, 7611, 2219, 2089, 1682, 1960, 862};

        topN(itemNames, counts);
    }

    private static void topN(String[] itemNames, int[] counts){
        List<Map<String,Object>> valueList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Map<String,Object> map = new HashMap();
            map.put("rowNumber", i + 1);
            map.put("id", i);
            map.put("name", itemNames[i]);
            map.put("count", counts[i]);
            map.put("sum", counts[i] * random.nextInt(100));
            valueList.add(map);
        }
        System.out.println(JSON.toJSONString(valueList));
    }

    private static void dailyCount(){
        List<String> valueList = new ArrayList<>();

        Calendar beginCalendar = Calendar.getInstance();
        beginCalendar.set(2016, 6, 1, 0, 0, 0);
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.set(2017, 5, 30, 0, 0, 0);

        while (beginCalendar.compareTo(endCalendar) <= 0){
            valueList.add(DateUtil.format(beginCalendar.getTime(), DateUtil.yyyyMMddWithMinusSeperated) + ":" + random.nextInt(500));
            beginCalendar.add(Calendar.DATE, 1);
        }

        Map<String, Object> valueMap = new HashMap<>();
        valueMap.put("未知", valueList);

        System.out.println(JSON.toJSONString(valueMap));
    }

    private static void dailyRate(){
        List<String> valueList = new ArrayList<>();

        Calendar beginCalendar = Calendar.getInstance();
        beginCalendar.set(2016, 6, 1, 0, 0, 0);
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.set(2017, 5, 30, 0, 0, 0);

        while (beginCalendar.compareTo(endCalendar) <= 0){
            double value = new BigDecimal(Math.random()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            valueList.add(DateUtil.format(beginCalendar.getTime(), DateUtil.yyyyMMddWithMinusSeperated) + ":" + value);
            beginCalendar.add(Calendar.DATE, 1);
        }

        Map<String, Object> valueMap = new HashMap<>();
        valueMap.put("未知", valueList);

        System.out.println(JSON.toJSONString(valueMap));
    }
}
