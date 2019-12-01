package a8;

public class Model {
    private int size;
    private int[][] board;

    // Movement directions
    public enum Direction {
        NORTH, SOUTH, EAST, WEST
    }

    // Setup new board
    public Model(int size) {
        this.size = size;
        reset();
    }

    // Get size of the board
    public int getSize() {
        return size;
    }

    // Resets game
    public void reset() {
        board = new int[size][size];
    }
}
