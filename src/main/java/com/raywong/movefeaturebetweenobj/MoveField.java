package com.raywong.movefeaturebetweenobj;

/**
 * @Description: 搬移字段
 * @Author Ray.Wong
 * @Date 2020/6/17 19:13
 */
public class MoveField {

   /* class Account{
        private AccountType type;
        private double interestRate;

        double interestForAmountDays(double amount, int days){
            return interestRate * amount * days /365;
        }

    }

    class AccountType{

    }
*/

    /**
     * AccountType 比起 Account 类更多函数使用 interestRate ，所以移动字段
     */

    class Account {
        private AccountType type;

        double interestForAmountDays(double amount, int days) {
            return type.getInterestRate() * amount * days / 365;
        }

    }

    class AccountType {
        private double interestRate;

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }
    }

}
