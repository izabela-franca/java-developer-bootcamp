package jogoforca.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class Dictionary {
	
	private static Dictionary instance;

	//Design Pattern Singleton
	public static Dictionary getInstance() {
		if (instance == null) {
			
			//Criando objetos com base no nome de uma classe
			try {
				String dictionaryClassName = Config.get("dictionaryClassName");
				Class<?> clazz =  Class.forName(dictionaryClassName);
				Constructor<?> constructor =  clazz.getConstructor();
				instance = (Dictionary) constructor.newInstance();	//Polimorfismo: podemos usar o StaticDicionary apenas mudando a instância
						
			} catch (Exception e) {
				throw new RuntimeException(e);
			}	
		}
		return instance;
	}
	
	public abstract Word nextWord();
	
	public abstract String getName();
}
