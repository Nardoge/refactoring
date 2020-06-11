package com.raywong.organizationfunction;

/**
 * @Description: 内联函数
 * @Author Ray.Wong
 * @Date 2020/6/11 11:44
 */
public class InlineMethod {

    private int numberOfLateDeliveries;

    /*
     public int getRating(){
        return (moreThanFiveLateDeliveries() ? 2 : 1);
    }

    private boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5 ;
    }
    */

    /**
     *  当内部代码同样清晰易读的时候，去掉函数，减少间接性
     */


    public int getRating() {
        return (numberOfLateDeliveries > 5) ? 2 : 1;
    }


}
