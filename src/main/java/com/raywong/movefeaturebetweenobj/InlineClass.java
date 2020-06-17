package com.raywong.movefeaturebetweenobj;

/**
 * @Description: 将类内联化
 * @Author Ray.Wong
 * @Date 2020/6/17 19:42
 */
public class InlineClass {

 /*   class Person {
        private String name;
        private EctractClass.TelephoneNumber telephoneNumber;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public EctractClass.TelephoneNumber getTelephoneNumber() {
            return telephoneNumber;
        }

        public void setTelephoneNumber(EctractClass.TelephoneNumber telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
        }
    }

    class TelephoneNumber {

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        private String number;
        private String areaCode;

    }*/

    /**
     *  这里与提炼类是相反的操作，当一个类已经不需要的时候。将类合并，并将其抽离出项目
     */

    class Person {
        private String name;

        public String getAreaCode() {
            return telephoneNumber.getAreaCode();
        }

        public void setAreaCode(String areaCode){
            telephoneNumber.setAreaCode(areaCode);
        }

        public String getNumber() {
            return telephoneNumber.getNumber();
        }

        public void setNumber(String number) {
            telephoneNumber.setNumber(number);
        }


        private EctractClass.TelephoneNumber telephoneNumber;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public EctractClass.TelephoneNumber getTelephoneNumber() {
            return telephoneNumber;
        }

        public void setTelephoneNumber(EctractClass.TelephoneNumber telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
        }
    }

    class TelephoneNumber {

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getAreaCode() {
            return areaCode;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        private String number;
        private String areaCode;

    }


}
