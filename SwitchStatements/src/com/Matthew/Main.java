package com.Matthew;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value = 1;

        if (value == 1){
            System.out.println("Value is 1");
        } else if (value == 2){
            System.out.println("Value is 2");
        } else {
            System.out.println("No value");
        }

        int switchVal = 5;

        switch (switchVal){
            case 1:
                System.out.println("Switch 1");
                break;

            case 2:
                System.out.println("Switch 2");
                break;

            case 3:case 4:case 5:
                System.out.println("Was a 3, 4, or 5");
                break;

            default:
                System.out.println("lol wut?");
                break;
        }

        char switchChar = 'D';

        switch (switchChar){
            case 'A':
                System.out.println("Good job, you found A");
                break;

            case 'B':
                System.out.println("Good job, you found B");
                break;

            case 'C':
                System.out.println("Good job, you found C");
                break;

            case 'D':
                System.out.println("Good job, you found D");
                break;

            case 'E':
                System.out.println("Good job, you found E");
                break;

            default:
                System.out.println("What, what did you do? Fix it!");
                break;
        }

        String switchString = "BYE";
        switch (switchString.toLowerCase()){
            case "hi":
                System.out.println("Hi");
                break;

            case "bye":
                System.out.println("Bye");
                break;

            default:
                System.out.println("Well, that was rude");
                break;
        }

    }
}
