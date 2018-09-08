package com.Matthew;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//        You can assign a variable to a method result as seen below
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The high score is " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("The high score is " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Joe", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Mike", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Peter", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Kevin", highScorePosition);
    }

    public static void displayHighScorePosition (String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){

//        if (playerScore >= 1000){
//            return 1;
//        } else if (playerScore >= 500 && playerScore < 1000){
//            return 2;
//        } else if (playerScore >= 100 && playerScore < 500){
//            return 3;
//        }
//// else {
////            return 4;
////        }
//        return 4;

        //alt method
        int position = 4;

        if(playerScore >= 1000){
            position = 1;
        } else if (playerScore >=500){
            position = 2;
        } else if (playerScore >=100); {
            position = 3;
        }

        return position;

    }

//    public static void main(String[] args) {
//        int playerScore = 1000;
//        int playerPosition = calculateHighScore(playerScore);
//        System.out.println("The player with score " + playerScore + " is in position " + playerPosition);
//
//        playerScore = 900;
//        playerPosition = calculateHighScore(playerScore);
//        System.out.println("The player with score " + playerScore + " is in position " + playerPosition);
//
//        playerScore = 400;
//        playerPosition = calculateHighScore(playerScore);
//        System.out.println("The player with score " + playerScore + " is in position " + playerPosition);
//
//        playerScore = 50;
//        playerPosition = calculateHighScore(playerScore);
//        System.out.println("The player with score " + playerScore + " is in position " + playerPosition);
//    }
//
//    public static int calculateHighScore(int playerScore){
//
//        if (playerScore >= 1000){
//            int position = 1;
//            return position;
//        } else if (playerScore >= 500 && playerScore < 1000){
//            int position = 2;
//            return position;
//        } else if (playerScore >= 100 && playerScore < 500){
//            int position = 3;
//            return position;
//        } else {
//            int position = 4;
//            return position;
//        }
//    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
//            System.out.println("Your final score is: " + finalScore);
            return finalScore;
        }
        else {
            return -1;
        }
    }
}
