package com.example.hishambajunaid.canadataxcalculator;

import java.text.DecimalFormat;

public class ProvincialTaxCalculations {


    public ProvincialTaxCalculations(){

    }


    public static String newFoundlandProvincialtax(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= 36926 && income > 0){
            total = (income - 0) * 0.087 + 0;

        }else if(income <= 73852 && income > 36926){
            total = (income - 36926) * 0.145 + 3212.56;

        }else if(income <= 131850 && income > 73852){
            total = (income - 73852) * 0.158 + 8566.83;

        }else if(income <= 184590 && income > 131850){
            total = (income - 131850) * 0.173 + 17730.52;

        }else{
            total = (income - 184590) * 0.183 + 26854.54;
        }
        DecimalFormat numberformat = new DecimalFormat("#.00");
        String NFLProvtax = String.valueOf(numberformat.format(total));

        return NFLProvtax;
    }

    public static String PrinceEdwardProvincialtax(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= 31984 && income > 0){
            total = (income - 0) * 0.098 + 0;

        }else if(income <= 63969 && income > 31984){
            total = (income - 31984) * 0.138 + 3134.432;

        }else {
            total = (income - 63969) * 0.167 + 7548.362;
        }

        DecimalFormat numberformat = new DecimalFormat("#.00");
        String PrinceEProvtax = String.valueOf(numberformat.format(total));

        return PrinceEProvtax;
    }

    public static String novaScotiaProvincialtax(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= 29590 && income > 0){
            total = (income - 0) * 0.0879 + 0;

        }else if(income <= 59180 && income > 29590){
            total = (income - 29590) * 0.1495 + 2600.96;

        }else if(income <= 93000 && income > 59180){
            total = (income - 59180) * 0.1667 + 7024.66;

        }else if(income <= 150000 && income > 93000){
            total = (income - 93000) * 0.175 + 12662.46;

        }else{
            total = (income - 150000) * 0.21 + 22637.46;

        }

        DecimalFormat numberformat = new DecimalFormat("#.00");
        String NSProvtax = String.valueOf(numberformat.format(total));

        return NSProvtax;
    }

    public static String newBrunswickProvincialtax(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= 41675 && income > 0){

            total = (income - 0) * 0.0968 + 0;
        }else if(income <= 83351 && income > 41675) {
            total = (income - 41675) * 0.1482 + 4034.14;

        }else if(income <= 135510 && income > 83351){
            total = (income - 83351) * 0.1652 + 10210.52;

        }else if(income <= 154382 && income > 135510){
            total = (income - 135510) * 0.1784 + 12662.46;

        }else{
            total = (income - 154382) * 0.203 + 22637.46;

        }

        DecimalFormat numberformat = new DecimalFormat("#.00");
        String NSProvtax = String.valueOf(numberformat.format(total));

        return NSProvtax;
    }

    public static String manitobaProvincialtax(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= 31843 && income > 0){

            total = (income - 0) * 0.108 + 0;
        }else if(income <= 68821 && income > 31843) {
            total = (income - 31843) * 0.1275 + 3439.04;

        }else{
            total = (income - 68821) * 0.174 + 8153.739;

        }

        DecimalFormat numberformat = new DecimalFormat("#.00");
        String manitobaProvtax = String.valueOf(numberformat.format(total));

        return manitobaProvtax;

    }

    public static String ontarioProvincialtax(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= 42960 && income > 0){
            total = (income - 0) * 0.0505 + 0;

        }else if(income <= 85923 && income > 42960){
            total = (income - 42960) * 0.0915 + 2169.48;

        }else if(income <= 150000 && income > 85923){
            total = (income - 85923) * 0.1116 + 6100.59;

        }else if(income <= 220000 && income > 150000){
            total = (income - 150000) * 0.1216 + 13251.59;

        }else{
            total = (income - 220000) * 0.1316 + 21763.59;

        }

        DecimalFormat numberformat = new DecimalFormat("#.00");
        String ontartioProvtax = String.valueOf(numberformat.format(total));

        return ontartioProvtax;
    }

    public static String saskatchewanProvincialtax(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= 45225 && income > 0){
            total = (income - 0) * 0.105 + 0;

        }else if(income <= 129214 && income > 45225) {
            total = (income - 45225) * 0.125 + 4748.63;

        }else{
            total = (income - 129214) * 0.145 + 15247.25;

        }

        DecimalFormat numberformat = new DecimalFormat("#.00");
        String saskatchewanProvtax =  String.valueOf(numberformat.format(total));

        return saskatchewanProvtax;

    }

    public static String albertaProvincialtax(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= 128145 && income > 0){
            total = (income - 0) * 0.10 + 0;

        }else if(income <= 153773 && income > 128145){
            total = (income - 128145) * 0.12 + 12814.50;

        }else if(income <= 205031 && income > 153773){
            total = (income - 153773) * 0.13 + 15889.86;

        }else if(income <= 307547 && income > 205031){
            total = (income - 205031) * 0.14 + 22553.40;

        }else{
            total = (income - 307547) * 0.15 + 36905.64;

        }

        DecimalFormat numberformat = new DecimalFormat("#.00");
        String albertaProvtax = String.valueOf(numberformat.format(total));

        return albertaProvtax;
    }

    public static String britishColumbiaProvincialtax(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= 39678 && income > 0){
            total = (income - 0) * 0.0506 + 0;

        }else if(income <= 79353 && income > 39678){
            total = (income - 39678) * 0.077 + 2007.61;

        }else if(income <= 91107 && income > 79353){
            total = (income - 79353) * 0.105 + 5062.73;

        }else if(income <= 110630 && income > 91107){
            total = (income - 91107) * 0.1229 + 6296.28;

        }else if(income <= 150000 && income > 110630 ){
            total = (income - 110630) * 0.147 + 8696.28;

        }else{
            total = (income - 150000) * 0.168 + 14483.67;


        }

        DecimalFormat numberformat = new DecimalFormat("#.00");
        String BCProvtax = String.valueOf(numberformat.format(total));

        return BCProvtax;
    }

    public static String yukonProvincialtax(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= 46605 && income > 0){
            total = (income - 0) * 0.064 + 0;

        }else if(income <= 93208 && income > 46605){
            total = (income - 46605) * 0.09 + 2982.72;

        }else if(income <= 144489 && income > 93208){
            total = (income - 93208) * 0.109 + 7176.99;

        }else if(income <= 500000 && income > 144489){
            total = (income - 144489) * 0.128 + 12766.62;

        }else{
            total = (income - 500000) * 0.15 + 58272.03;

        }

        DecimalFormat numberformat = new DecimalFormat("#.00");
        String yukonProvtax = String.valueOf(numberformat.format(total));

        return yukonProvtax;
    }

    public static String northWestProvincialtax(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= 42209 && income > 0){
            total = (income - 0) * 0.059 + 0;

        }else if(income <= 84470 && income > 42209) {
            total = (income - 42209) * 0.086 + 2490.33;

        }else if(income <= 137248 && income > 84470){
            total = (income - 84470) * 0.122 + 6120.48;

        }else{
            total = (income - 137248) * 0.1405 + 12565.44;

        }

        DecimalFormat numberformat = new DecimalFormat("#.00");
        String NWProvtax = String.valueOf(numberformat.format(total));

        return NWProvtax;

    }

    public static String nunavutProvincialtax(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= 44437 && income > 0){
            total = (income - 0) * 0.04 + 0;

        }else if(income <= 88874 && income > 44437) {
            total = (income - 44437) * 0.07 + 1777.48;

        }else if(income <= 144488 && income > 88874){
            total = (income - 88874) * 0.09 + 4888.07;

        }else{
            total = (income - 144488) * 0.115 + 9893.33;

        }

        DecimalFormat numberformat = new DecimalFormat("#.00");
        String nunavutProvtax = String.valueOf(numberformat.format(total));

        return nunavutProvtax;

    }

    public static String quebecProvincialtax(String in){

        double income = Double.parseDouble(in);
        double total;

        if(income <= 43055 && income > 0){
            total = (income - 0) * 0.15 + 0;

        }else if(income <= 86105 && income > 43055) {
            total = (income - 43055) * 0.20 + 6458.25;

        }else if(income <= 104765 && income > 86105){
            total = (income - 86105) * 0.24 + 15068.25;

        }else{
            total = (income - 104765) * 0.2575 + 19546.65;

        }

        DecimalFormat numberformat = new DecimalFormat("#.00");
        String quebecProvtax = String.valueOf(numberformat.format(total));

        return quebecProvtax;

        }
    }

