import static java.lang.Math.min;

public class IncomeTaxSquare extends Square {
    // The max amount we can grab from the player
    private final int MAXTOPAY = 200;
    public IncomeTaxSquare(String name){
        super(name);
    }


    /**
     * We get cash when player is landing on
     * @param player player landing on
     */
    @Override
    public void landedOn(Player player) {
        int worth = player.getNetWorth();
        // We reduce 10% of the NetWorth or MAXTOPAY depending on the min value
        player.reduceCash(min(worth / 10, MAXTOPAY));
    }
}
