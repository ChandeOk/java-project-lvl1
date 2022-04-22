package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner sc = new Scanner(System.in);
    private static String name;
    public static String getName() {
        return name;
    }
    static void hello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
    private static final int MAX_TRY = 3;
    public static int getMaxTry() {
        return MAX_TRY;
    }
    private static final int SCORE_TO_WIN = 3;
    public static int getScoreToWin() {
        return SCORE_TO_WIN;
    }
    private static final int LIMIT = 999;
    static int getLimit() {
        return LIMIT;
    }
    public static int getRandomNum() {
        return (int) (Math.random() * LIMIT);
    }
    public static String getAnswer() {
        return sc.nextLine();
    }


}
