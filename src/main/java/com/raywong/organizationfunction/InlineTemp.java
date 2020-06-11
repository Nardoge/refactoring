package com.raywong.organizationfunction;

/**
 * @Description: 内联临时变量
 * @Author Ray.Wong
 * @Date 2020/6/11 11:57
 */
public class InlineTemp {


    class Order{
        private double basePrice;
    }


/*    public  boolean isVIP(){
        Order anOrder = new Order();
        double basePrice = anOrder.basePrice;
        return (basePrice > 1000);
    }*/

    /**
     *  这个其实就是减少临时变量，不过也给出了一些实际的操作方法
     *  确定临时变量的赋值右边有没有副作用
     *  通过添加 final 来判断
     *
     */

    public  boolean isVIP(){
        Order anOrder = new Order();
        return (anOrder.basePrice > 1000);
    }
}

