/**
 * Created with IntelliJ IDEA.
 * Author: Andreas
 * Date  : 27/04/13
 * Time  : 12:30 PM
 */
import java.util.Scanner;

public class L33TH4X {
    private static final String randUpperCase = Character.toString((char) (int) (Math.floor(Math.random() * (1 + 91 - 66)) + 66));
    private static final String randLowerCase = randUpperCase.toLowerCase();

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Try to guess the letter, enter any word...");
        String userWord;
        boolean result;

        do {
            userWord = keyboard.nextLine();
            result = guessCheck(userWord);
            if(!result) {System.out.println("Nope, try again.");}
        } while (!result);

        System.out.println("Wow, you did it! The letter was: " + randLowerCase);
    }

    private static boolean guessCheck(String guess) {
        return (guess.contains(randLowerCase) || guess.contains(randUpperCase));
    }

}
