package br.com.cvc.teste.calculadores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cvc.teste.calculadores.CalculadorTaxaTipoCAcimaDe30Dias;
import br.com.cvc.teste.calculadores.CalculadoraTaxa;

public class CalculadorTaxaTipoCAcimaDe30DiasTest {
	
	private CalculadoraTaxa calculadoraDeTaxa;
	private long numeroDeDias;
	private double valor = 131.0;
	private final double RETORNO_ESPERADO = 5.24;

	@Before
	public void setup() {
		calculadoraDeTaxa = new CalculadorTaxaTipoCAcimaDe30Dias(null);
	}

	@Test
	public void calculaTaxaTest() {
		numeroDeDias = 31;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		Assert.assertEquals(RETORNO_ESPERADO, taxa, 0);
	}
	
	
	@Test
	public void naoCalculaTaxaTest() {
		numeroDeDias = 41;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		
		Assert.assertNotEquals(RETORNO_ESPERADO, taxa, 0);
		Assert.assertEquals(-1.0,taxa, 0.0);
		
	}

}
