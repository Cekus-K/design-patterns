package flyweight.homework;

import flyweight.homework.flyweight.*;

class Main {

    public static void main(String[] args) {

        ChessPiece blackQueen = new BlackQueen("Black Queen");
        ChessPiece whiteQueen = new WhiteQueen("White Queen");
        ChessPiece blackPawn = new BlackPiece("Black Pawn", 7, "a");
        ChessPiece whitePawn = new WhitePiece("White Pawn", 2, "a");
        ChessPiece blackHorse = new BlackHorse("Black Horse", "b");
        ChessPiece whiteHorse = new WhiteHorse("White Horse", "g");

        System.out.println(blackQueen.getColor() == blackPawn.getColor());
        System.out.println(whiteQueen.getColor() == whiteHorse.getColor());
    }
}
