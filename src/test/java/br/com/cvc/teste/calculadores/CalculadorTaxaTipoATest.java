package br.com.cvc.teste.calculadores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadorTaxaTipoATest {

	private CalculadoraTaxa calculadoraDeTaxa;
	private long numeroDeDias;
	private double valor = 100.0;

	@Before
	public void setup() {
		calculadoraDeTaxa = new CalculadorTaxaTipoA(null);

	}

	@Test
	public void calculaTaxaTest() {
		numeroDeDias = 0;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		Assert.assertEquals(0, 6.0, taxa);
	}
	
	
	@Test
	public void naoCalculaTaxaTest() {
	
		numeroDeDias = 1;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		
		Assert.assertNotEquals(0, 6.0, taxa);
		Assert.assertEquals(-1.0,taxa, 0.0);
		
	}


}
