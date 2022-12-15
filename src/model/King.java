package model;

public class King extends Piece {

	public King(String img, Integer rown, Integer column, Color color) {
		super(img, rown, column, color);
	}

	@Override
	public boolean validMove(int rowTarget, int colTarget) {
		return true;
	}

}
