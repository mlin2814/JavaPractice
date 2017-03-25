package com.Matthew;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }

        int twoScore = 10000;
        int twoLevelCompleted = 8;
        int twoBonus = 200;

        if (gameOver){
            int newFinal = twoScore + (twoLevelCompleted * twoBonus);
            System.out.println("Your second final score is: " + newFinal);
        }


    }
}
