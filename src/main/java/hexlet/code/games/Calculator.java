package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calculator {
    private static Engine game = new Engine();
    private static int a;
    private static int b;
    private static int score = 0;
    private static Scanner sc = new Scanner(System.in);
    public static void gameCondition() {
        System.out.println("What is the result of the expression?");
    }
    private static String question() {
        final int max = 3;
        int j = (int) (Math.random() * max);
        String stringExpression = "";
        switch (j) {
            case 0: stringExpression = a + "*" + b; break;
            case 1: stringExpression = a + "+" + b; break;
            case 2: stringExpression = a + "-" + b; break;
            default: break;
        }
        return stringExpression;

    }
    static int getResult(String question) {
        if (question.contains("*")) {
            return a * b;
        } else if (question.contains("+")) {
            return a + b;
        } else {
            return a - b;
        }
    }

    public static void startCalculator() {
        for (int i = 0; i < game.getMaxTry(); i++) {
            a = game.getRandomNum();
            b = game.getRandomNum();
            String question = question();
            System.out.println("Question: " + question);
            int answer = sc.nextInt();
            int result = getResult(question);
            if (answer == result) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("'" + answer + "'" +  "is wrong answer ;(. Correct answer was " + "'" + result + "'.");
                System.out.println("Let's try again, " + game.getName());
                break;
            }
            if (score == game.getScoreToWin()) {
                System.out.println("Congratulations, " + game.getName() + "!");
            }
        }
    }
}
