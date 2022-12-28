package application;

import javax.swing.JFrame;

import model.Board;
import view.JBoard;

public class JChess extends JFrame {
	
	
	public JChess() {
		setTitle("Chess Match");	
		this.add(new JBoard(new Board()));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new JChess();
	}
	
}
