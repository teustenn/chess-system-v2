package model;

public class Rook extends Piece {
	
	public Rook(Integer rown, Integer column, Color color) {
		super("C:/Users/Teus/Desktop/img/" + color + "Rook" + ".png", rown, column, color);
	}

	
	public Rook(String img, Integer rown, Integer column, Color color) {
		super(img, rown, column, color);
	}

	
	@Override
	public boolean validMove(int rowTarget, int colTarget) {
		return true;
	}

}
