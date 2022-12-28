package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import model.Piece;

public class JPiece extends JLabel {

	private Piece piece;

	
	public JPiece(Piece piece) {
		this.setText("ROOK");
		this.piece = piece;
		this.setIcon(new ImageIcon(piece.getImg()));
	}

	
	public Piece getPiece() {
		return this.piece;
	}
	
}
