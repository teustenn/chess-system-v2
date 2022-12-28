package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import model.Board;
import model.Piece;

public class JBoard extends JPanel implements MouseListener {
	
	private Board board;

	
	public JBoard(Board board) {
		this.board = board;
		this.drawBoard();
	}
	
	
	public void drawBoard() {
		this.removeAll();
		this.setLayout(new GridLayout(8, 8));
		
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
				
				if ((i + j) % 2 == 0) {
					jCell.setBackground(Color.LIGHT_GRAY);
				}
				else {
					jCell.setBackground(Color.DARK_GRAY);
				}
				this.add(jCell);
				
			}
		}
		
		this.revalidate();
		
	}

}
