import static java.lang.Math.min;

public class IncomeTaxSquare extends Square {
    private final int MAXTOPAY = 200;
    public IncomeTaxSquare(String name){
        super(name);
    }


    /**
     * On retire de l'argent quand le player tombe dessus
     * @param player
     */
    @Override
    public void landedOn(Player player) {
        int worth = player.getNetWorth();
        player.reduceCash(min(worth / 10, MAXTOPAY));
    }
}
