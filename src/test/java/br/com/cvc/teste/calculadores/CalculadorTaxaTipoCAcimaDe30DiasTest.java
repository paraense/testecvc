package br.com.cvc.teste.calculadores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadorTaxaTipoCAcimaDe30DiasTest {
	
	private CalculadoraTaxa calculadoraDeTaxa;
	private long numeroDeDias;
	private double valor = 100.0;
	private final double TAXA_PADRAO = 4.7;

	@Before
	public void setup() {
		calculadoraDeTaxa = new CalculadorTaxaTipoCAcimaDe30Dias(null);
	}

	@Test
	public void calculaTaxaTest() {
		numeroDeDias = 31;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		Assert.assertEquals(TAXA_PADRAO, taxa, 0);
	}
	
	
	@Test
	public void naoCalculaTaxaTest() {
		numeroDeDias = 41;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		
		Assert.assertNotEquals(0, TAXA_PADRAO, taxa);
		Assert.assertEquals(-1.0,taxa, 0.0);
		
	}

}
