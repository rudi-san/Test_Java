package de.kbs.so9999jb.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import de.kbs.so9999jb.business.Pruefungen;

public class TestKlasse {

	@Test
	public void p8 () {
		assertTrue(Pruefungen.isFibonacci(8));
	}
	@Test
	public void p15 () {
		assertFalse(Pruefungen.isFibonacci(15));
	}
	@Test
	public void power() {
		assertEquals(125, Pruefungen.computePower(5, 3)); 
	}
	
	@Test
	public void exceptionTest () {
		try {
			Pruefungen.getInt("abc");
			fail("Hier soll eine Exception geworfen werden.");
		} catch (Exception e) {
			
		}
	}
	
	@Test(expected=NumberFormatException.class)
	public void errorTest() {
		Integer.parseInt("abc");
	}
}
