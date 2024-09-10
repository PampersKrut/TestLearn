package structures_1;

import java.util.Scanner;

public class Structures5 {
    public static void main(String[] args) {
        String[] inputValues = readInput();
        int x = Integer.parseInt(inputValues[0]);
        int y = Integer.parseInt(inputValues[1]);
        String direction = inputValues[2];
        switch (direction) {
            case "up":
                y -= 1;
                break;
            case "down":
                y += 1;
                break;
            case "left":
                x += -1;
                break;
            case "right":
                x += 1;
                break;
        }
        System.out.println("x: " + x + ", y: " + y + ", direction: " + direction);


    }

    public static String[] readInput() {
        String[] inputValues = new String[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            for (int i = 0; i < 3; i++) {
                inputValues[i] = values[i];
            }
        }
        scanner.close();

        return inputValues;
    }
}
