public class RegularSquare extends Square {

    /**
     * Constructor of regularSquare with its name
     * @param name
     */
    public RegularSquare(String name){
        super(name);
    }


    /**
     * Nothing happens to the player when landed on
     * @param player
     */
    @Override
    public void landedOn(Player player){}
}
