package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    private static Engine game = new Engine();
    private static int score = 0;
    private static Scanner sc = new Scanner(System.in);
    public static void gameCondition() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primeStart() {
        for (int i = 0; i < game.getMaxTry(); i++) {
            int randomNum = game.getRandomNum();
            boolean isPrime = isPrime(randomNum);
            System.out.println("Question: " + randomNum);
            String answer = sc.nextLine();
            if (answer.equals("yes") && isPrime) {
                System.out.println("Correct!");
                score++;
            } else if (answer.equals("no") && !isPrime) {
                System.out.println("Correct!");
                score++;
            } else {
                String mistake = answer.equals("yes") ? "'yes' is wrong answer ;(. Correct answer was 'no'."
                        : "'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.";
                System.out.println(mistake);
                System.out.println("Let's try again, " + game.getName() + "!");
                return;
            }
            if (score == game.getScoreToWin()) {
                System.out.println("Congratulations, " + game.getName() + "!");
            }

        }
    }
}
