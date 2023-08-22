# Lab 1: Wordle

## Objective: Complete the program to implement Wordle
1. Create a GitHub account using your LPS email address and connect it to IntelliJ under the VCS menu. 
2. Connect your GitHub account to the GitHub Classroom via the Lab 1.1: Git & GitHub Fundamentals assignment in Google Classroom
3. Pull the GameOfLife GitHub Repository from GitHub Classroom.
4. Consider a guessing game in which a player tries to guess a hidden 5-letter word. This hidden word is guessable by the player using the console. A guess contains only lowercase letters and has 5 letters. 
5. After each guess is made, the player is given a hint that is based on a comparison between the hidden word and the guess. Each position in the hint contains a character that corresponds to the letter in the same position as the guess. The following rules determine the characters that appear in the hint.
	1. If the letter in the guess is in the same position in the hidden word, the corresponding character in the hint is the matching letter
	2. If the letter in the guess is in the hidden word but a different position, the corresponding character in the hint is a " *+* "
	2. If the letter in the guess is not the hidden work, the corresponding character in the hint is a  " *\** "
6. The player is also given a list of possible letters than may be in the word.  When a letter is guessed that does not appear in the word, it will be removed from the list of possible letters.
7. The player will have 6 opportunities to guess the hidden word. If the player does not correctly guess the word after 6 guesses, the hidden word will be revealed.
8. This game will be playable via the console. The details of the console program will be explained below.

## Project Details
1. This project will consist of two files, *PlayWordle.java* and *Wordle.java.* You will complete the *PlayWordle* and *Wordle* classes and the methods detailed below.

### PlayWordle Class
Methods
- ```public static void main(String[] args)```
	- Gets a list of words using *getWords()* and randomly selects one to be the hidden word.
	- Creates an instance of *Wordle.* This is the instance of Wordle you will interact with to manage the game
	- Runs the console program to take user input for each of the guesses and prints out the resulting hints
	- This method will end the game after 6 guesses
	- *Hint: you will need to use the Scanner and Math classes*
- ```public static String[] getWords()```
	- Reads in a list of words from the file *words1000.txt*
		- *words1000.txt* contains a list of 1000 five letter words. Each word is on it's own line.
	- Returns the contents of the file as an array of Strings
		- Each String should be a 5 letter word
	- *Hint: you will need to use the Scanner and File classes*

### Wordle
Class Variables
- ```private String secretWord```
	- The secret word for this game of Wordle
- ```private String letters```
	- A list of possible letters that could be in the secret word. As guesses are made using incorrect letters, letters are removed from this String.
Methods
- ```public Wordle(String word)```
	- Initializes a Wordle object, and all of the class instance variables
	- Takes a parameter ```word``` which is the secret word for this game
- ```public boolean guessCorrect(String guess)```
	- Compares the user's guess with a secretWord
	- Takes a parameter  which is the user's guess
	- Returns true if the guess matches the secret word and false if not
- ```public String getHint(String guess)```
	- Takes the user's guess and compares it with the secretWord. Creates a new String indicating correct letters, out of place letters and incorrect letters.
	- This method returns the hint String
	- This method also updates the list of possible letters 
- ```public getSecretWord()```
	- Returns the secret word
- ```public getLetters()```
	- Returns the list of letters

## Example Console Output
![Pasted image 20230821122642](https://github.com/gormes-EPIC/Wordle/assets/134316348/a60677e1-5a37-4f14-9e55-1cd581a9ac04)


## Deliverable
- Your Java project with a completed *PlayWordle.java* and *Wordle.java* file. Adhere to the Style Guidelines.
- Completed README.md file that answers the provided questions.

## Questions
- What is object-oriented programming?
- What is a constructor? What do we use it for? What happens when we don't define one?
- What is the generic syntax for a method header in Java?
- What is the difference between *public* and *private*?
- How would I use Math.random() to get a random integer from 1 to 10?
