import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares;

    public Board(){
        // We add the first Square
        squares.add(new Square("Go"));
        // We then add the others squares
        for(int i = 0; i < 39; ++i){
            String name = "Square " + Integer.toString(i);
            squares.add(new Square(name));
        }
    }
}