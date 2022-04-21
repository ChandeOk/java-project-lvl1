package hexlet.code;

import java.util.Scanner;

public class Even {
    private static int randomNum;
    private static String answer;
    private static Scanner sc = new Scanner(System.in);
    private static final int SCORE_TO_WIN = 3;
    private static int score;
    private static boolean isEven;
    private static final int MAX_TRY = 3;
    static void gameCondition() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }
    static void startEven() {
        for (int i = 0; i < MAX_TRY; i++) {
            final int limit = 999;
            randomNum = (int) (Math.random() * limit);
            isEven = randomNum % 2 == 0;
            System.out.println("Question: " + randomNum);
            answer = sc.nextLine();

            if (isEven && answer.equals("yes")) {
                System.out.println("Correct!");
                score++;
            } else if (!isEven && answer.equals("no")) {
                System.out.println("Correct!");
                score++;
            } else {
                String mistake = answer.equals("yes") ? "'yes' is wrong answer ;(. Correct answer was 'no'."
                        : "'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.";
                System.out.println(mistake);
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        if (score == SCORE_TO_WIN) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }

}
