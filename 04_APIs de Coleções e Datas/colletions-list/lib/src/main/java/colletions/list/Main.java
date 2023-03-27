package colletions.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> listaMercado = new ArrayList<>();
		
		//Adicionando elementos em uma lista
		listaMercado.add("arroz");
		listaMercado.add("ovo");
		listaMercado.add("feijão");
		listaMercado.add("sal");
		
		//Ordenando uma lista
		Collections.sort(listaMercado);
		
		System.out.println(listaMercado);
		
		System.out.println("----------------------");
		
		for(String item: listaMercado) {
			System.out.println("Item: " + item);
		}
		
		System.out.println("----------------------");
		
		for(int i = 0; i < listaMercado.size(); i++) {
			System.out.println("Item: " + listaMercado.get(i));
		}
		
		System.out.println("----------------------");
		
		//Removendo elementos em uma lista
		listaMercado.remove(2);
		listaMercado.remove("sal");
		System.out.println(listaMercado);
		
		System.out.println("----------------------");
		
		//Encontrando elementos em uma lista
		System.out.println(listaMercado.contains("arroz"));
		System.out.println("Posição do feijão: " + listaMercado.indexOf("feijão"));
		System.out.println("Posição do farinha: " + listaMercado.indexOf("farinha"));
	}
}
