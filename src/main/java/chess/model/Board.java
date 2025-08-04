package chess.model;

public class Board {
    private final int size;

    public Board(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public boolean isValidPosition(Position p) {
        return p.isValid(size);
    }
}
