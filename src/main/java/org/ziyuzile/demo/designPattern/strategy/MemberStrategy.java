package org.ziyuzile.demo.designPattern.strategy;

/**
 * 抽象折扣类
 */
public interface MemberStrategy {

    /**
     * 计算图书的价格
     * @param bookPrice    图书的原价
     * @return    计算出打折后的价格
     */
    double calcPrice(double bookPrice);
}
