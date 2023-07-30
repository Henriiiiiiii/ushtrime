import java.util.Scanner;
public class task10 {
    public static int calculateSumOfDigits(int number) {
        int totalSum = 0;

        while (number > 0) {

            int digit = number % 10;
            totalSum += digit;
            number /= 10;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a positive number: ");
            int number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive number.");
            } else {
                int result = calculateSumOfDigits(number);
                System.out.println("The sum of digits of the given number is: " + result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid positive number.");
        }
    }
}