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
		
		//TODO Check if the player won
		return false;
	}

}
