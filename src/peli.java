
import java.util.Random;
import java.util.Scanner;

public class peli {

    
        public static void main(String[] args) {

            // Create a new random number generator
            Random rand = new Random();

            int numberToGuess = rand.nextInt(1,10+1);
            System.out.println(numberToGuess);

            int credit = 10;

            Scanner scanner = new Scanner(System.in);
            while(true){
                System.out.println("You have " + credit + " credits.");
                System.out.println("Guess the number (1-10): ");
                int userGuess = scanner.nextInt();
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number!");
                    System.out.println("You have won the game with credits left:"+credit);
                    break;
                } else {
                    System.out.println("Wrong guess! Try again.");
                    credit -= 2;
                }
                if (credit <= 0) {
                    System.out.println("You have no credits left. Game over!");
                    break;
                }
            }
    
        }

    

}
