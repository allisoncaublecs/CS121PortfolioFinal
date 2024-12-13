package OneProject;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {

    public static void main(String[] args) {

        // This is defining the choice of colors that the player will have
        String[] colors = {"Pink", "Red", "Green", "Blue", "Orange", "Yellow", "Cyan"};


        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int correctGuesses = 0;

        // Play the game 10 times
        for (int i = 1; i <= 10; i++) {
            int randomIndex = rand.nextInt(5);


            String selectedColor = colors[randomIndex];

            System.out.print("Guess the color (Red, Green, Blue, Orange, Yellow, Cyan, Pink): ");
            String userGuess = scanner.nextLine().toLowerCase();

            System.out.println("The computer selected: " + selectedColor);

            if (userGuess.equals(selectedColor)) {
                correctGuesses++;
                System.out.println("Correct guess!\n");
            } else {
                System.out.println("Incorrect guess. Try again.\n");
            }
        }

        System.out.println("You guessed correctly " + correctGuesses + " out of 10 times.");

        scanner.close();
    }
}
