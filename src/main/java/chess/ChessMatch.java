package chess;

import boardgame.Board;

// Regras do jogo
public class ChessMatch {

    private Board board;

    // Tabuleiro será 8x8
    public ChessMatch(){
        board = new Board(8, 8);
    }

    // Retornando uma matriz de peças de xadrez com base na partida
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i = 0; i<board.getColumns(); i++){
            for (int j = 0; j<board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }

        return mat;
    }
}
