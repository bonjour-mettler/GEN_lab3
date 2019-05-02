public class GoToJailSquare extends Square {

    /**
     * Constructor of GoToJailSquare withe a name for the Square
     * @param name
     */
    public GoToJailSquare(String name){
        super(name);
    }

    /**
     * On envoie le joueur en prison quand il tombe dessus
     * @param player
     */
    @Override
    public void landedOn(Player player) {
        player.getOwns().setLocation(player.getBoard().getPrison());
    }
}
