package com.Matthew;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char burgerType = 'R';
        burgerType = 'H';

        switch (burgerType){
            case 'R':
                Regular regular = new Regular("Wheat", "Beef", "Regular",  5);
                System.out.println(regular.name);
                break;

            case 'H':
                Healthy healthy = new Healthy("Brown Rye", "Chicken", "Healthy", 7, "Onions", 1, "Pickles", 1);
                System.out.println(healthy.name);
                break;

            case 'D':
                System.out.println("Placeholder");
                break;

            default:
                System.out.println("Please select which burger you would like");
                break;
        }
    }
}
