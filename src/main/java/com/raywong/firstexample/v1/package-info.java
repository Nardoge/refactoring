/**
 * @Description: 重构的第一个案例,用最原始的方式去实现相关功能
 *           问题如下： 1.Customer类承担了非自己的责任 ,statement 方法来计算费用。
 *                     2.statement方法不能适应需求的变更，如果变成html会很困难，可能需要copy一个 htmlStatement方法
 *                     3.当计费调整的时候怎样办？因为到处copy的问题也会导致很容易出错。
 *
 * @Author Ray.Wong
 * @Date 2020/6/9 11:20
 */
package com.raywong.firstexample.v1;