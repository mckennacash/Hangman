import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String [] args){


        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int wordToGuess;
        int WordToGuessLength;
        int lettersRemaining;
        String secretPhrase;
        String[] guessPhraseBreakDown = secretPhrase.split("");



        System.out.println("Welcome to hangman!\n In this game, you and another player " +
                "wil play against each other." +
                "\n One of you will guess the word while the other will be the one who gives the word. \n\n" +
                "Ready to play?");
        keyboard.nextLine();
        System.out.println("Player 2,  please input the word to guess. Player 1 please turn around");
        secretPhrase = keyboard.nextLine().toLowerCase();
        hangmanDisplay();

    }
    public static void hangmanDisplay(){
         System.out.println("-----------------");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("--------------------------------");

    }
 //   public static String replaceSecretWordDashes(String secretWord){

  //  }

}