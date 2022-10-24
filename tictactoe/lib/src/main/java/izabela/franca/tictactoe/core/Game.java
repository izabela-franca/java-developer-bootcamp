package izabela.franca.tictactoe.core;

import izabela.franca.tictactoe.Constants;
import izabela.franca.tictactoe.ui.UI;

public class Game {

	private Board board = new Board();
	private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];

	public void play() {

		UI.printGameTitle();

		// UI.readInput("Player's name: ");

		board.print();

	}
}
