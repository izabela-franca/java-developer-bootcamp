package jogoforca.game;

import java.util.HashSet;
import java.util.Set;

import jogoforca.core.Config;
import jogoforca.core.Dictionary;
import jogoforca.core.InvalidCharacterException;
import jogoforca.core.Word;
import jogoforca.ui.UI;

public class Game {
	

	public void start() {
		
		UI.print("Bem-vindo ao Jogo da Forca!");
		
		Dictionary dictionary = Dictionary.getInstance();
		Word word = dictionary.nextWord();
		
		UI.print("A palavra tem " + word.size() + " letras!");
		
		Set<Character> usedChars = new HashSet<>();
		int errorCount = 0;
		
		int maxErros = Integer.parseInt(Config.get("maxErros"));
		UI.print("Você possui " + maxErros + " chances para acertar a palavra.");
		
		while(true) {
			UI.print(word);
			UI.printNewLine();
			
			char c;
			try {
				c = UI.readChar("Digite uma letra: ");
				
				if(usedChars.contains(c)) {
					throw new InvalidCharacterException("Esta letra já foi utilizada.");
				}
				
				usedChars.add(c);
				
				if(word.hasChar(c)) {
					UI.print("Você acertou uma letra!");
				} else {
					errorCount++;
					
					if (errorCount < maxErros) {
						UI.print("Você errou! Você ainda tem " + (maxErros - errorCount) + " tentativa(s).");
					}
				}
				
				UI.printNewLine();
				
				if(word.discovered()) {
					UI.print("Parabéns! Você acertou a palavra: " + word.getOriginalWord());
					UI.print("Fim do jogo!");
					break;
				}
				
				if(errorCount == maxErros) {
					UI.print("Você perdeu o jogo. A palavra correta era: " + word.getOriginalWord());
					UI.print("Fim do jogo!");
					break;
				}
				
			} catch (InvalidCharacterException e) {
				UI.print("Erro: " + e.getMessage());
				UI.printNewLine();
			}
		}
	}
	
}
