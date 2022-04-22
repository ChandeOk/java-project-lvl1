package hexlet.code;
import hexlet.code.games.Calculator;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("0 - Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1: Engine.hello(); break;
            case 0: return;
            case 2: Engine.hello(); Even.gameCondition(); Even.startEven(); break;
            case 3: Engine.hello(); Calculator.gameCondition(); Calculator.startCalculator(); break;
            default: System.out.println("Wrong number"); return;
        }
    }
}
