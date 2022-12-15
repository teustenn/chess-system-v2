package model;

public class Queen extends Piece {

	public Queen(String img, Integer rown, Integer column, Color color) {
		super(img, rown, column, color);
	}

	@Override
	public boolean validMove(int rowTarget, int colTarget) {
		return true;
	}

}
