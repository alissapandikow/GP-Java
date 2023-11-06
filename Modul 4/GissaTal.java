package MOD4;

import java.util.Scanner;

public class GissaTal {
    public static void main (String[] args) {

        try (Scanner inputReader = new Scanner(System.in)) {

            int lBound = 1;
            int uBound = 100;
            int guess;

            int secretNumber = (int) (Math.random () * (uBound - lBound + 1)) + lBound;

            System.out.print("Guess-a-Number-Game" + "\n" );
            System.out.print("I know a secret number between " + lBound + " and " + uBound + "." + "\n");
            System.out.print("Can you guess it?" + "\n");

            while (true) {
                System.out.print("Your guess: ");
                guess = inputReader.nextInt();

                if (guess < secretNumber) {
                    System.out.print("Your guess is too small."  + "\n");
                } else if (guess > secretNumber) {
                    System.out.print("Your guess is too big." + "\n");

                } else {

                    System.out.print("You're right. The secret number is: " + secretNumber + "." + "\n");
                    break;
                                        
                }
            }
         }
     }
}
