package operators;

import java.util.Scanner;

public class Operators10 {
    public static void main(String[] args) {
        int x, y;
        String op;
        int result = 0;

        String[] inputValues = readInput();
        x = Integer.parseInt(inputValues[0]);
        op = inputValues[1];
        y = Integer.parseInt(inputValues[2]);

        switch (op) {
            case "x":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            default:
                System.out.println(0);
        }
    }

    public static String[] readInput() {
        String[] inputValues = new String[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            inputValues = input.split(" ");
        }
        scanner.close();

        return inputValues;
    }
    
}
