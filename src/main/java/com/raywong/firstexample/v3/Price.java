package com.raywong.firstexample.v3;

/**
 * @Description TODO
 * @Author Ray.Wong
 * @Date 2020/6/10 上午1:15
 **/
public abstract class Price {

    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
