package chess.model;

import java.util.ArrayList;
import java.util.List;

public class Knight {
    private static final int[][] MOVES = {
            {-2, -1}, {-2, +1}, {-1, -2}, {-1, +2},
            {+1, -2}, {+1, +2}, {+2, -1}, {+2, +1}
    };

    public static List<Position> possibleMoves(Position from, int boardSize) {
        List<Position> moves = new ArrayList<>();
        for (int[] move : MOVES) {
            Position newPosition = new Position(from.row() + move[0], from.col() + move[1]);
            if (newPosition.isValid(boardSize)) {
                moves.add(newPosition);
            }
        }
        return moves;
    }

    public static boolean threatens(Position from, Position target, int boardSize) {
        return possibleMoves(from, boardSize).contains(target);
    }
}
