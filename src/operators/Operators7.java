package operators;

import java.util.Scanner;

public class Operators7 {
    public static void main(String[] args) {
        int hours = readInput();
        int result = hours * 3600;

        System.out.println(result);
    }

    public static int readInput() {
        int hours = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            hours = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return hours;
    }
}
