import java.util.ArrayList;

public class Board {
    private ArrayList SquareList;

    public Board(){
        SquareList = new ArrayList<Square>();
        SquareList.add(new Square("Go"));
        for (int i = 1; i < 40; ++i){
            SquareList.add(new Square("Square"+i));
        }

    }

    public Square getSquare(Square oldLoc, int offset){
        return (Square) SquareList.get((SquareList.indexOf(oldLoc) + offset) % 40);
    }
}
