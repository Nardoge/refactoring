package com.raywong.reorganizationdata;

/**
 * @Description: 自封装字段
 * @Author Ray.Wong
 * @Date 2020/6/19 17:38
 */
public class SelfEncapsulateField {

   /* class IntRange{
        private int low,high;

        boolean include(int arg){
            return arg >= low && arg <= high;
        }

        void grow(int factor){
            high = high * factor;
        }

        public IntRange(int low, int high) {
            this.low = low;
            this.high = high;
        }
    }*/

    /**
     *  其实是最基本的封装特性，避免直接对对象的属性进行操作
     */

    class IntRange{
        private int low,high;

        boolean include(int arg){
            return arg >= getLow() && arg <= getHigh();
        }

        public int getLow() {
            return low;
        }

        public void setLow(int low) {
            this.low = low;
        }

        public int getHigh() {
            return high;
        }

        public void setHigh(int high) {
            this.high = high;
        }

        void grow(int factor){
            setHigh(getHigh() * factor);
        }

        public IntRange(int low, int high) {
            this.low = low;
            this.high = high;
        }
    }




}
