package com.raywong.movefeaturebetweenobj;

/**
 * @Description: 引入外加函数
 * @Author Ray.Wong
 * @Date 2020/6/17 20:07
 */
public class IntroduceForeignMethod {

    /**
     * Date newStart =  new Date(previousEnd.getYear(),previousEnd.getMonth(),previousEnd.getDate() + 1);
     *
     *
     *  通过外加函数 减少对 客户类的调用时的重复代码
     *
     *  Date newStart = nextDay(previousEnd);
     *
     *  private static Date nextDay(Date arg){
     *
     *      return new Date(previousEnd.getYear(),previousEnd.getMonth(),previousEnd.getDate() + 1);
     *  }
     *
     *
     */
}
