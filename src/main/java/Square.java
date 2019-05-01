abstract class Square {
    private String name;

    /**
     * Constructor of Square
     * @param name : Name of the square
     */
    public Square(String name){
        this.name = name;

    }

    /**
     * Get the name of the square
     * @return its name
     */
    public String getName() {
        return name;
    }

    public abstract void landedOn(Player player);
}
