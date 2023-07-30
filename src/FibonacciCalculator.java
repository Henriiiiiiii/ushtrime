import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();


        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {

            int fibonacciNumber = calculateFibonacci(number);
            System.out.println("The Fibonacci number at index " + number + " is: " + fibonacciNumber);
        }

        scanner.close();
    }

    public static int calculateFibonacci(int n) {
        if (n <= 2) {
            return 1;
        }

        int first = 1;
        int second = 1;
        int fibonacciNumber = 0;

        for (int i = 3; i <= n; i++) {
            fibonacciNumber = first + second;
            first = second;
            second = fibonacciNumber;
        }

        return fibonacciNumber;
    }
}