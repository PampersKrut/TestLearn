package operators;

import java.util.Scanner;

public class Operators12 {
    public static void main(String[] args) {
        int role = readInput();
        
        switch (role) {
            case 1:
                System.out.println("admin");
                break;
            case 2:
                System.out.println("moderator");    
                break;
            case 3:
                System.out.println("user");
                break;    
            default:
                System.out.println("guest");
                break;
        }
        
    }

    public static int readInput() {
        int role = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            role = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return role;
    }
}
