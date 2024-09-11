package structures_1;

import java.util.Scanner;

public class Structures10 {
    public static void main(String[] args) {
        int n = readInput();
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                continue;
            } else {
                result += i;
            }
        }
        System.out.println(result);
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
