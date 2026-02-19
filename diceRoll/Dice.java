package concepts.diceRoll;

import java.util.Random;

public class Dice {

    private int value;

    public Dice(){
        this.value = 1;
    }

    public void diceRoll(){
        Random random = new Random();
        this.value = random.nextInt(6) + 1;
    }

    public int getValue(){
        return this.value;
    }

}
