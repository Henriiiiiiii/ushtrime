import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float firstNumber = scanner.nextFloat();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);


        System.out.print("Enter the second number: ");
        float secondNumber = scanner.nextFloat();


        float result = 0;
        switch (operation) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Cannot calculate: Division by zero is not allowed.");
                    System.exit(0);
                }
            }
            default -> {
                System.out.println("Invalid symbol: " + operation);
                System.exit(0);
            }
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}