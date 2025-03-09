package chessgame.pieces;

import chessgame.Board;
import chessgame.Color;

public abstract class Piece {
    protected final Color color;
    protected int row;
    protected int col;

    protected Piece(Color color,int row,int col) {
        this.color = color;
        this.row=row;
        this.col=col;
    }

    public abstract boolean canMove(Board board, int desRow, int destCol);

    public Color getColor() {
        return color;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
