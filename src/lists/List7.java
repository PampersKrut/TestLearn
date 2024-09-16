package lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class List7 {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        Collections.sort(data);
        List<String> stringData = data.stream()
                                        .map(String::valueOf)
                                        .collect(Collectors.toList());
        System.out.println(String.join(", ", stringData));
    }


    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
            Gson gson = new Gson();
            Integer[] dataArray = gson.fromJson(input, Integer[].class);
            return Arrays.asList(dataArray);
        }
        scanner.close();
        return null;
    }
}
