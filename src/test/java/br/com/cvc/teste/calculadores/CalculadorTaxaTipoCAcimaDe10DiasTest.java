package br.com.cvc.teste.calculadores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadorTaxaTipoCAcimaDe10DiasTest {
	
	private CalculadoraTaxa calculadoraDeTaxa;
	
	private long numeroDeDias;
	private double valor = 100.0;
	private final double TAXA_PADRAO = 8.2;

	@Before
	public void setup() {
		calculadoraDeTaxa = new CalculadorTaxaTipoCAcimaDe10Dias(null);

	}

	@Test
	public void calculaTaxaTest() {
		numeroDeDias = 11;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		Assert.assertEquals(TAXA_PADRAO, taxa, 0);
	}
	
	
	@Test
	public void naoCalculaTaxaTest() {
	
		numeroDeDias = 21;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		
		Assert.assertNotEquals(0, TAXA_PADRAO, taxa);
		Assert.assertEquals(-1.0,taxa, 0.0);
		
	}

}
