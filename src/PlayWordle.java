import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PlayWordle {
    public static void main(String[] args) {
        // Gets a list of words and makes it the secret word, the reason that Math.random() is multiplied by 1001 is because otherwise it won't include the 1000th word in the list.

        String[] wordList = getWords();
        Wordle wordleGame = new Wordle(wordList[(int)(Math.floor(Math.random() * 1001))]);

        System.out.println("Your 5 letter Wordle word is waiting!");

        // The code that runs all the guesses
        Scanner guesses = new Scanner(System.in);
        for (int i = 1; i < 7; i++){

            // prints out all the available letters to the user and what guess they are on

            System.out.println("Possible Letters: " + wordleGame.getLetters());
            System.out.print("What is guess " + i + " --> ");

            // extracts the guess from the user and generates a hint based on the guess and secret word

            String guess = guesses.nextLine();

            // if the user does not enter a 5 character string it will automatically break the code

            if (guess.length() != 5){

                System.out.println("Sorry, you did not enter a word that has 5 characters! Your game will end now.");
                break;

            }

            String hint = wordleGame.getHint(guess);
            System.out.println("Here is your hint --> " + hint);

            // if the user guesses the word it breaks the code and congratulates them

            if (wordleGame.guessCorrect(guess) == true){

                System.out.print("Good job! You guessed that the word was " + wordleGame.getSecretWord() + "!");
                break;

            } else if (i == 6) {

                // if the user wasn't able to guess the word it gives them the word and then stops the guess loop

                System.out.println("Sorry you are out of guesses.");
                System.out.println("The word was " + wordleGame.getSecretWord());
            }
        }
    }
    public static String[] getWords() {
        try {

            // Opens the file "words1000.txt" through the pathname
            File myObj = new File("words1000.txt");
            Scanner myReader = new Scanner(myObj);

            // Creates an array to store the words
            String[] words = new String[1000];

            // Puts the words from the file into an array
            int counter = 0;
            while (myReader.hasNextLine()) {
                words[counter] = myReader.nextLine();
                counter++;
            }
            myReader.close();

            // Catches an error if there is one

            return words;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return new String[0];
        }
    }
}