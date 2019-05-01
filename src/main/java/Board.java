import java.util.ArrayList;

public class Board {

    private ArrayList<Square> squares;

    public Board(){
        squares = new ArrayList<Square>();
        // We add the first Square
        squares.add(new Square("Go"));
        // We then add the others squares
        for(int i = 1; i < 40; ++i){
            String name = "Square " + Integer.toString(i);
            squares.add(new Square(name));
        }
    }

    public Square getGo(){
        return squares.get(0);
    }

    private int getIndex(Square guess){
        int index;
        for(index = 0; index < 40; ++index){
            if(squares.get(index) == guess){
                break;
            }
        }
        return index;
    }

    public Square getSquare(Square begin, int offset){
        int index = this.getIndex(begin);
        return squares.get((index + offset) % 40);
    }
}
