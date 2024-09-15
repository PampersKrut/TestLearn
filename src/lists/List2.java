package lists;

import java.util.List;
import java.util.Scanner;

public class List2 {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        boolean result = false;

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) % 2 != 0) {
                result = true;
            }
            if (data.get(i) % 2 == 0) {
                result = false;
                break;
            }
        }
        System.out.println(result);
        
    }

    public static List<Integer> readInput() {
        List<Integer> data = null;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            Gson gson = new Gson();
            data = gson.fromJson(input, new TypeToken<List<Integer>>(){}.getType());
        }
        scanner.close();

        return data;
    }
}
