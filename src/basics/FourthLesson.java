package basics;

import java.util.Scanner;

public class FourthLesson {
    public static void main(String[] args) {
        String[] inputValues = readInput();
        String message = inputValues[0];
        int result;
        int score = Integer.parseInt(inputValues[1]);
        
        result = score * 2;
        System.out.println(result);
    }

    public static String[] readInput() {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();

        return inputLine.split(" \\| ");
    }
}
