import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(100) + 1;
        int n = 1;
        int guess;

        do {
            System.out.println("\nGuess the number between 1 to 100");
            guess = scanner.nextInt();

            if (guess < num) {
                System.out.println("Higher number please !");
            } else if (guess > num) {
                System.out.println("Lower number please !");
            } else {
                System.out.println("Congratulations! You guessed the number");
                System.out.println("You guessed the number in " + n + " attempts");
            }

            n++;
        } while (guess != num);

        scanner.close();
    }
}