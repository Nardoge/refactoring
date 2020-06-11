package com.raywong.organizationfunction;

/**
 * @Description: 分解临时变量
 * @Author Ray.Wong
 * @Date 2020/6/11 14:28
 */
public class SplitTemporaryVariable {

/*    public void temporaryVariable(double height ,double width){
        double temp = 2 * (height + width);
        System.out.println(temp);

        temp = height * width;
        System.out.println(temp);
    }*/


    /**
     *  我觉得这个更像是排除坏味道,这里是临时变量不应该用来承载多个作用
     *  不然是又难看，又容易错
     */


    public void temporaryVariable(double height, double width) {
        final double perimeter = 2 * (height + width);
        System.out.println(perimeter);

        final double area = height * width;
        System.out.println(area);
    }

}
