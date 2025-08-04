package chess;

import chess.logic.Threat;
import chess.model.Position;

public class Main {
    public static void main(String[] args) {
        Threat analyzer = new Threat(8);
        var threateningPositions = analyzer.findThreateningPositions();

        System.out.println("Gefundene Stellungen, in denen sich die Springer bedrohen:");
        for (var pair : threateningPositions) {
            System.out.printf("Weißer Springer: %s, Schwarzer Springer: %s%n", pair.white(), pair.black());
        }

        System.out.printf("Insgesamt %d Stellungen gefunden.%n", threateningPositions.size());
    }
}
