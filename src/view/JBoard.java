package view;

import java.awt.GridLayout;

import javax.swing.JPanel;

import model.Board;
import model.Piece;

public class JBoard extends JPanel {
	
	private Board board;

	
	public JBoard(Board board) {
		this.board = board;
	}
	
	
	public void drawBoard() {
		this.removeAll();
		this.setLayout(new GridLayout());
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
				JCell jCell;
				Piece piece = this.board.getPiece(i, j);
				
				if (piece == null) {
					jCell = new JCell(i, j);
				}
				else {
					jCell = new JCell(new JPiece(piece));
				}
			}
		}
	}

}
