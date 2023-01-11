package br.com.softblue.tictactoe.core;

import br.com.softblue.tictactoe.Constants;
import br.com.softblue.tictactoe.ui.UI;

public class Board {
	
	//Attribute
	private char[][] matrix;
	
	//Constructor
	public Board() {
		matrix = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
		clear();
	}
	
	//Methods
	public void clear() {
		for (int l = 0; l < matrix.length; l++) {
			for (int c = 0; c < matrix[l].length; c++) {
				matrix[l][c] = ' ';
			}
		}
	}
	
	public void print() {
		UI.printNewLine();
		for (int l = 0; l < matrix.length; l++) {
			for(int c = 0; c < matrix[l].length; c++) {
				UI.printTextWithNoNewLine(String.valueOf(matrix[l][c]));
				if (c < matrix[l].length - 1) {
					UI.printTextWithNoNewLine(" | ");
				}
			}
			UI.printNewLine();
			if (l < matrix.length - 1) {
				UI.printText("---------");
			}
		}
	}
	
	public boolean isFull() {
		for (int l = 0; l < matrix.length; l++) {
			for (int c = 0; c < matrix[l].length; c++) {
				if (matrix[l][c] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean play(Player player, Move move) throws InvalidMoveException {
		int l = move.getL();
		int c = move.getC();
		
		if (l < 0 || c < 0 || l >= Constants.BOARD_SIZE || c >= Constants.BOARD_SIZE) {
			throw new InvalidMoveException ("The range of the move is invalid");
		}
		
		if (matrix[l][c] != ' ') {
			throw new InvalidMoveException ("This move has already been made");
		}
		
		matrix[l][c] = player.getSymbol();
		
		
		return checkRows(player) || checkCols(player) || checkDiagonal1(player) || checkDiagonal2(player);
	}
	
	//Checking winner
	
	private boolean checkRow(int l, Player player) {
		char symbol = player.getSymbol();
		
		for (int c = 0;  c < Constants.BOARD_SIZE; c++) {
			if (matrix[l][c] != symbol) {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkRows(Player player) {
		for (int l = 0; l < Constants.BOARD_SIZE; l++) {
			if (checkRow(l, player)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkCol(int c, Player player) {
		char symbol = player.getSymbol();
		
		for (int l = 0;  l < Constants.BOARD_SIZE; l++) {
			if (matrix[l][c] != symbol) {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkCols(Player player) {
		for (int c = 0; c < Constants.BOARD_SIZE; c++) {
			if (checkCol(c, player)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkDiagonal1(Player player) {
		char symbol = player.getSymbol();
		
		for (int i = 0; i < Constants.BOARD_SIZE; i++) {
			if (matrix[i][i] != symbol) {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkDiagonal2(Player player) {
		char symbol = player.getSymbol();
		int lastLine = Constants.BOARD_SIZE - 1;
		
		
		for (int l = lastLine, c = 0; l >= 0; l--, c++) {
			if (matrix[l][c] != symbol) {
				return false;
			}
		}
		return true;
	}
}

