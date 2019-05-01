import java.util.Random;

public class Die {
    private int faceValue;
    private Random random;


    /**
     * Constuctor of a Die, create the Random generator
     */
    public Die(){
        this.random = new Random();
    }

    /**
     * Get the current value of the dice
     * @return
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Change the value of the Dice thanks to a random generator
     */
    public void roll(){
        faceValue = random.nextInt(6) + 1;
    }
}
