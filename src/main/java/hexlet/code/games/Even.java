package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static Engine game = new Engine();

    private static String answer;
    private static int score;
    private static boolean isEven;
    public static void gameCondition() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }
    public static void startEven() {
        for (int i = 0; i < game.getMaxTry(); i++) {
            int randomNum = game.getRandomNum();
            isEven = randomNum % 2 == 0;
            System.out.println("Question: " + randomNum);
            answer = game.getAnswer();
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
                System.out.println("Let's try again, " + game.getName() + "!");
                return;
            }
        }
        if (score == game.getScoreToWin()) {
            System.out.println("Congratulations, " + game.getName() + "!");
        }
    }

}
