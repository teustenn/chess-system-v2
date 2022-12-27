package model;

public class Board {
	
	private Piece[][] pieces;
	private Piece selPiece = null; // Selected Piece
	private Color turn = Color.WHITE;
	
	
	public static final int MOVETIME = 10000;
	
	
	public Board() {
		this.pieces = new Piece[8][8];
	}
	
	
	public Piece getPiece(int row, int column) {
		return this.pieces[row][column];
	}
	
	
	// Add a Piece on the Board
	public void addPiece(Piece piece) {
		this.pieces[piece.getRow()][piece.getColumn()] = piece;
		piece.setBoard(this);
	}

	
	// Select or Deselect a Piece
	public void selectPiece(Piece piece) {
		if (piece.isSelected()) {
			piece.setSelected(false); // Deselect the Piece
			selPiece = null; // Deselect the Piece on the Board
		}
		else {
			piece.setSelected(true); // Select the Piece
			selPiece = piece; // Select the Piece on the Board
		}
	}
	
	
	// 
	public void movePiece(Piece piece, int destinyRow, int destinyColumn) {
		
	}
	
	
	public void nextTurn() {
		turn = turn.equals(Color.WHITE) ? turn = Color.BLACK : Color.WHITE;
	}

}
