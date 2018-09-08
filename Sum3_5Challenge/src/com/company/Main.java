package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        int sum = 0;
        for (int number = 1; number <= 1000; number++){
            if((number%3 == 0) && (number%5 == 0)){
             sum+=number;
             count++;
             System.out.println("Found number = " + number);
            }

            if (count == 5){
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
