import java.util.ArrayList;

public class Board {

    private ArrayList<Square> squares;

    /**
     * Constuctor of a Board,create the Squares contained
     */
    public Board(){
        squares = new ArrayList<Square>();
        // We add the first Square wich is the Go
        squares.add(new Square("Go"));
        // We then add the others squares (39 remaining)
        for(int i = 1; i < 40; ++i){
            String name = "Square " + Integer.toString(i);
            squares.add(new Square(name));
        }
    }

    public ArrayList<Square> getSquares(){
        return squares;
    }

    /**
     * Method to give the Go Square, necessary when creating Pieces
     * @return
     */
    public Square getGo(){
        return squares.get(0);
    }

    /**
     * Get the index of the Square in the squares ArrayList
     * @param guess Square to guess pos
     * @return the id of the square
     */
    public int getIndex(Square guess){
        int index;
        for(index = 0; index < 40; ++index){
            if(squares.get(index) == guess){
                break;
            }
        }
        return index;
    }

    /**
     * Function to get the Square given a start Square and an offset
     * @param begin Start Square
     * @param offset offset from the given ASquare
     * @return the Square correspondng to begin + offset
     */
    public Square getSquare(Square begin, int offset){
        int index = this.getIndex(begin);
        return squares.get((index + offset) % 40);
    }
}
