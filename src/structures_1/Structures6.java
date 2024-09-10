package structures_1;

public class Structures6 {
    public static void main(String[] args) {
        String[] inputValues = readInput();
        int x = Integer.parseInt(inputValues[0]);
        int y = Integer.parseInt(inputValues[1]);
        String direction = inputValues[2];

        switch (direction) {
            case "down":
                y = Math.min(y + 1, 100);
                break;
            case "up":
                y = Math.max(y - 1, 0);
                break;
            case "left":
                x = Math.max(x - 1, 0);
                break;
            case "right":
                x = Math.min(x + 1, 100);
                break;
        }
        String result = "x: " + x + ", y: " + y + ", direction: " + direction;
        System.out.println(result);
    }

    public static String[] readInput() {
        String[] inputValues = new String[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            for (int i = 0; i < 3; i++) {
                inputValues[i] = values[i];
            }
        }
        scanner.close();

        return inputValues;
    }
}
