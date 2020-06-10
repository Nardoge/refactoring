package com.raywong.v3;

/**
 * @Description TODO
 * @Author Ray.Wong
 * @Date 2020/6/10 上午1:17
 **/
public class ChildrenPrice extends Price {

    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    double getCharge(int daysRented) {
        double result =  1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}
