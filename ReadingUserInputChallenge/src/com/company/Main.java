package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amount = 0;
        int sum = 0;



        while (amount < 10) {
            int order = amount + 1;
            System.out.println("Enter number #" + order);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                //            while (amount <= 10){
                int userInput = scanner.nextInt();
                sum += userInput;
                System.out.println(sum);
                amount++;
//                System.out.println(amount);
//                System.out.println("Enter number #" + amount);
            } else {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("Your total sum is " + sum);

        scanner.close();
 }
}

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if (hasNextInt){
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2018 - yearOfBirth;
//
//            if (age >= 0 && age<= 100){
//                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
//            } else {
//                System.out.println("Invalid Year of Birth");
//            }
//        } else {
//            System.out.println("Unable to parse year of birth");
//        }
//
//        scanner.close();

//        two variables, one to track amount of numbers input, another to track sum
//        while the count is 10 or less, continue, then break after 10
//        logic: have the input added to original sum +=