package jogoforca.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jogoforca.game.GameException;
import jogoforca.utils.RandomUtils;

public class FileDictionary extends Dictionary{
	
	private static final String FILE_NAME = "dictionary.txt";
	
	private List<String> words = new ArrayList<>();
	
	public FileDictionary() {
		load();
	}
	
	private void load() {
		
		try (Scanner scanner = new Scanner(getClass().getResourceAsStream("/" + FILE_NAME))) {
			
			while(scanner.hasNextLine()) {
				String word = scanner.nextLine().trim();
				words.add(word);
			}
			
			if(words.size() == 0) {
				throw new GameException("A lista não pode ser vazia.");
			}
		}
	}
	
	@Override
	public Word nextWord() {
		int position = RandomUtils.newRandomNumber(0, words.size());
		return new Word(words.get(position));
	}

	@Override
	public String getName() {
		return "Arquivo " + FILE_NAME;
	}
}
