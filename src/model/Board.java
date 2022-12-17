package model;

public class Board {
	
	private Piece[][] pieces;
	private Piece selPiece = null; // Selected Piece
	private Color turn = Color.WHITE;
	
	public static final int MOVETIME = 10000;
	
	public Board(int rows, int columns) {
		this.pieces = new Piece[rows][columns];
	}
	
	public Piece getPiece(int row, int column) {
		return this.pieces[row][column];
	}
	
	// Add a Piece on the Board
	public void addPiece(Piece piece) {
		this.pieces[piece.getRown()][piece.getColumn()] = piece;
	}
	
	
	

}
