//Sets não permitem elementos repetidos

package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("---------Números---------");
		
		//HashSet - não segue ordem de inserção
		Set<Integer> numeros = new HashSet<>();
		
		numeros.add(1);
		numeros.add(5);
		numeros.add(2);
		numeros.add(6);
		numeros.add(3);
		
		for(int n : numeros) {
			System.out.println("=> " + n);
		}
		
		System.out.println("------");
		
		//LinkedHashSet - garante a ordem de inserção
		Set<Integer> numeros2 = new LinkedHashSet<>();
		
		numeros2.add(1);
		numeros2.add(5);
		numeros2.add(2);
		numeros2.add(6);
		numeros2.add(3);
		
		for(int n : numeros2) {
			System.out.println("=> " + n);
		}
		
		System.out.println("------");
		
		//Como saber se determinado elemento existe
		System.out.println(numeros.contains(5));
		System.out.println(numeros2.contains(12));
		
		
		System.out.println("---------Mês---------");
		
		Mes m1 = new Mes("Janeiro", 1);
		Mes m2 = new Mes("Fevereiro", 2);
		Mes m3 = new Mes("Março", 3);
		Mes m4 = new Mes("Abril", 4);
		
		Set<Mes> meses = new HashSet<>();
		meses.add(m1);
		meses.add(m2);
		meses.add(m3);
		meses.add(m4);
		
		//Métodos Equals e Hashcode precisam ser implementados
		Mes m5 = new Mes("Fevereiro", 2);
		meses.add(m5);
		
		System.out.println(meses);
	}
}
;