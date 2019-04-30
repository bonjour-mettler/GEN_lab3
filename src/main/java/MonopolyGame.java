import java.util.ArrayList;

public class MonopolyGame {
    private ArrayList<Die> dies;
    private Board onBoard;
    private ArrayList<Player> players;
    private int roundCnt;

    MonopolyGame(Board playedOn, ArrayList<Die> dies, ArrayList<Player> players){
        this.dies = new ArrayList<Die>();
        this.players = new ArrayList<Player>();

        this.dies.addAll(dies);
        //TODO: contrôler qu'il y a 2 players
        this.players.addAll(players);

        this.onBoard = playedOn;
        this.roundCnt = 0;
    }

    public void playGame(int N){
        while(this.roundCnt < N) {
            this.playRound();
            roundCnt++;
        }
    }

    private void playRound(){
        for(Player currentPlayer : this.players){
            currentPlayer.takeTurn();
        }
    }

    public static void main(String[] args) {
        // We add players to the game
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Mickael"));
        players.add(new Player("Samuel"));

        ArrayList<Die> dies = new ArrayList<Die>();
        dies.add(new Die());
        dies.add(new Die());

        Board theBoard = new Board();

        MonopolyGame theGame = new MonopolyGame(theBoard,dies,players);

        // Start the game
        theGame.playGame(20);
    }
}
