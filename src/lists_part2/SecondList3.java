package lists_part2;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class SecondList3 {
    public static void main(String[] args) {
        List<List<Integer>> data = readInput();
        int result;

        result = findMaxNumber(data);

        System.out.println(result);
    }

    public static int findMaxNumber(List<List<Integer>> data) {
        return data.stream()
                    .flatMap(Collection::stream)
                    .max(Integer::compare)
                    .get();
    }

    public static List<List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Gson gson = new Gson();
        Type listType = new TypeToken<List<List<Integer>>>(){}.getType();
        return gson.fromJson(input, listType);
    }
}
