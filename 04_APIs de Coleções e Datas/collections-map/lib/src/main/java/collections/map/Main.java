package collections.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		Map<Integer, String> meses = new HashMap<>();
		
		meses.put(1, "Janeiro");
		meses.put(2, "Fevereiro");
		meses.put(3, "Março");
		meses.put(4, "Abril");
		
		System.out.println(meses);
		
		//Acessando um elemento através da chave
		String m1 = meses.get(1);
		System.out.println(m1);
		Boolean m2 = meses.containsKey(2);
		System.out.println(m2);
		Boolean m3 = meses.containsValue("Março");
		System.out.println(m3);
		
		//Buscando tas as chaves
		Set<Integer> numeros =  meses.keySet();
		System.out.println(numeros);
		
		//Buscando todos os valores
		Collection<String> nomes = meses.values();
		System.out.println(nomes);
		
		//Buscando chaves e valores
		Set<Map.Entry<Integer, String>> entries = meses.entrySet();
		System.out.println(entries);
		
		for(Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
