public class GoSquare extends Square {

    public GoSquare(String name){
        super(name);
    }

    /**
     * Add cash to the player when landed on
     * @param player
     */
    @Override
    public void landedOn(Player player) {
        player.addCash(200);
    }
}
