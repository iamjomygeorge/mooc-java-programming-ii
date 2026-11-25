import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            System.out.println("First: " + containerOne);
            System.out.println("Second: " + containerTwo);

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            System.out.println();
            
            String[] parts = input.split(" ");
            String operation = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (operation.equals("add")) {
                containerOne.add(amount);
            }

            if (operation.equals("remove")) {
                containerTwo.remove(amount);
            }

            if (operation.equals("move")) {
                containerOne.move(amount, containerTwo);
            }
        }
    }
}
