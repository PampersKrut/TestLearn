package basics;

import java.util.Scanner;

public class ThirdLesson {
    public static void main(String[] args) {        
        String[] inputMessages = readInput();
        String message1, message2, result;
        message1 = inputMessages[0];
        message2 = inputMessages[1];
        
        result = message1 + " " + message2;
        System.out.println(result);
    }

    public static String[] readInput() {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();

        return inputLine.split(" \\| ");
    }
}
