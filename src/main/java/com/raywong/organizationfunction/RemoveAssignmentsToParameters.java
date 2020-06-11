package com.raywong.organizationfunction;

/**
 * @Description: 移除对参数的赋值
 * @Author Ray.Wong
 * @Date 2020/6/11 14:56
 */
public class RemoveAssignmentsToParameters {

/*
    public int dicount(int inputVal, int quantity, int yearToDate){
        if (inputVal > 50) inputVal -= 2;
        if (quantity > 100) inputVal -= 1;
        if (yearToDate > 10000) inputVal -= 4;
        return inputVal;
    }
*/
    /**
     *
     */


    public int dicount(final int inputVal,final int quantity,final int yearToDate){
        int result = inputVal;
        if (inputVal > 50) result -= 2;
        if (quantity > 100) result -= 1;
        if (yearToDate > 10000) result -= 4;
        return result;
    }



}
