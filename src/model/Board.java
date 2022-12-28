package model;

public class Board {
	
	private Piece[][] pieces;
	private Piece selPiece = null; // Selected Piece
	private Color turn = Color.WHITE;
	
	
	public static final int MOVETIME = 10000;
	
	
	public Board() {
		this.pieces = new Piece[8][8];
		
		Rook wRook1 = new Rook(7, 0, Color.WHITE);
		Rook wRook2 = new Rook(7, 7, Color.WHITE);
		this.addPiece(wRook1);
		this.addPiece(wRook2);
		
		Rook bRook1 = new Rook(0, 0, Color.BLACK);
		Rook bRook2 = new Rook(0, 7, Color.BLACK);
		this.addPiece(bRook1);
		this.addPiece(bRook2);
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
			selPiece = null; 		  // Deselect the Piece on the Board
		}
		else {
			piece.setSelected(true); // Select the Piece
			selPiece = piece; 		 // Select the Piece on the Board
		}
	}
	
	
	// 
	public void movePiece(Piece piece, int destinyRow, int destinyColumn) {
		
	}
	
	
	public void nextTurn() {
		turn = turn.equals(Color.WHITE) ? turn = Color.BLACK : Color.WHITE;
	}

}
