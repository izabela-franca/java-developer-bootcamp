package jogoforca.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jogoforca.game.GameException;
import jogoforca.utils.RandomUtils;

public class Dictionary {
	
	private static final String FILE_NAME = "dictionary.txt";
	private List<String> words = new ArrayList<>();
	
	private void load() throws GameException{
		
		try (Scanner scanner = new Scanner(getClass().getResourceAsStream("/" + FILE_NAME))) {
			while (scanner.hasNextLine()) {
				String word = scanner.nextLine().trim();
				words.add(word);
			}
			
			if (words.size() == 0) {
				throw new GameException("The word list cannot be empty");
			}
		}
		
	}
	
	public Word nextWord() {
		int pos = RandomUtils.newRandomNumber(0, words.size());
		return new Word(words.get(pos));
	}

}