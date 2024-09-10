package basics;

import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {
        String message = readInput();
        String result = message;

        System.out.println(result);
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        return scanner.nextLine();
    }
}
