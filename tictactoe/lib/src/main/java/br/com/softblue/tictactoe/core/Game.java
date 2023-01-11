package br.com.softblue.tictactoe.core;

import java.io.IOException;

import br.com.softblue.tictactoe.Constants;
import br.com.softblue.tictactoe.score.FileScoreManager;
import br.com.softblue.tictactoe.score.ScoreManager;
import br.com.softblue.tictactoe.ui.UI;

public class Game {
	
	private Board board = new Board();
	private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	private int currentPlayerIndex = -1;
	private ScoreManager scoreManager;
	

	public void play() throws IOException {
		scoreManager = createScoreManager();
		
		UI.printGameTitle();

		for (int i = 0; i < players.length; i++) {
			players[i] = createPlayer(i);
		}
		
		
		boolean gameEnded = false;
		Player currentPlayer = nextPlayer();
		Player winner = null;
		
		while(!gameEnded) {
			
			board.print();

			boolean sequenceFound;
			
			try {
				sequenceFound = currentPlayer.play();				
			} catch (InvalidMoveException e) {
				UI.printText("ERROR: " + e.getMessage());
				continue;
			}
			
			if(sequenceFound) {
				gameEnded = true;
				winner = currentPlayer;
			} else if (board.isFull()){ 
				gameEnded = true;
			} else {
				currentPlayer = nextPlayer();
			}

		}
		
		if (winner == null) {
			UI.printText("It's a tie!");
		} else {
			UI.printText("Player '" + winner.getName() + "' wins!");
			
			scoreManager.saveScore(winner);
		}
		
		board.print();
		UI.printText("The end!");
	}
	
	private Player createPlayer(int index) {
		String name = UI.readInput("Player " + (index + 1) + " => ");
		char symbol = Constants.SYMBOL_PLAYERS[index];
		Player player = new Player(name, board, symbol);
		
		Integer score = scoreManager.getScore(player);
		
		if (score != null) {
			UI.printText(player.getName() + " has won " + score + " match(es)!");
		}
		
		UI.printText("Player '" + name + "' is using the symbol '" + symbol + "'");
		
		return player;
	}
	
	private Player nextPlayer() {
		currentPlayerIndex++;
		
		if (currentPlayerIndex >= players.length) {
			currentPlayerIndex = 0;
		}
		return players[currentPlayerIndex];
	}
	
	private ScoreManager createScoreManager() throws IOException{
		return new FileScoreManager();
	}
}
