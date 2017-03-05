package com.company;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int myIntValue = 200_000;
        System.out.println("myIntValue = " + myIntValue);

        //byte has a width of 8
        byte myByteValue = 120;
        System.out.println("myByteValue = " + myByteValue);

        //short has a width of 16
        short myShortValue = 300;
        System.out.println("myShortValue = " + myShortValue);

        //long has a width of 64
        long myLongValue = 50000L + (10 * myByteValue) + myIntValue + myShortValue;
        System.out.println("myLongValue = " + myLongValue);

    }
}
