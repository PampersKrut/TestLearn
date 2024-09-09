package operators;

import java.util.Scanner;

public class Operators8 {
    public static void main(String[] args) {
        int num = readInput();
        if (num % 2 == 0) {
            System.out.println("четное");
        } else if (num % 2 != 0) {
                System.out.println("нечетное");
        }
    }

    public static int readInput() {
        int num = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            num = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return num;
    }
}
