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

        int altTopScore = 60;
        if (topScore > altTopScore && topScore<100)
            System.out.println("Greater than top score and less than 100");

    }
}
