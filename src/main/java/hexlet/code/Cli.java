package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;
    public static String getName() {
        return name;
    }
    static void hello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
