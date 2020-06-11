package com.raywong.firstexample.v3;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Description 客户类
 * @Author Ray.Wong
 * @Date 2020/6/9 上午1:53
 **/
public class Customer {
    private String name;

    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRentals(Rental arg){
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement(){
        Enumeration rentalEnums = rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentalEnums.hasMoreElements()){
            Rental rental = (Rental) rentalEnums.nextElement();
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
        }
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + "frequent renter points";
        return result;
    }

    public String htmlStatement(){
        Enumeration rentalEnums = rentals.elements();
        String result = "<H1>Rental Record for <EM>" + getName() + "</EM><H1><P>\n";
        while (rentalEnums.hasMoreElements()){
            Rental rental = (Rental) rentalEnums.nextElement();
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "<BR>\n";
        }
        result += "<P>You owed is <EM>" + String.valueOf(getTotalCharge()) + "\n";
        result += "<P>You earned " + String.valueOf(getTotalFrequentRenterPoints()) + "frequent renter points</EM><P>";
        return result;
    }

    private double getTotalCharge(){
        double totalAmount = 0;
        Enumeration rentalEnums = rentals.elements();
        while (rentalEnums.hasMoreElements()){
            Rental rental = (Rental) rentalEnums.nextElement();
            totalAmount += rental.getCharge();
        }
       return totalAmount;
    }

    private int getTotalFrequentRenterPoints(){
        int frequentRenterPoints = 0;
        Enumeration rentalEnums = rentals.elements();
        while (rentalEnums.hasMoreElements()){
            Rental rental = (Rental) rentalEnums.nextElement();
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }

        return frequentRenterPoints;
    }

}
