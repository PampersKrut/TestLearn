package structures_2;

import java.util.Scanner;

public class Struct1 {
    public static void main(String[] args) {
        int n = readInput();
        if (n == 0) {
            System.out.println(1);
        }
        // Если n == 1, то результат 0 (невозможно нарушить порядок одной шляпы)
        if (n == 1) {
            System.out.println(0);
        }
        
        // Массив для хранения результатов предыдущих вычислений
        long[] derangement = new long[n + 1];
        
        // Базовые случаи
        derangement[0] = 1; // !0 = 1
        derangement[1] = 0; // !1 = 0
        
        // Заполнение массива значениями !n для всех n от 2 до n
        for (int i = 2; i <= n; i++) {
            derangement[i] = (i - 1) * (derangement[i - 1] + derangement[i - 2]);
        }
        
        System.out.println(derangement[n]);

    }

    public static int readInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
    }
}
