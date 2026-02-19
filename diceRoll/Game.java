package concepts.diceRoll;

public class Game {

    private Dice dice1;
    private Dice dice2;
    private int score;
    private int targetScore;

    public Game(int targetScore){
        this.targetScore = targetScore;
        this.dice1 = new Dice();
        this.dice2 = new Dice();
        this.score = 0;
    }

    void rollDice(){
        dice1.diceRoll();
        dice2.diceRoll();

        System.out.println( "Dice 1 : " + dice1.getValue());
        System.out.println( "Dice 2 : " + dice2.getValue());

        if(dice2.getValue() == dice1.getValue()){
            System.out.println("You rolled a double! Bonus points added.");
            this.score += 10;
        }
    }

    public void displayScore() {
        System.out.println("Current Score: " + this.score);
        System.out.println("Target Score: " + this.targetScore);
    }

    public boolean isTargetReached() {
        return this.score >= this.targetScore;
    }

}
