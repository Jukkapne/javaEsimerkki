import java.util.Scanner;

public class App {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Loop Game!");
        System.out.println("You have 5 options:");

        while (true) {
            System.out.println("\n1. Guess the number");
            System.out.println("2. Repeat after me");
            System.out.println("3. Count to 10");
            System.out.println("4. Print a pattern");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            

            switch (choice) {
                case 1:
                    // Guess the number
                    int numberToGuess = 7;
                    int userGuess;
                    do {
                        System.out.print("Guess the number (1-10): ");
                        userGuess = scanner.nextInt();
                        if (userGuess == numberToGuess) {
                            System.out.println("Congratulations! You guessed the number!");
                        } else {
                            System.out.println("Wrong guess! Try again.");
                        }
                    } while (userGuess != numberToGuess);
                    break;
                case 2:
                    // Repeat after me
                    System.out.print("Enter a word: ");
                    String word = scanner.next();
                    System.out.print("How many times to repeat? ");
                    int times = scanner.nextInt();
                    for (int i = 0; i < times; i++) {
                        System.out.println(word);
                    }
                    break;
                case 3:
                    // Count to 10
                    int i = 1;
                    while (i <= 10) {
                        System.out.println(i);
                        i++;
                    }
                    break;
                case 4:
                    // Print a pattern
                    for (int j = 1; j <= 5; j++) {
                        for (int k = 1; k <= j; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
