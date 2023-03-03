package br.com.softblue.tictactoe.core;

public class Move {
	
	//Attributes
	
	private int l;
	private int c;
	
	//Constructor
	public Move(String moveStr) throws InvalidMoveException {
		try {
			String[] tokens = moveStr.split(",");
			
			this.l = Integer.parseInt(tokens[0]);
			this.c = Integer.parseInt(tokens[1]);
		} catch (Exception e) {
			throw new InvalidMoveException("Invalid move");
		}		
	}
	
	//Methods
	public int getL() {
		return l;
	}

	public int getC() {
		return c;
	}
}
