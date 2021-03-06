package com.raywong.firstexample.v1;

/**
 * @Description 租赁
 * @Author Ray.Wong
 * @Date 2020/6/9 上午1:51
 **/
public class Rental {
    private Movie movie;

    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}
