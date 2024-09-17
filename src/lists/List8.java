package lists;

import java.util.*;

public class List8 {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        String result;
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer integer : data) {
            if (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        } 
        Collections.sort(uniqueList);
        System.out.println(String.join(", ", uniqueList.stream().map(String::valueOf).toArray(String[]::new)));
        
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
