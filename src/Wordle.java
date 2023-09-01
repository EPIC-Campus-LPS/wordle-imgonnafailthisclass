public class Wordle {

    // generates the instance of Wordle and all variables: secretWord and Letters
    private String secretWord;
    private String letters = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
    public Wordle(String word){
        this.secretWord = word;
    }

    // determines whether or not the user's guess was correct
    public boolean guessCorrect(String guess){
        return secretWord.equals(guess);
    }
    public String getHint(String guess){

        // Generates the beginning of the hint and splits up the secret word and the guess so you can compare them

        String hint = "";
        String[] guessSplit = guess.split("");
        String[] secretWordSplit = secretWord.split("");

        /* First, compares the guess of the user and the secret word
           Second, generates the hint based on the comparison
           Lastly, removes the letters in the letter string that don't need to be there */

        for (int i = 0; i < 5; i++){
            if (guessSplit[i].equals(secretWordSplit[i])){

                // if the letter exists and is in the right spot it adds  to the letter to the hint

                hint += guessSplit[i];

            } else if (secretWord.contains(guessSplit[i]) == true){

                // if the letter exists but is not in the right spot it will add + to the hint

                hint += "+";

            } else {

                // if the letter doesn't exist at all it will replace the excess letter in the letter list then add * to the hint

                hint += "*";
                letters = letters.replace(guessSplit[i],"");

            }
        }

        // returns the hint that was generated based on the users guess

        return hint;
    }

    // generates both the methods for getting the secret word and getting the letter list
    public String getSecretWord() { return secretWord; }

    public String getLetters() { return letters; }
}
