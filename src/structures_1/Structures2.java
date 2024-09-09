package structures_1;

import java.util.Scanner;

public class Structures2 {
    public static void main(String[] args) {
        int n = readInput();
        if (n % 6 == 0 && n % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static int readInput() {
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            n = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return n;
    }
}
