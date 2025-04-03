package Day_17;

public class ChessBoard {
    ChessPiece[][] board;
    public ChessBoard(ChessPiece[][] pieces) {
        this.board = pieces;
    }
    public void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }
}
