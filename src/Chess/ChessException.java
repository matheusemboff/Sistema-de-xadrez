/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chess;

import Boardgame.BoardException;

/**
 *
 * @author matheus.boff
 */
public class ChessException extends BoardException{
    private static final long serialVersionUID = 1L;
    
    public ChessException(String msg){
        super(msg);
    }
}
