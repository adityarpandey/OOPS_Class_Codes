package concepts.WordGuessingGame;

import java.util.Random;

public class AdvancedGame extends InputGame{

    private Random random;

    public AdvancedGame(String wordToGuess) {
        super(wordToGuess);
        this.random = new Random();
    }

    @Override
    public void displayHints() {
        super.displayHints();
        if (attempt > 0) {
            revealRandomLetter();
            System.out.println("🔍 Revealed so far: " + getRevealedWord());
        }
    }

    public void revealRandomLetter(){
        int index;
        do{
            index = random.nextInt(wordToGuess.length());
        }while(revealedLetters[index] != '-' );
            revealedLetters[index] = wordToGuess.charAt(index);

    }

}
