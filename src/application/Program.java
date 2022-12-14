/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import Boardgame.Board;
import Boardgame.Position;
import Chess.ChessException;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author matheus.boff
 */
public class Program {
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        ChessMatch ch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();
        
        while(!ch.getCheckMate()) {
            try{
                UI.clearScreen();
                UI.printMatch(ch, captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);
                
                boolean[][] possibleMoves = ch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(ch.getPieces(),possibleMoves);
                
                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = ch.performChessMove(source, target);
                
                if(capturedPiece != null){
                   captured.add(capturedPiece);
                }
                
                if(ch.getPromoted() != null){
                    System.out.print("Enter piece for promotion (B/N/R/Q): ");
                    String type = sc.nextLine().toUpperCase();
                    while(!type.equals("B") && !type.equals("N") && !type.equals("R") & !type.equals("Q")){
                        System.out.print("Invalid value!! Enter piece for promotion (B/N/R/Q): ");
                        type = sc.nextLine().toUpperCase();
                    }
                    ch.replacePromotedPiece(type);
                }
            }
            catch(ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch(InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        UI.clearScreen();
        UI.printMatch(ch, captured);
    }
}
