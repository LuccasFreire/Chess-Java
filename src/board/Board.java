package board;

public class Board {
	
	private int rows;
	private int columns;
	
	private Piece[][] pieces;

	public Board(int rows, int column) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least one row and one column!");
		}
		this.rows = rows;
		this.columns = column;
		pieces = new Piece[rows][column];
	}

	public int getRows() {
		return rows;
	}


	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position doesnt exists on the board!");
		}
		return pieces[row][column];
	}
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position doesnt exists on the board!");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	public boolean positionExists(Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There's already a piece on position " + position);
		}
		return positionExists(position.getRow(), position.getColumn());
	}
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position doesnt exists on the board!");
		}
		return piece(position) != null;
	}
}
