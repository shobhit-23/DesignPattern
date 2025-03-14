package chessgame.pieces;

import chessgame.Board;
import chessgame.Color;

public class King extends Piece{
    public King(Color color, int row, int col) {
        super(color, row, col);
    }

    @Override
    public boolean canMove(Board board, int desRow, int destCol) {
        int rowDiff=Math.abs(desRow-row);
        int colDiff=Math.abs(destCol-col);
        return rowDiff<=1 && colDiff<=1;
    }
}
