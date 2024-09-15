package lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class List5 {
    public static void main(String[] args) {
        List<String> data = readInput();
        String result;
        Collections.reverse(data);
        System.out.println(String.join(", ", data));



    }

    public static List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
            Gson gson = new Gson();
            String[] dataArray = gson.fromJson(input, String[].class);
            return Arrays.asList(dataArray);
        }
        scanner.close();
        return null;
    }
}
