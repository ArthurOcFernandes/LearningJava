package HangmanGame;

import java.util.Arrays;
import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {
        //My first Hangman Game

        String word;
        String letter;
        String test = "1234567890!@#$%&*_-+=abcdefghijklmnopqrstuvwxyz";
        int attempts = 5;

        Scanner entry = new Scanner(System.in);

        System.out.print("What is the word? ");
        word = entry.next();

        String[] slctdWord = new String[word.length()];

        Arrays.fill(slctdWord, "_");

        System.out.println(Arrays.toString(slctdWord));


        //the word is defined.
        //define chosen letter

        while (attempts != 0) {
            System.out.print("Pick a letter: ");
            letter = entry.next();

            if (word.contains(letter)) {

                for (int index = word.indexOf(letter); index >= 0; index = word.indexOf(letter, index + 1)) {

                    slctdWord[index] = letter;

                    char[] wrd = test.toCharArray();
                    wrd[index] = letter.charAt(0);
                    test = String.valueOf(wrd);
                }
            } else {
                System.out.printf("The word doesnt contain the letter '%s'. You've got %d attempts.\n", letter.toUpperCase(), attempts - 1);
                attempts--;
            }
            System.out.println("Status of the game: ");
            System.out.println(Arrays.toString(slctdWord));

            if (word.equalsIgnoreCase(test.substring(0, word.length()))) {
                System.out.println("Congratulations! You've discovered the word!");
                break;
            }
        }

        if (attempts == 0) {
            System.out.println("You lost!");
        }

        entry.close();
    }
}