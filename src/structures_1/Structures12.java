package structures_1;

import java.util.Scanner;

public class Structures12 {
    public static void main(String[] args) {
        int n = readInput();
        int result;

        if (n > 0) {
            result = n * 2;
            System.out.println(result);
        } else {
            result = n;
            System.out.println(result);
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
