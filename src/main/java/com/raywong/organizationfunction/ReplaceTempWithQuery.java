package com.raywong.organizationfunction;

/**
 * @Description: 查询取代临时变量
 * @Author Ray.Wong
 * @Date 2020/6/11 13:40
 */
public class ReplaceTempWithQuery {

    private double quantity;
    private double itemPrice;

/*    public double getPrice() {
        double basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }*/

    /**
     *   使用查询替换临时变量，可以让代码更复用
     *
     */

    public double getPrice() {
        if (basePrice() > 1000) {
            return basePrice() * 0.95;
        } else {
            return basePrice() * 0.98;
        }
    }

    private double basePrice() {
        return quantity * itemPrice;
    }

}
