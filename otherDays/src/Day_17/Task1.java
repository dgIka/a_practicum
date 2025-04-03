package Day_17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] whitePieces = new ChessPiece[8];
        for (int i = 0; i < 8; i++) {
            if (i < 4) {
                whitePieces[i] = ChessPiece.PAWN_WHITE;
            } else whitePieces[i] = ChessPiece.ROOK_BLACK;
        }
        System.out.println(Arrays.toString(whitePieces));

        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][]{
                {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK},
                {ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KING_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY},
                {ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE, ChessPiece.EMPTY}
        });
        chessBoard.print();
    }
}
