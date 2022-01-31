package de.kbs.so9999jb.business;

import java.util.ArrayList;
import java.util.List;

public class Pruefungen {
	
	private static List<Integer> fibs		= new ArrayList<>();

	public static boolean isDivisible(int zahl, int i) {
		return zahl%i==0;
	}

	public static boolean isFibonacci(int zahl) {
		if (fibs.size()==0||fibs.get(fibs.size()-1)<zahl) {
			fibs.clear();
			int last = 0; int i = 1;
			while (last<zahl) {
				int neu  	= i+last;
				fibs.add	(neu);
				last		= i;
				i			= neu;
			}
		}
		return fibs.contains(zahl);
	}

	public static long computePower(int basis, int exponent) {
		
		long erg		= 1;
		for (int i=0;i<exponent;++i) {
			erg	*= basis;
		}
		
		return erg;
	}

	public static int getInt (String s) throws Exception {
		int i = 0;
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
		}	
		return i;
	}
}
