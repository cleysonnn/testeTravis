package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class testCalculadora {
	
	calculadora cal = new  calculadora();
	
	
	@Test
	public void somar() {
		assertEquals(4, cal.somar(2, 2));
		
	}

}
