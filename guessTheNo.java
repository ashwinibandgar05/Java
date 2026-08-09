import java.util.Scanner;
import java.util.Random;

class Game {

    public int number;
    public int noOfGuesses;

    // Constructor
    Game() {
        Random random = new Random();

        number = random.nextInt(101);
        noOfGuesses = 0;
    }

    // Take input from user
    int takeUserInput() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");

        int userGuess = sc.nextInt();

        noOfGuesses++;

        return userGuess;
    }

    // Check whether number is correct
    boolean isCorrectNumber(int userGuess) {

        if (userGuess == number) {

            System.out.format(
                "Correct guess! The number is %d and you guessed correctly in %d attempts.%n",
                number,
                noOfGuesses
            );

            return true;
        }

        else if (userGuess < number) {

            System.out.println("Too low...");
        }

        else {

            System.out.println("Too high...");
        }

        return false;
    }
}


public class guessTheNo {

    public static void main(String[] args) {

        Game game = new Game();

        boolean correct = false;

        while (!correct) {

            int userGuess = game.takeUserInput();

            correct = game.isCorrectNumber(userGuess);
        }
    }
}