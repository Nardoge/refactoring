package com.raywong.organizationfunction;

/**
 * @Description: 提炼函数
 * @Author Ray.Wong
 * @Date 2020/6/11 11:27
 */
public class ExtractMethod {



   /*
    public void printOwing(double amount){
        printBanner();

        //print detail
        System.out.println("name" + name);
        System.out.println("amount" + amount);
    }
    */

    /***
     *   将代码放进一个独立的函数，并让函数解释该函数的用途
     *   函数越小越容易复用
     *   函数即注释
     */

    public void prtintOwing(double amount){
        printBanner();
        printDetail(amount);
    }

    private void printDetail(double amount) {
        System.out.println("name" + name);
        System.out.println("amount" + amount);
    }



    /***
     *   以下为无关代码
     *
     */
    private String name;
    private double amount;


    private void printBanner() {
    }
}
