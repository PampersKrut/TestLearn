package structures_1;

import java.util.Scanner;

public class Structures11 {
    public static void main(String[] args) {
        String message = readInput();
        StringBuilder result = new StringBuilder();
        System.out.println(result.append("*".repeat(message.length())));
    }

    public static String readInput() {
        String message = "";

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            message = scanner.nextLine();
        }
        scanner.close();

        return message;
    }
}
