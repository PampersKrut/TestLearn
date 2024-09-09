package operators;

import java.util.Scanner;

public class Operators11 {
    public static void main(String[] args) {
        int x, y;
        boolean result = false;

        int[] inputValues = readInput();
        x = inputValues[0];
        y = inputValues[1];


        System.out.println(x == y);
    }

    public static int[] readInput() {
        int[] inputValues = new int[2];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            inputValues[0] = Integer.parseInt(values[0]);
            inputValues[1] = Integer.parseInt(values[1]);
        }
        scanner.close();

        return inputValues;
    }
}
