import java.util.Scanner;

public class what {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestText = "";
        String inputText;

        System.out.println("Enter texts (type 'Enough!' to stop):");

        while (true) {
            inputText = scanner.nextLine();

            if (inputText.equalsIgnoreCase("Enough!")) {
                break;
            }

            if (inputText.length() > longestText.length()) {
                longestText = inputText;
            }
        }

        scanner.close();

        if (longestText.isEmpty()) {
            System.out.println("No text provided");
        } else {
            System.out.println("Longest text: " + longestText);
        }
    }
}