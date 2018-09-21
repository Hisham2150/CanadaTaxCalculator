package com.example.hishambajunaid.canadataxcalculator;

import java.text.DecimalFormat;

public class CPP_QPP_EI {

    private static final double EIpremiumrate = 0.0166, maxInsurableEarnings = 51700, anualBasicExemption = 3500;
    public CPP_QPP_EI(){

    }

    public static double calculateCPP(String in){

        double income = Double.parseDouble(in);


        double CPPtotal = Math.min(((income - anualBasicExemption) * 0.0495) , 2593.80);



        return CPPtotal;
    }

    public static double calculateEI(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= maxInsurableEarnings && income > 0){
            total = income * EIpremiumrate;

        }else{
            total = maxInsurableEarnings * EIpremiumrate;
        }


        return total;
    }

    public static String CPP_EICalc(String in){

        double total = calculateCPP(in) + calculateEI(in);

        DecimalFormat numberformat = new DecimalFormat("#.00");

        String totalstring = String.valueOf(numberformat.format(total));

        return totalstring;
    }

    public static double calculateQPP(String in){

        double income = Double.parseDouble(in);

        double QPPtotal = Math.min(((income - anualBasicExemption) * 0.0540) , 2829.60);



        return QPPtotal;

    }

    public static String QPP_EICalc(String in){

        double total = calculateQPP(in) + calculateEI(in);

        DecimalFormat numberformat = new DecimalFormat("#.00");

        String totalstring = String.valueOf(numberformat.format(total));

        return totalstring;
    }

}
