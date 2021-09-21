package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        String playersName = "Jack";
        int position = 10;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final Score was " + highScore);
        displayHighScorePosition(playersName, position);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final Score was " + highScore);

        highScore = calculateHighScorePosition(1500);
        System.out.println("Player scored: " + highScore);
        highScore = calculateHighScorePosition(900);
        System.out.println("Player scored: " + highScore);
        highScore = calculateHighScorePosition(400);
        System.out.println("Player scored: " + highScore);
        highScore = calculateHighScorePosition(50);
        System.out.println("Player scored: " + highScore);
    }



    // create a method called displayHighScorePosition
    // it should take a players name as a parameter, and a 2nd parameter as a position in the high score table
    public static void displayHighScorePosition(String playersName, int position){
        // you shuld display the palyers name along with the message like "Mangaed to get into position " and the position they got and a further message " on the high score table".
        System.out.println(playersName + " managed to get into position " + position + " on the high score table.");
    }
    // create a 2nd method called high...
    // if should hake one arg, the player score
    // it should return an int
    public static int calculateHighScorePosition(int score){
        // the return data should be
        if(score >= 1000){
            return 1;
        } else if (score >= 500){
            return 2;
        } else if (score >= 100){
            return 3;
        }
        return 4;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
