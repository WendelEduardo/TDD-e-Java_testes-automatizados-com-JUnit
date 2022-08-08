package br.com.alura.tdd;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraTest {
	
	@Test
	public void deveriaSomarDoisNumeroPositivos() {
		Calculadora calculadora = new Calculadora();
		int somar = calculadora.somar(3, 7);
		
		Assert.assertEquals(12, somar);
	}
	
}
