import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String [] args) {
    Scanner myScanner = new Scanner (System.in);
    int numGuesses = 0;
    int randomNumber =  new Random() .nextInt(100) + 1;
    out.println("Guessing game ");
    out.print("Enter a num from 1-100");
    int inputNumber = myScanner.nextInt();
    numGuesses++;
    while (inputNumber != randomNumber) {
        out.println("try again");
        inputNumber = myScanner.nextInt();
        numGuesses++;
    }
    out.print("You win after ");
    out.println(numGuesses + " guesses.");
}
}