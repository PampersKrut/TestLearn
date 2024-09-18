package lists;

import com.google.gson.*;
import java.util.*;

public class List9 {
    public static void main(String[] args) {
        List<String> tags = readInput();
        String result;
        List<String> tagsSet = new ArrayList<>();
        for (String iterable_element : tags) {
            if (!tagsSet.contains(iterable_element)) {
                tagsSet.add(iterable_element);
            }
        }
        Collections.sort(tagsSet);


        System.out.println(String.join(", ", tagsSet.stream().map(String::valueOf).toArray(String[]::new)));
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
