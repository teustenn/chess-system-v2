package view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JCell extends JPanel {

	private int row, column;
	
	private JPiece jPiece;

	
	public JCell(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	
	public JCell(JPiece jPiece) {
		this.jPiece = jPiece;
		this.row = jPiece.getPiece().getRow();
		this.column = jPiece.getPiece().getColumn();
		this.add(jPiece);
		
		if (jPiece.getPiece() != null & jPiece.getPiece().isSelected()) {
			this.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5));
		}
		
	}

}
