package view;

import javax.swing.JPanel;

public class JCell extends JPanel {

	private int row, column;
	
	private JPiece jPiece;

	public JCell(int row, int column) {
		this.row = row;
		this.column = column;
	}

}
