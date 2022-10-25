package izabela.franca.tictactoe.core;

import izabela.franca.tictactoe.Constants;
import izabela.franca.tictactoe.ui.UI;

public class Board {

	private char[][] matrix = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];

	// Criando um construtor para ser chamado automaticamente quando criarmos um obj
	public Board() {
		clear();
	}

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
			for (int c = 0; c < matrix[l].length; c++) {
				UI.printTextWithoutNewLine(String.valueOf(matrix[l][c]));
				if (c < matrix.length - 1) {
					UI.printTextWithoutNewLine(" | ");
				}
			}
			UI.printNewLine();
			if (l < matrix.length - 1) {
				UI.printText("----------");
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

	public boolean play(Player player, Move move) {
		int l = move.getL();
		int c = move.getC();

		matrix[l][c] = player.getSymbol();

		return checkRows(player) || checkCols(player) || checkDiagonal1(player) || checkDiagonal2(player);
	}

	private boolean checkRows(Player player) {

		for (int l = 0; l < Constants.BOARD_SIZE; l++) {
			if (checkRow(l, player)) {
				return true;
			}
		}

		return false;
	}

	private boolean checkRow(int l, Player player) {
		char symbol = player.getSymbol();

		for (int c = 0; c < Constants.BOARD_SIZE; c++) {
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

	private boolean checkCol(int c, Player player) {
		char symbol = player.getSymbol();

		for (int l = 0; l < Constants.BOARD_SIZE; l++) {
			if (matrix[l][c] != symbol) {
				return false;
			}
		}

		return true;
	}

	private boolean checkDiagonal1(Player player) {
		char symbol = player.getSymbol();

		for (int l = 0; l < Constants.BOARD_SIZE; l++) {
			if (matrix[l][l] != symbol) {
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
