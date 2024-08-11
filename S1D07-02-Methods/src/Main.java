public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got Here");
        }

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

        int birthYear = 1981;
        int myAge = calculateMyAge(birthYear);
        System.out.println("Your age is " + myAge);


    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateMyAge(int dateOfBirth) {
        return (2024 - dateOfBirth);
    }

    public static boolean isTooYoung(int age) {
        boolean result = false;
        if (age < 21) {
            result = true;
        }
        return result;
    }

    public static int isTooYoung(int age, int somethingElse) {
        return 0;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        } else if(score >= 500 && score < 1000){
            return 2;
        } else if(score >= 100 && score < 500){
            return 3;
        }else{
            return 4;
        }
    }
}
