package com.raywong.organizationfunction;

/**
 * @Description: 以函数对象
 * @Author Ray.Wong
 * @Date 2020/6/11 15:10
 */
public class ReplaceMethodWithMethodObject {
    class Account{
       /* int gamma(int inputVal,int quantity, int yearToDate){
            int importantValue1 = (inputVal * quantity) + delta();
            int importantValue2 = (inputVal * yearToDate) + 100;
            if ((yearToDate - importantValue1) > 100) {
                importantValue2 -= 20;
            }

            int importantValue3 = importantValue2 * 7;

            return  importantValue3 - 2 * importantValue1;
        }*/

        private int delta() {
            return  0 ;
        }
    }

    /**
     *    构建新的类 Gamma ，将原函数的逻辑放到 Gamma 的 compute方法中,
     *    随后即可在 Gamma 类中进行方法的抽取，不用去参数的传递问题
     */

    class Gamma{
        private final  Account account;
        private int inputVal;
        private int quantity;
        private int yearToDate;
        private int importantValue1;
        private int importantValue2;
        private int importantValue3;

        public Gamma(Account account, int inputVal, int quantity, int yearToDate) {
            this.account = account;
            this.inputVal = inputVal;
            this.quantity = quantity;
            this.yearToDate = yearToDate;
        }

        int compute(){
            int importantValue1 = (inputVal * quantity) + account.delta();
            int importantValue2 = (inputVal * yearToDate) + 100;
              importThing();

            int importtantValue3 = importantValue2 * 7;

            return  importtantValue3 - 2 * importantValue1;
        }

        private void importThing() {
            if ((yearToDate - importantValue1) > 100) {
                importantValue2 -= 20;
            }
        }
    }
}
