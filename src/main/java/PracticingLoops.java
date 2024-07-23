import java.util.Scanner;

public class PracticingLoops {
    public static void TakeABreak(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;
        do {
            System.out.println("Do you want to take a break?");
            userInput = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison
        } while (!userInput.equals("yes"));

        System.out.println("Great! Take a break now.");

        scanner.close(); // Close the scanner when done
    }

    public static void main(String[] args) {
        TakeABreak(args);
    }
}
