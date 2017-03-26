package com.Matthew;

public class Main {

    public static void main(String[] args) {
        double test = calcFeetAndInchesToCentimeters(-1, 3) + calcFeetAndInchesToCentimeters(3);
        System.out.println(test);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) && (inches >= 0 && 12 >= inches )){
            return 2.54 * ((feet * 12) + inches);
        } else {
            System.out.println("You dun goofed");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double calcFeet = inches / 12;
//            System.out.println(calcFeet);
            return calcFeet;
        } else {
            System.out.println("You dun goofed");
            return -1;
        }
    }
}
