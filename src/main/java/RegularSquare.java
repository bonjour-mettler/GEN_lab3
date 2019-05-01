public class RegularSquare extends Square {

    public RegularSquare(String name){
        super(name);
    }


    /**
     * On ne fait rien quand le player tombe dessus
     * @param player
     */
    @Override
    public void landedOn(Player player){}
}
