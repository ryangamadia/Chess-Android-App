package com.CS213.model;

public class Rook extends ChessPiece {

	public String getInitial() { return "R"; }
	
	public String getPieceName() { return "rook"; }

	public boolean isValidMove(Square dest) {

		//means not horizontal or vertical move.
		if (getLocation().getY() != dest.getY() && getLocation().getX() != dest.getX()) return false;
		
		return this.clearPathTo(dest);
	}

	
}
