package lists_part2;


import java.util.*;

public class SecondList1 {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        String result;

        result = findEvenOddNumbers(data);

        System.out.println(result);
    }

    public static String findEvenOddNumbers(List<Integer> data) {
        List<Integer> evenNums = new ArrayList<>();
        List<Integer> oddNums = new ArrayList<>();
        for (int num : data) {
            if (num % 2 == 0) {
                evenNums.add(num);
            } else {
                oddNums.add(num);
            }
        }
        Collections.sort(evenNums);
        Collections.sort(oddNums);
        
        return "(" + evenNums.toString().replace("[", "").replace("]", "") + ")" 
                + "(" + oddNums.toString().replace("[", "").replace("]", "") + ")";
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Gson gson = new Gson();
        Type listType = new TypeToken<List<Integer>>(){}.getType();
        return gson.fromJson(input, listType);
    }
}
