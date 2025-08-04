package chess.logic;

import chess.model.Board;
import chess.model.Knight;
import chess.model.Position;

import java.util.ArrayList;
import java.util.List;

public class Threat {

    public record KnightPair(Position white, Position black) {}

    private final Board board;

    public Threat(int boardSize) {
        this.board = new Board(boardSize);
    }

    public List<KnightPair> findThreateningPositions() {
        List<KnightPair> results = new ArrayList<>();
        int size = board.size();
        for (int row1 = 0; row1 < size; row1++) {
            for (int col1 = 0; col1 < size; col1++) {
                Position whiteKnight = new Position(row1, col1);

                for (int row2 = 0; row2 < size; row2++) {
                    for (int col2 = 0; col2 < size; col2++) {
                        Position blackKnight = new Position(row2, col2);

                        if (!whiteKnight.equals(blackKnight) &&
                                Knight.threatens(whiteKnight, blackKnight, size) &&
                                Knight.threatens(blackKnight, whiteKnight, size)) {
                            results.add(new KnightPair(whiteKnight, blackKnight));
                        }
                    }
                }
            }
        }

        return results;
    }
}
