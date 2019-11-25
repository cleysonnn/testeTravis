package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculadora {
	
	
		Calculadora cal = new  Calculadora();
	
	
	@Test
	public void somar() {
		assertEquals(2, cal.somar(5, 2))
		
	}
	
	
	@Test
	public void sub () {
		assertEquals(0, cal.sub(2, 2));
	}
	
	@Test
	public void mult () {
		assertEquals(4, cal.mult(2, 2));
	}
	
	
}
