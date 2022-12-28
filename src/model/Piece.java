package model;

public abstract class Piece {
	
	private String img; // Image
	private Integer row, column;
	private Boolean eliminated = false;
	private Boolean selected = false;
	
	private Color color;
	private Board board;
	
	
	// Constructor
	public Piece(String img, Integer rown, Integer column, Color color) {
		this.img = img;
		this.row = rown;
		this.column = column;
		this.color = color;
	}
	
	
	// Getters & Setters
	public Integer getRow() {
		return row;
	}


	public void setRow(Integer rown) {
		this.row = rown;
	}


	public Integer getColumn() {
		return column;
	}


	public void setColumn(Integer column) {
		this.column = column;
	}
	
	
	public Board getBoard() {
		return board;
	}


	public void setBoard(Board board) {
		this.board = board;
	}
	

	public Boolean isSelected() {
		return selected;
	}


	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	
	
	public String getImg() {
		return img;
	}


	// Movement Validation Method
	public boolean validMove(int rowTarget, int colTarget) {
		return false;
	}
}
