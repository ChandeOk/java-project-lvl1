package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    private static Engine game = new Engine();
    private static int a;
    private static int b;
    private static int getGCD() {
        int result = 1;
        if (a > b && a % b == 0) {
            return b;
        }
        while (a % b != 0) {
            result = a % b;
            a = b;
            b = result;
        }
        return result;
    }
    private static int score = 0;
    private static Scanner sc = new Scanner(System.in);
    public static void gameCondition() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }
    public static void startGCD() {
        for (int i = 0; i < game.getMaxTry(); i++) {
            a = game.getRandomNum();
            b = game.getRandomNum();
            System.out.println("Question: " + a + " " + b);
            int answer = sc.nextInt();
            int correctAnswer = getGCD();
            if (answer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("'" + answer + "'" +  "is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + game.getName());
                break;
            }
            if (score == game.getScoreToWin()) {
                System.out.println("Congratulations, " + game.getName() + "!");
            }

        }
    }
}
