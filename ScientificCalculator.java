import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scientific Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        double result;
        switch (choice) {
            case 1:
                System.out.print("Enter the first number: ");

                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                System.out.print("Enter the dividend: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the divisor: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                System.out.print("Enter a number: ");
                num1 = scanner.nextDouble();
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                    System.out.println("Square root: " + result);
                } else {
                    System.out.println("Error: Cannot calculate square root of a negative number.");
                }
                break;
            case 6:
                System.out.print("Enter the base: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the exponent: ");
                num2 = scanner.nextDouble();
                result = Math.pow(num1, num2);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        scanner.close();
    }
}