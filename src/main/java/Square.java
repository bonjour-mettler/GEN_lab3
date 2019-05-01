public class Square {
    private String name;
    private Board board;
    private Piece[] piecesOnSquare;


    public Square(String name){
        this.name = name;
        piecesOnSquare = new Piece[8];
    }

    public String getName() {
        return name;
    }

}
