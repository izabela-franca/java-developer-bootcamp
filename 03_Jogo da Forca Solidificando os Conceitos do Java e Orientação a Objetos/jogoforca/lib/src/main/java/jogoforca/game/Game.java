package jogoforca.game;

import jogoforca.core.Word;

public class Game {

	public void start() {
		Word word = new Word("casa");
		word.hasChar('A');
		word.hasChar('c');
		word.hasChar('s');
		System.out.println(word.discovered());
		System.out.println(word);
	}
	
}
