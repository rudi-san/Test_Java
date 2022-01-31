package de.rudi.test;

import java.util.Arrays;
import java.util.List;

public class Probe {

	public static void main(String[] args) {
		
		Integer[] array 	= { 2, 4, 6, 0, -22 };
		
		List<Integer> liste = Arrays.asList(array);

		System.out.println(liste.stream().map(i->i*2).reduce(0, (x, y) -> x+y));
		
		String html  =  """
				dies ist ein String, der
				                         über mehrere Zeilen
			geht.
				------------------------------------
				""";
		System.out.println(html);
	}

}
