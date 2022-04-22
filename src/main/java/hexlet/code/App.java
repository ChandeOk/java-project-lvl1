package hexlet.code;
import hexlet.code.games.Calculator;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        final int greet = 1;
        System.out.println("2 - Even");
        final int even = 2;
        System.out.println("3 - Calculator");
        final int calculator = 3;
        System.out.println("0 - Exit");
        final int exit = 0;
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case greet: Engine.hello(); break;
            case exit: return;
            case even: Engine.hello(); Even.gameCondition(); Even.startEven(); break;
            case calculator: Engine.hello(); Calculator.gameCondition(); Calculator.startCalculator(); break;
            default: System.out.println("Wrong number"); return;
        }
    }
}
