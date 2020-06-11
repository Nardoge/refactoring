package com.raywong.firstexample.v3;

/**
 * @Description TODO
 * @Author Ray.Wong
 * @Date 2020/6/10 上午1:30
 **/
public class RegularPrice extends Price {
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}
