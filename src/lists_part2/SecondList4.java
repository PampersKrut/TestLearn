package lists_part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondList4 {
    public static void main(String[] args) {
        Pair<Integer, List<Integer>> input = readInput();
        int n = input.getFirst();
        List<Integer> data = input.getSecond();
        String result = moveItems(n, data);
        System.out.println(result);
    }

    public static String moveItems(int n, List<Integer> items) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        for (int i = n; i < items.size(); i++) {
            firstList.add(items.get(i));
        }
        for (int i = 0; i < n; i++) {
            secondList.add(items.get(i));
        }
        List<Integer> res = new ArrayList<>();
        res.addAll(firstList);
        res.addAll(secondList);
        return res.toString().replace("[", "").replace("]", "");
    }

    public static Pair<Integer, List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Gson gson = new Gson();
        Type listType = new TypeToken<List<Integer>>(){}.getType();
        List<Integer> data = gson.fromJson(input.split(" \\| ")[1], listType);
        int n = Integer.parseInt(input.split(" \\| ")[0]);

        return new Pair<>(n, data);
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