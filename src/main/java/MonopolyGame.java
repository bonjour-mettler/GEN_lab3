import java.security.InvalidParameterException;
import java.util.ArrayList;

public class MonopolyGame {
    private Cup cup;
    private Board onBoard;
    private ArrayList<Player> players;
    private int roundCnt;

    /**
     * Constructof MonopolyGame with given players
     * @param players the players who play The Monopoly
     */
    public MonopolyGame(ArrayList<Player> players){

        // We check that given parameters are OK
        if(players.size() > 8 || players.size() < 2){
            throw new InvalidParameterException("players need to be at least 2 and no more than 8");
        }

        // We create 2 die for the Game
        this.cup = new Cup(2);

        // We create the container for our players
        this.players = new ArrayList<Player>();
        // We create the board for the game (create the Squares)
        this.onBoard = new Board();

        // We add the players given
        this.players.addAll(players);
        // For each player we create a Piece and put it on the Go Square, we pass the board and the cup too for functional purposes
        for(Player currentPlayer : this.players) {
            // We add necessary content to Players
            currentPlayer.setCup(this.cup);
            currentPlayer.setPiece(new Piece("Piece of " + currentPlayer.getName(), this.onBoard.getGo()));
            currentPlayer.setBoard(this.onBoard);

        }
        // We set the current round to 0
        this.roundCnt = 0;
    }

    /**
     * Constructor of the MonopolyGame given the number of players, respect to the diagram given
     * @param numberOfPlayers number of players that will play
     */
    public MonopolyGame(final int numberOfPlayers) {
        // We create a list of player and pass it to the other constructor
        // Source for ArrayList init : https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
        this(new ArrayList<Player>() {
                 {
                     for(int i = 0; i < numberOfPlayers; ++i){
                         add(new Player("Generated player " + i));
                     }
                 }
        });
    }

    /**
     * Permit to launch game with given number of rounds
     * @param N number of rounds to play
     */
    public void playGame(int N){
        // We simply play each round based on N
        while(this.roundCnt < N) {
            this.playRound();
            roundCnt++;
        }
    }

    /**
     * Play a round
     */
    private void playRound() {
        System.out.println("\n\tRound : " + this.roundCnt);
        // We simply make play the players in order for each turn
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

        try {
            MonopolyGame theGame = new MonopolyGame(players);
            // Start the game
            theGame.playGame(20);

            MonopolyGame theGame2 = new MonopolyGame(8);
            theGame2.playGame(20);
        } catch (InvalidParameterException e) {
            System.out.println(e);
        }
    }
}
