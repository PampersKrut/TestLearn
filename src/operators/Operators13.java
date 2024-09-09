package operators;

import java.util.Scanner;

public class Operators13 {
    public static void main(String[] args) {
        int age = readInput();
        if (age >= 18) {
            System.out.println("взрослый");
        }
        if (age < 18) {
            System.out.println("подросток");
        }
    }

    public static int readInput() {
        int age = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            age = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return age;
    }
}
