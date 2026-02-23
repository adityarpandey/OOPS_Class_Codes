package concepts.WordGuessingGame;

public class Game {
    protected String wordToGuess;
    protected int attempt;
    protected char[] revealedLetters;

    public Game(String wordToGuess){

        this.wordToGuess = wordToGuess;
        this.attempt = 0;
        this.revealedLetters = new char[wordToGuess.length()];

    }


    public void playGame(){
        System.out.println("Welcome to the Word Guessing Game!");
        System.out.println("Try to guess the word!");
    }

    public void displayHints(){
        System.out.println("Hint: The word has " + wordToGuess.length() + " letters.");
    }

    public String getRevealedWord(){
        return new String(revealedLetters);
    }

}
