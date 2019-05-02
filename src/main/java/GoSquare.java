public class GoSquare extends Square {

    /**
     * Constructor of GoSquare with its name
     * @param name
     */
    public GoSquare(String name){
        super(name);
    }

    /**
     * When landed on,the player receive some cash
     * Add cash to the player when landed on
     * @param player
     */
    @Override
    public void landedOn(Player player) {
        player.addCash(200);
    }
}
