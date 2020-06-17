package com.raywong.movefeaturebetweenobj;

import java.util.Date;

/**
 * @Description: TODO
 * @Author Ray.Wong
 * @Date 2020/6/17 20:18
 */
public class IntroduceLocalExtension {

    class MfDateSub extends Date{

        public MfDateSub(String s) {
            super(s);
        }

        public MfDateSub(Date arg){
            super(arg.getTime());
        }
    }
}
