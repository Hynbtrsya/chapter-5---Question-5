import java.util.Scanner;

public class UserInterface {
    public Scanner input = new Scanner(System.in); // Global Scanner object

    public void showMenu() {
        System.out.println("Average Marks Calculator");
        System.out.println("1. Enter Marks for Three Students");
        int choice = input.nextInt();
        
        if (choice == 1) {
            StudentManager manager = new StudentManager();
            manager.inputMarks();
            manager.displayAverages();
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
