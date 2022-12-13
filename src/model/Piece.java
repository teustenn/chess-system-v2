package model;

public abstract class Piece {
	
	private String img;
	private Integer rown, column;
	private Boolean eliminated = false;
	private Boolean selected = false;
	private Color color;
	
	
	// Constructor
	public Piece(String img, Integer rown, Integer column, Color color) {
		this.img = img;
		this.rown = rown;
		this.column = column;
		this.color = color;
	}
	
	
	// Getters & Setters
	public Integer getRown() {
		return rown;
	}


	public void setRown(Integer rown) {
		this.rown = rown;
	}


	public Integer getColumn() {
		return column;
	}


	public void setColumn(Integer column) {
		this.column = column;
	}
	
	
	// Movement Validation Method
	public abstract boolean validMove(int rowTarget, int colTarget) {
		return true;
	}
}
