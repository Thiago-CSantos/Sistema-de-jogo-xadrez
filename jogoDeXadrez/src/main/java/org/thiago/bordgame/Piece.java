package org.thiago.bordgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board){
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }
}
