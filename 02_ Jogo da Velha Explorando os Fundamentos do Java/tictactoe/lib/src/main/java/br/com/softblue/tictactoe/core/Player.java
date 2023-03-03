package br.com.softblue.tictactoe.core;

import br.com.softblue.tictactoe.ui.UI;

public class Player {
	
	//Attributes
	private String name;
	private Board board;
	private char symbol;
	
	//Constructors
	public Player(String name, Board board, char symbol) {
		this.name = name;
		this.board = board;
		this.symbol = symbol;
	}
	
	//Methods
	private Move inputMove() throws InvalidMoveException {
		String moveStr = UI.readInput("Player " + name + " => ");
		return new Move(moveStr);
	}
	
	public boolean play() throws InvalidMoveException {
		Move move = inputMove();
		return board.play(this, move);
	}

	public String getName() {
		return name;
	}

	public Board getBoard() {
		return board;
	}

	public char getSymbol() {
		return symbol;
	}
	
}
