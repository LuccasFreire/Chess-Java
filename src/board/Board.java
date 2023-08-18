package board;

public class Board {
	
	private int rows;
	private int columns;
	
	private Piece[][] pieces;

	public Board(int rows, int column) {
		this.rows = rows;
		this.columns = column;
		pieces = new Piece[rows][column];
	}
	
	
}
