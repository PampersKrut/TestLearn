package structures_2;

import java.util.Scanner;

public class Struct2 {
    public static void main(String[] args) {
        var pair = readInput();
        String message = pair.getFirst();
        int k = pair.getSecond();
        char[] strArr = message.toCharArray();
        StringBuilder result = new StringBuilder();
        
        if (k > 0) {
            System.out.println(message.repeat(k));
        }
        if (k < 0  ) {
            if (message.length() % Math.abs(k) == 0) {
                String subString = message.substring(0, message.length()/ Math.abs(k));
                StringBuilder repeatedSubstring = new StringBuilder();
                
                for (int i = 0; i < Math.abs(k); i++) {
                    repeatedSubstring.append(subString);
                }
                if (repeatedSubstring.toString().equals(message)) {
                    result.append(subString);
                } else {
                    result.append("NO SOLUTION");
                }
            } else {
                result.append("NO SOLUTION");
            }
        } else {
            result.append("");
        }
        System.out.println(result.toString());
        
    }

    public static Pair<String, Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split(" \\| ");
        String message = input[0];
        int k = Integer.parseInt(input[1]);
        return new Pair<>(message, k);
    }
}
class Pair<F, S> {
    private final F first;
    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
