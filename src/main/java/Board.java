import java.util.ArrayList;

public class Board {

    private ArrayList<Square> squares;

    /**
     * Constuctor of a Board,create the Squares contained
     */
    public Board(){
        squares = new ArrayList<Square>();
        // We add the first Square which is the Go
        squares.add(new GoSquare("Go"));
        // We then add the others squares (39 remaining)
        for(int i = 1; i < 40; ++i){
            if(i == 10){
                squares.add(new RegularSquare("Jail"));
            } else if(i == 20){
                squares.add(new IncomeTaxSquare("IncomeTax"));
            } else if(i == 30){
                squares.add(new GoToJailSquare("GoToJail"));
            } else {
                squares.add(new RegularSquare("Square " + Integer.toString(i)));
            }
        }
    }

    /**
     * Method to give the Squares of the board
     * @return the squares of the board
     */
    public ArrayList<Square> getSquares(){
        return squares;
    }

    /**
     * Method to give the Go Square, necessary when creating Pieces
     * @return the square Go
     */
    public Square getGo(){
        return squares.get(0);
    }

    public Square getPrison(){ return squares.get(10);}

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
