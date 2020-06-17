package com.raywong.movefeaturebetweenobj;

/**
 * @Description: 搬移函数
 * @Author Ray.Wong
 * @Date 2020/6/17 19:02
 */
public class MoveMethod {

/*    class AccountType{
        public boolean isPermium(){
            return false;
        }

    }*/

/*    class Account{

    private AccountType type;
    private int daysOverdrawn;

    double overdraftCharge() {
        if (type.isPermium()){
            double result = 10;
            if (daysOverdrawn > 7)
                result += (daysOverdrawn -7 ) * 0.85;
            return result;
        }
        else return daysOverdrawn * 1.75;
    }

    double bankCharge(){
        double result = 4.5;
        if (daysOverdrawn > 0 )
            result += overdraftCharge();
        return result;
    }

    }*/

    /**
     * 当有新的账户的时候，每一种都可能有自己的计费规则，所以将函数移到 AccountType 更合理
     */

    class AccountType {

        public boolean isPermium() {
            return false;
        }

        double overdraftCharge(int daysOverdrawn) {
            if (isPermium()) {
                double result = 10;
                if (daysOverdrawn > 7)
                    result += (daysOverdrawn - 7) * 0.85;
                return result;
            } else return daysOverdrawn * 1.75;
        }

    }


    class Account {

        private AccountType type;
        private int daysOverdrawn;


        double bankCharge() {
            double result = 4.5;
            if (daysOverdrawn > 0)
                result += type.overdraftCharge(daysOverdrawn);
            return result;
        }

    }
}
