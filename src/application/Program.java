package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ChessMatch match = new ChessMatch();
		
		while (true) {
			try {
				UI.printBoard(match.getPieces());
				UI.clearScreen();
				
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(kb);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(kb);
				
				ChessPiece capturedPiece = match.performChessMove(source, target);				
			} catch (ChessException e){
				System.out.println(e.getMessage());
				kb.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				kb.nextLine();
			}
		}
	}

}
