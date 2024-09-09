package basics;

import java.util.Scanner;

public class FifthLesson {
    public static void main(String[] args) {
        String message;
        int score, bonus;

        String[] inputValues = readInput();
        message = inputValues[0];
        score = Integer.parseInt(inputValues[1]);
        bonus = Integer.parseInt(inputValues[2]);
        int result = score * bonus;
        System.out.println(message + " " + result);
    }

    public static String[] readInput() {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();

        return inputLine.split(" \\| ");
    }
}
