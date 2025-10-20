import java.util.Scanner;

public class CalculatorApp {

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        System.out.println("===== Console Calculator =====");
        System.out.println("Operations: +  -  *  /");
        System.out.println("==============================");

        do {
            System.out.print("\nEnter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean valid = true;

            switch (op) {
                case '+': result = add(num1, num2); break;
                case '-': result = subtract(num1, num2); break;
                case '*': result = multiply(num1, num2); break;
                case '/': result = divide(num1, num2); break;
                default:
                    System.out.println("Invalid operator!");
                    valid = false;
            }

            if (valid) {
                System.out.println("Result = " + result);
            }

            while (true) {
                System.out.print("\nDo you want to continue? (y/n): ");
                choice = sc.next().toLowerCase().charAt(0);
                if (choice == 'y' || choice == 'n') break;
                System.out.println("Please enter only 'y' or 'n'.");
            }

        } while (choice == 'y');

        System.out.println("\nExit!");
        sc.close();
    }
}
