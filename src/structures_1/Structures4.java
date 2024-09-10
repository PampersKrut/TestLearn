package structures_1;

import java.util.Scanner;

public class Structures4 {
    public static void main(String[] args) {
        int stars = readInput();
        System.out.println("★".repeat(stars));
    }

    public static int readInput() {
        int stars = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            stars = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return stars;
    }
}
