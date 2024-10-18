import java.util.Scanner;

public class GameTesterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter name
        System.out.println("Enter game tester's name:");
        String name = scanner.nextLine();

        // Prompt user to choose game tester type
        System.out.println("Choose game tester type: (1) Full-time (2) Part-time");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        GameTester tester = null;

        if (choice == 1) {
            // Create full-time game tester
            tester = new FullTimeGameTester(name);
        } else if (choice == 2) {
            // Create part-time game tester
            System.out.println("Enter number of hours worked:");
            int hours = scanner.nextInt();
            tester = new PartTimeGameTester(name, hours);
        } else {
            System.out.println("Invalid choice!");
            System.exit(0);
        }

        // Display the information
        System.out.println("\nGame Tester Details:");
        tester.displayInfo();

        scanner.close();
    }
}

