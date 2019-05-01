public class Piece {
    private String name;
    private Square location;

    /**
     * Constructor of a Piece
     * @param name name to give to the piece
     * @param location Location where the Piece is placed
     */
    Piece(String name, Square location){
        this.name = name;
        this.location = location;
    }

    /**
     * Function to retrieve the name of the Piece
     * @return the name of the Piece
     */
    public String getName() {
        return name;
    }

    /**
     * Function to retrieve location Square
     * @return
     */
    public Square getLocation() {
        return location;
    }

    /**
     * Set the location of the piece to given Square
     * @param location new location of the piece
     */
    public void setLocation(Square location) {
        this.location = location;
    }
}
