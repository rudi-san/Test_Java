package de.kbs.so9999jb.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import de.kbs.so9999jb.business.Pruefungen;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = null;
 		try {
			Path path	= Paths.get(null, "test.dat");
			list		= Files.readAllLines(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		for (String s : list) {
 			int zahl	= Integer.getInteger(s);
 			String fibText 		= (Pruefungen.isFibonacci(zahl)) ? "eine" : "keine";
 			String divideText	= (Pruefungen.isDivisible(zahl,13)) ? "" : "nicht";
 			System.out.println  (zahl+" ist "+fibText+" eine Fibonacci-Zahl.");
 			System.out.println  (zahl+" ist "+divideText+" teilbar durch 13.");
 		}

	}

}
