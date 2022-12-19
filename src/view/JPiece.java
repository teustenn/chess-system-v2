package view;

import javax.swing.JLabel;

import model.Piece;

public class JPiece extends JLabel {

	private Piece piece;

	public JPiece(Piece piece) {
		this.piece = piece;
	}

	public Piece getPiece() {
		return piece;
	}
	
}
