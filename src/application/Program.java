/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import Boardgame.Board;
import Boardgame.Position;
import Chess.ChessMatch;

/**
 *
 * @author matheus.boff
 */
public class Program {
    public static void main (String args[]){
        
        
        ChessMatch ch = new ChessMatch();
        
        UI.printBoard(ch.getPieces());
        
    }
}
