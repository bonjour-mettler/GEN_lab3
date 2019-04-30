import java.util.ArrayList;

public class Player {
    private String name;
    private Piece owns;
    private ArrayList<Die> dice;
    private Board board;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void takeTurn() {
        int totFV = 0;
        for (Die die : this.dice) {
            die.roll();
            totFV += die.getFaceValue();
        }
        if(totFV > 10){
            System.out.println(this.name + " rolled a magnificient " + totFV + " !");
        }
        else
            System.out.println(this.name + " rolled " + totFV + " !");

        Square oldLoc = this.owns.getLocation();
        Square newLoc = this.board.getSquare(oldLoc, totFV);
        this.owns.setLocation(newLoc);
        System.out.println("Moved from " + oldLoc.getName() + " to " + newLoc.getName());
    }

    public void setDice(ArrayList<Die> dice) {
        this.dice = dice;
    }

    public void setPiece(Piece owns) {
        this.owns = owns;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
