package model;

public class Rock extends Piece {

	public Rock(String img, Integer rown, Integer column, Color color) {
		super(img, rown, column, color);
	}

	@Override
	public boolean validMove(int rowTarget, int colTarget) {
		return true;
	}

}
