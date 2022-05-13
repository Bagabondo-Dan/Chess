package main;

public class Knight extends Piece {
    private static final String name = "Knight" ;
    public Knight(Spot spot, String id, boolean white, boolean killed) {
        super(name, spot, id, white, killed);
    }
}
