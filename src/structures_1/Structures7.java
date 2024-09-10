package structures_1;

import java.util.Scanner;

public class Structures7 {
    public static void main(String[] args) {
        int n = readInput();
        System.out.println(negPoz(n));
        
    }

    public static String negPoz(int n) {
        
        if (n > 0) {
            return "Число позитивное";
        }
        if (n < 0) {
            return "Число негативное";
        } else {
            return "Число равно 0";
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
