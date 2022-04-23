package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    private static Engine game = new Engine();
    private static int score = 0;
    private static Scanner sc = new Scanner(System.in);
    private static int[] createProgression() {
        final int randomLengthLow = 5;
        final int randomLengthLimit = 10;
        int randomLength = (int) (randomLengthLow + Math.random() * randomLengthLimit);
        int[] progression = new int[randomLength];
        final int progressionLimitMax = 49;
        int progressionLimit = (int) (1 + Math.random() * progressionLimitMax);
        final int randomFirstNumLimit = 101;
        progression[0] = (int) (Math.random() * randomFirstNumLimit);
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + progressionLimit;
        }
        return progression;
    }
    public static void gameCondition() {
        System.out.println("What number is missing in the progression?");
    }
    public static void startProgression() {
        for (int i = 0; i < game.getMaxTry(); i++) {
            int[] progression = createProgression();
            int rndIndexInProgression = (int) (Math.random() * (progression.length - 1));
            System.out.print("Question: ");
            for (var num : progression) {
                if (num == progression[rndIndexInProgression]) {
                    System.out.print(".. "); continue;
                } else {
                    System.out.print(num + " ");
                }
            }
            int answer = sc.nextInt();
            if (answer == progression[rndIndexInProgression]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("'" + answer + "'" +  "is wrong answer ;(. Correct answer was "
                        + "'" + progression[rndIndexInProgression] + "'.");
                System.out.println("Let's try again, " + game.getName() + "!");
                return;
            }
            if (score == game.getScoreToWin()) {
                System.out.println("Congratulations, " + game.getName() + "!");
            }
            System.out.println();
        }
    }

}
