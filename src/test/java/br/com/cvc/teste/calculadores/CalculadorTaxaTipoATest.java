package br.com.cvc.teste.calculadores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cvc.teste.calculadores.CalculadorTaxaTipoA;
import br.com.cvc.teste.calculadores.CalculadoraTaxa;

public class CalculadorTaxaTipoATest {

	private CalculadoraTaxa calculadoraDeTaxa;
	private long numeroDeDias;
	private double valor = 130.0;
	private final double RETORNO_ESPERADO = 6.9;

	@Before
	public void setup() {
		calculadoraDeTaxa = new CalculadorTaxaTipoA(null);

	}

	@Test
	public void calculaTaxaTest() {
		
		numeroDeDias = 0;
		
		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		
		Assert.assertEquals(RETORNO_ESPERADO, taxa, 0);
	}
	
	
	@Test
	public void naoCalculaTaxaTest() {
	
		numeroDeDias = 1;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		
		Assert.assertNotEquals(RETORNO_ESPERADO, taxa, 0);
		Assert.assertEquals(-1.0,taxa, 0);
		
	}


}
