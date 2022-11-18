/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chess;

import Boardgame.Board;
import Boardgame.Piece;
import Boardgame.Position;

/**
 *
 * @author matheus.boff
 */
public abstract class ChessPiece extends Piece{
    
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    public int getMoveCount(){
        return moveCount;
    }
    
    public void increaseMoveCount(){
        moveCount ++;
    }
    
    public void decreaseMoveCount(){
        moveCount--;
    }
    
    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }
    
    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
    
    
}
