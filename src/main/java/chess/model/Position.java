package chess.model;

public record Position(int row, int col) {
    public boolean isValid(int boardSize) {
        return row >= 0 && row < boardSize && col >= 0 && col < boardSize;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", row, col);
    }
}
