import java.util.ArrayList;

public class MonopolyGame {
    private ArrayList<Die> dice;
    private Board onBoard;
    private ArrayList<Player> players;
    private int roundCnt;

    /**
     * Constructof MonopolyGame with given players
     * @param players
     */
    public MonopolyGame(ArrayList<Player> players){

        // We create 2 die for the Game
        this.dice = new ArrayList<Die>();
        dice.add(new Die());
        dice.add(new Die());

        // We create the container for our players
        this.players = new ArrayList<Player>();
        // We create the board for the game (create the Squares)
        this.onBoard = new Board();

        // TODO: contrôler qu'il y a 2 players
        // We add the players given
        this.players.addAll(players);
        // For each player we create a Piece and put it on the Go Square, we pass the board and the dice too for functional purposes
        for(Player currentPlayer : this.players) {
            currentPlayer.setDice(this.dice);
            currentPlayer.setPiece(new Piece("Piece of " + currentPlayer.getName(), this.onBoard.getGo()));
            currentPlayer.setBoard(this.onBoard);
        }
        // We set the current round to 0
        this.roundCnt = 0;
    }

    /**
     * Permit to launch game with given number of rounds
     * @param N number of rounds to play
     */
    public void playGame(int N){
        while(this.roundCnt < N) {
            this.playRound();
            roundCnt++;
        }
    }

    /**
     * Play a round
     */
    private void playRound() {
        System.out.println("Round : " + this.roundCnt);
        for (Player currentPlayer : this.players) {
            currentPlayer.takeTurn();
        }
    }

    /**
     * Application launch to play a game
     * @param args
     */
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
