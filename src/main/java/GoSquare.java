public class GoSquare extends Square {

    public GoSquare(String name){
        super(name);
    }

    /**
     * Ajout d'argent quand le player tombe dessus
     * @param player
     */
    @Override
    public void landedOn(Player player) {
        player.addCash(200);
    }
}
