import java.util.ArrayList;

public class MonopolyGame {
    private ArrayList<Die> dice;
    private Board onBoard;
    private ArrayList<Player> players;
    private int roundCnt;

    public MonopolyGame(ArrayList<Player> players){

        this.dice = new ArrayList<Die>();
        dice.add(new Die());
        dice.add(new Die());

        this.players = new ArrayList<Player>();

        this.onBoard = new Board();

        // TODO: contrôler qu'il y a 2 players
        this.players.addAll(players);
        for(Player currentPlayer : this.players) {
            currentPlayer.setDice(this.dice);
            currentPlayer.setPiece(new Piece("Piece of " + currentPlayer.getName(), this.onBoard.getGo()));
            currentPlayer.setBoard(this.onBoard);
        }
        this.roundCnt = 0;
    }

    public void playGame(int N){
        while(this.roundCnt < N) {
            this.playRound();
            roundCnt++;
        }
    }

    private void playRound() {
        System.out.println("Round : " + this.roundCnt);
        for (Player currentPlayer : this.players) {
            currentPlayer.takeTurn();
        }
    }


    public static void main(String[] args) {
        // We add players to the game
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("The amazing Mickael"));
        players.add(new Player("The wicked Sam"));

        MonopolyGame theGame = new MonopolyGame(players);

        // Start the game
        theGame.playGame(20);
    }
}
