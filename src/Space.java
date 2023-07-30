import java.util.Scanner;

public class Space {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Put your prefered number");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("please put a positive number");

        } else {
            drawWave(number);
        }
        scanner.close();
    }

    public static void drawWave(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= 4; j++) {
                if ((i + j) % 4 == 0 || (j - i) % 4 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }

}
