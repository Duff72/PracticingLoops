import java.util.Scanner;

public class PracticingLoops {
    public static void TakeABreak(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = "";

        while (!userInput.equals("yes")) {
            System.out.println("Do you want to take a break?");
            userInput = scanner.nextLine();
        }

        System.out.println("Great! Take a break now.");

    }
    public static void StopAtFive(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Give a number:");
        number = scanner.nextInt();

        while (number != 5) {
            System.out.println("Give a number:");
            number = scanner.nextInt();
        }

        System.out.println("You entered 5. Program stopped.");
    }

        public static void PositiveNumbers(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number:");

            int number = scanner.nextInt();

            while (number != 0) {
                if (number < 0) {
                    System.out.println("Number must be a positive number");
                } else {
                    System.out.println("Number is: " + number);
                }

                number = scanner.nextInt();
            }

            System.out.println("Program ended.");

        }
        public static void CountToEleven(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 11:");
        int number = scanner.nextInt();
        for (number = 0; number <= 11; number++) {

            System.out.println(number);
        }
        }

    public static void Multiplication(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number:");
        int number = scanner.nextInt();
        int multiplier;
        for (multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(number + " * " + multiplier + " = " + (number * multiplier));
        }
    }

    public static void main(String[] args) {

        TakeABreak(args);
        StopAtFive(args);
        PositiveNumbers(args);
        CountToEleven(args);
        Multiplication(args);
    }
}
