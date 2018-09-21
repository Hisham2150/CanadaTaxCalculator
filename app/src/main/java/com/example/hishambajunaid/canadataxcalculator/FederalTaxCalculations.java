package com.example.hishambajunaid.canadataxcalculator;

import java.text.DecimalFormat;

public class FederalTaxCalculations {

    private final static double firstfedtaxrate = 0.15, secondfedtaxrate = 0.205, thirdfedtaxrate = 0.26, fourthfedtaxrate = 0.29, fifthfedtaxrate = 0.33;
    private final static double firstbaseamount = 0, secondbaseamount = 6991, thirdbaseamount = 16544, fourthbasamount = 29811, fifthbaseamount = 47670;


    public FederalTaxCalculations() {

    }


    public static String Federaltaxcalc(String in) {

        Double income = Double.parseDouble(in);
        double total;

        if (income < 46605) {

            total = ((income - 0) * firstfedtaxrate) + firstbaseamount;

        } else if (income > 46605 && income <= 93208) {

            total = ((income - 46605) * secondfedtaxrate) + secondbaseamount;

        } else if (income > 93208 && income <= 144489) {

            total = ((income - 93208) * thirdfedtaxrate) + thirdbaseamount;

        } else if (income > 144489 && income <= 205842) {

            total = ((income - 144489) * fourthfedtaxrate) + fourthbasamount;

        } else {

            total = ((income - 205842) * fifthfedtaxrate) + fifthbaseamount;

        }

        DecimalFormat numberformat = new DecimalFormat("#.00");

        String totalfedtaxString = String.valueOf(numberformat.format(total));

        return totalfedtaxString;
    }


}



