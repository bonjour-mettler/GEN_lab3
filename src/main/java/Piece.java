public class Piece {
    private String name;
    private Square location;
    private Player owner;

    Piece(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
