package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ChessMatch match = new ChessMatch();
		
		while (true) {
			UI.printBoard(match.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(kb);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(kb);
			
			ChessPiece capturedPiece = match.performChessMove(source, target);
		}
	}

}
