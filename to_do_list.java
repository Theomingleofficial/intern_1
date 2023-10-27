import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        // Create an ArrayList to store the to-do list items
        ArrayList<String> toDoList = new ArrayList<>();

        // Take input from the user
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        // Loop until the user exits the program
        while (choice != 4) {
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View list");
            System.out.println("4. Exit program");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String item = sc.next();
                    toDoList.add(item);
                    System.out.println("Item added to the list.");
                    break;
                case 2:
                    System.out.print("Enter the item to remove: ");
                    String removeItem = sc.next();
                    if (toDoList.remove(removeItem)) {
                        System.out.println("Item removed from the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;
                case 3:
                    System.out.println("To-Do List:");
                    for (String listItem : toDoList) {
                        System.out.println("- " + listItem);
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
