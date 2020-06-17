package com.raywong.movefeaturebetweenobj;

/**
 * @Description: 提炼类
 * @Author Ray.Wong
 * @Date 2020/6/17 19:30
 */
public class EctractClass {

/*    class Person{

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOfficeAreaCode() {
            return officeAreaCode;
        }

        public void setOfficeAreaCode(String officeAreaCode) {
            this.officeAreaCode = officeAreaCode;
        }

        public String getOfficeNumber() {
            return officeNumber;
        }

        public void setOfficeNumber(String officeNumber) {
            this.officeNumber = officeNumber;
        }

        private String name;
        private String officeAreaCode;
        private String officeNumber;
    }*/

    /**
     *  明显这里把电话号码的信息放在 Person 是不合理的，随着系统的不断迭代。我们会发现一些属性与行为可以分离都其它类中
     *  此时就需要提炼新的类
     */

    class Person {
        private String name;
        private TelephoneNumber telephoneNumber;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public TelephoneNumber getTelephoneNumber() {
            return telephoneNumber;
        }

        public void setTelephoneNumber(TelephoneNumber telephoneNumber) {
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
