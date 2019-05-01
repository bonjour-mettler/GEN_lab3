public class Piece {
    private String name;
    private Square location;

    Piece(String name, Square location){
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
