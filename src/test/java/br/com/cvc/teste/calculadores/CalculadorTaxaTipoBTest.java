package br.com.cvc.teste.calculadores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cvc.teste.calculadores.CalculadorTaxaTipoB;
import br.com.cvc.teste.calculadores.CalculadoraTaxa;

public class CalculadorTaxaTipoBTest {
	
	private CalculadoraTaxa calculadoraDeTaxa;
	private long numeroDeDias;
	private double valor = 123.0;
	private final double RETORNO_ESPERADO = 12.0;

	@Before
	public void setup() {
		calculadoraDeTaxa = new CalculadorTaxaTipoB(null);

	}

	@Test
	public void calculaTaxaTest() {
		numeroDeDias = 1;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		Assert.assertEquals(RETORNO_ESPERADO, taxa, 0);
	}
	
	
	@Test
	public void naoCalculaTaxaTest() {
	
		numeroDeDias = 11;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		
		Assert.assertNotEquals(RETORNO_ESPERADO, taxa, 0);
		Assert.assertEquals(-1.0,taxa, 0.0);
		
	}

}
