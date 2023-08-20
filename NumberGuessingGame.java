import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 3;
        int rounds = 0;
        int Score = 0;
        boolean playAgain = true;
        while (playAgain)
        {
            int targetNumber = random.nextInt(maxRange-minRange+1)+minRange;
            int attempts = 0;
            boolean roundWon = false;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("====================================");
            System.out.println("I'm thinking of a number between "+minRange+" and " +maxRange);
            while (attempts<maxAttempts)
            {
                System.out.print("Enter your guess: ");
                int userGuess=scanner.nextInt();
                attempts++;
                if(userGuess==targetNumber)
                {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    Score +=maxAttempts-attempts+1;
                    roundWon=true;
                    break;
                } else if(userGuess<targetNumber)
                {
                    System.out.println("Too Low! Try again.");
                } else
                {
                    System.out.println("Too high! Try again.");
                }
            }
            if (!roundWon)
            {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
            }
            rounds++;
            System.out.println("Round "+rounds+" ended. Your current Score is: "+Score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }
        System.out.println("Thank you for playing! Your final Score is: " + Score);
    }
}