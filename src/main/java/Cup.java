import java.util.ArrayList;

public class Cup {
    private ArrayList<Die> cup;

    /**
     * Constructor of cup with the amount of die it should contains
     * @param amount
     */
    public Cup(int amount){
        this.cup = new ArrayList<Die>();
        for(int i = 0; i < amount; ++i){
            cup.add(new Die());
        }
    }

    /**
     * Roll all dice inside the cup
     */
    public void roll(){
        for (Die i: cup) {
            i.roll();
        }
    }

    /**
     * Get value of the dice inside the cup
     * @return Sum of dice
     */
    public int getTotal(){
        int totalVal = 0;
        for (Die i : cup){
            totalVal += i.getFaceValue();
        }
        return totalVal;
    }
}
