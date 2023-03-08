package jogoforca.game;

import jogoforca.core.Dictionary;
import jogoforca.core.Word;

public class Game {

	public void start() {
		
		Dictionary d = Dictionary.getInstance();
		Word w1 = d.nextWord();
		System.out.println(w1.getOriginalWord());
	}
	
}
