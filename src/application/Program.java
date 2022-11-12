/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import Boardgame.Board;
import Boardgame.Position;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
import java.util.Scanner;

/**
 *
 * @author matheus.boff
 */
public class Program {
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        ChessMatch ch = new ChessMatch();
        
        while(true) {
        UI.printBoard(ch.getPieces());
        System.out.println();
        System.out.print("Source: ");
        ChessPosition source = UI.readChessPosition(sc);
        
        System.out.println();
        System.out.print("Target: ");
        ChessPosition target = UI.readChessPosition(sc);
        
        ChessPiece capturedPiece = ch.performChessMove(source, target);
        }
    }
}
