import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        String[] parts = null;
        String operation = null;
        int amount = 0;

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scanner.nextLine();
            System.out.println();

            if (input.equals("quit")) {
                break;
            } else {
                parts = input.split(" ");
                operation = parts[0];
                amount = Integer.valueOf(parts[1]);
            }

            if (operation.equals("add")) {
                first.addAmount(amount);
            } else if (operation.equals("move")) {
                first.moveAmount(amount, second);
            } else if (operation.equals("remove")) {
                second.removeAmount(amount);
            }
        }

        scanner.close();
    }
}
