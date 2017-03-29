package com.Matthew;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10,000 at 2% interest is $" + calculateInterest(10000, 2.00));
        for (int i=2; i<9; i++){
            System.out.println("10,000 at " + i + "% interest is $" + calculateInterest(10000, i));
        }

        for (int i=8; i>1; i--){
            System.out.println("10,000 at " + i + "% interest is $" + calculateInterest(10000, i));
        }

        int count = 0;
        for (int n=200; n<270; n++){
            if (isPrime(n)){
                count++;
                System.out.println(n + " is a prime number");
                if (count == 3){
                    break;
                }
            }
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }

        for (int i=2; i<= n/2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
