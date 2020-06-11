/**
 * @Description:  本次涉及到的重构改动包括:
 *                   1. 抽取switch作为一个独立的方法，避免臃肿的代码
 *                   2. 将each的命名转为 rental ，命名更有意义
 *                   还有老马的名言:任何一个傻瓜都能写出计算机可以理解的代码，唯独写出人类容易理解的代码，才是优秀的程序员。
 *                   3.移动方法，idea 还有快捷键，赞。
 *                   4.减少临时变量
 *                   5.抽取计算积分的方法到 Rental 类
 *                   6.减少了临时变量,通过抽取方法
 * @Author Ray.Wong
 * @Date 2020/6/9 18:46
 */
package com.raywong.firstexample.v2;