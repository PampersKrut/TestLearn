package lists;



import java.util.Scanner;
import java.util.List;

public class Lists1 {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        boolean result = false;
        for (Integer iterable : data) {
            if (iterable % 2 == 0) {
                result = true;
            } else {
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
