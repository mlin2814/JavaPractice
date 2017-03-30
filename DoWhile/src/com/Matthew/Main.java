package com.Matthew;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int count = 0;
//        while (count != 5){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 0;
//        while (true){
//            if (count == 5){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 5);
        int num = 5;
        int finNum = 20;
        int countEven = 0;
        while (num <= finNum){
            if (!isEvenNumber(num)){
                num++;
                countEven++;
                continue;
            }
            System.out.println(num + " is an even number");
            num++;

            if (countEven == 5){
                System.out.println("There are " + countEven + " even numbers in this range." );
                break;
            }
        }
    }


    public static boolean isEvenNumber(int num){
        if ((num % 2) == 0){
            return true;
        } else {
            return false;
        }
    }
}
