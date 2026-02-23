package concepts.WordGuessingGame;

import java.util.Scanner;

public class InputGame extends Game {

    protected Scanner scanner;

    public InputGame(String wordToGuess){
        super(wordToGuess);
        this.scanner = new Scanner(System.in);

    }


    @Override
    public void playGame(){
        super.playGame();

        String userGuess = "";

        while(!userGuess.equalsIgnoreCase(wordToGuess)){
            displayHints();
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextLine();
            attempt++;

            if(userGuess.equalsIgnoreCase(wordToGuess)){
                System.out.println("🎉 Congratulations! You've guessed the word in " + attempt + " attempts.");
            }else{

                System.out.println("❌ Incorrect guess. Try again!");
                System.out.println("Revealed so far: " + getRevealedWord());

            }
        }
    }

}
