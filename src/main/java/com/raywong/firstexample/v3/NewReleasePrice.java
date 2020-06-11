package com.raywong.firstexample.v3;

/**
 * @Description TODO
 * @Author Ray.Wong
 * @Date 2020/6/10 上午1:26
 **/
public class NewReleasePrice extends Price {

    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
