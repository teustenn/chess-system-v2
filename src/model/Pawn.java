package model;

public class Pawn extends Piece {
	
	private Boolean firstMove = true;

	public Pawn(String img, Integer rown, Integer column, Color color) {
		super(img, rown, column, color);
	}
	
	@Override
	public boolean validMove(int targetRow, int targetCol) {
		return true;
	}

}
