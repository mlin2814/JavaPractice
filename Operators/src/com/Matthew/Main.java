package com.Matthew;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;

	    int previousResult = result;
	    result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result++;
        System.out.println(previousResult + " + 1 = " + result);
        previousResult = result;
        result--;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result+= 2;
        System.out.println(previousResult + " + 2 = " + result);

        previousResult = result;
        result*=10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result -= 10;
        System.out.println("Result = " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("Top Score!");

        int altTopScore = 81;
        if ((topScore > altTopScore) && (topScore<100))
            System.out.println("Greater than top score and less than 100");

        if((topScore > 90) || (altTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("All good!");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("Wrong!");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
        System.out.println("Is true");

        double firstVal = 20d;
        double secondVal = 80d;

        double total = (firstVal + secondVal) * 25;
        System.out.println(total);

        double total = total % 40;
        System.out.println(total);

        if (total<= 20)
            System.out.println("Total was over the limit");


    }
}
