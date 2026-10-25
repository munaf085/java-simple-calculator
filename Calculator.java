import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Simple Calculator ===");
        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("Choose an option (1-5): ");
            int choice = scanner.nextInt();
            if (choice == 5) {
                running = false;
            } else if (choice < 1 || choice > 5) {
                System.out.println("Please choose a number from 1 to 5.");
            } else {
                System.out.print("First number: ");
                double a = scanner.nextDouble();
                System.out.print("Second number: ");
                double b = scanner.nextDouble();
                showResult(choice, a, b);
            }
        }
        System.out.println("Goodbye!");
        scanner.close();
    }

    static void printMenu() {
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
    }

    static void showResult(int choice, double a, double b) {
        if (choice == 4 && b == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            double result = calculate(choice, a, b);
            System.out.printf("%.2f %s %.2f = %.2f%n", a, symbolFor(choice), b, result);
        }
    }

    static double calculate(int choice, double a, double b) {
        return switch (choice) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            default -> a / b;
        };
    }

    static String symbolFor(int choice) {
        return switch (choice) {
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "*";
            default -> "/";
        };
    }
}