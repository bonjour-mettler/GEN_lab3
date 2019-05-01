public class IncomeTaxSquare extends Square {

    public IncomeTaxSquare(String name){
        super(name);
    }


    /**
     * Ajout d'argent quand le player tombe dessus
     * @param player
     */
    @Override
    public void landedOn(Player player) {
        player.payTax();
    }
}
