package com.raywong.movefeaturebetweenobj;

import java.util.Date;

/**
 * @Description: 引入本地扩展
 * @Author Ray.Wong
 * @Date 2020/6/17 20:18
 */
public class IntroduceLocalExtension {

    /**
     * 使用子类进行扩展 或者也可以使用包装类
     */

    class MfDateSub extends Date{

        public MfDateSub(String s) {
            super(s);
        }

        public MfDateSub(Date arg){
            super(arg.getTime());
        }
    }
}
