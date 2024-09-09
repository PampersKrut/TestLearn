package structures_1;

import java.util.Arrays;
import java.util.Scanner;

public class Structures3 {
    public static void main(String[] args) {
        int[] inputValues = readInput();
        Arrays.sort(inputValues);
        System.out.println("минимальное: " + inputValues[0] + ", максимальное: " + inputValues[2]);
    }

    public static int[] readInput() {
        int[] inputValues = new int[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            for (int i = 0; i < 3; i++) {
                inputValues[i] = Integer.parseInt(values[i]);
            }
        }
        scanner.close();

        return inputValues;
    }
}
