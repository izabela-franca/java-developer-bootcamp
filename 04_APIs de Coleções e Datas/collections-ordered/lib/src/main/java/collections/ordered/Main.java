package collections.ordered;

import java.util.Set;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) {
		
		//TreeSet - Listas ordenadas 
		Set<Character> alphabet = new TreeSet<>();
		
		alphabet.add('b');
		alphabet.add('a');
		alphabet.add('f');
		alphabet.add('c');
		alphabet.add('e');
		alphabet.add('d');
		
		System.out.println(alphabet);
		
		
		Set<Character> reverseAlphabet = new TreeSet<>(new ReverseComparator());
		
		reverseAlphabet.add('b');
		reverseAlphabet.add('a');
		reverseAlphabet.add('f');
		reverseAlphabet.add('c');
		reverseAlphabet.add('e');
		reverseAlphabet.add('d');
		
		System.out.println(reverseAlphabet);
		
		
		System.out.println("-------------Mês-------------");
		
		Mes m1 = new Mes("Janeiro", 1);
		Mes m2 = new Mes("Abril", 4);
		Mes m3 = new Mes("Março", 3);
		Mes m4 = new Mes("Fevereiro", 2);
		
		Set<Mes> meses = new TreeSet<>();
		
		meses.add(m1);
		meses.add(m2);
		meses.add(m3);
		meses.add(m4);
		
		System.out.println(meses);
	}
}
