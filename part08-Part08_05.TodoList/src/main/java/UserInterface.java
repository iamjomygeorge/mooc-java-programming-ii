import java.util.Scanner;

public class UserInterface {
    
    private TodoList todolist;
    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add: ");
                String thingToAdd = scanner.nextLine();

                todolist.add(thingToAdd);
            }

            if (command.equals("list")) {
                todolist.print();
            }

            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int itemToRemove = Integer.valueOf(scanner.nextLine());

                todolist.remove(itemToRemove);
            }
        }
    }
}
