package br.com.cvc.teste.calculadores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cvc.teste.calculadores.CalculadorTaxaTipoCAcimaDe10Dias;
import br.com.cvc.teste.calculadores.CalculadoraTaxa;

public class CalculadorTaxaTipoCAcimaDe10DiasTest {
	
	private CalculadoraTaxa calculadoraDeTaxa;
	
	private long numeroDeDias;
	private double valor = 131.0;
	private final double RETORNO_ESPERADO = 10.48;

	@Before
	public void setup() {
		calculadoraDeTaxa = new CalculadorTaxaTipoCAcimaDe10Dias(null);

	}

	@Test
	public void calculaTaxaTest() {
		numeroDeDias = 11;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		Assert.assertEquals(RETORNO_ESPERADO, taxa, 0);
	}
	
	
	@Test
	public void naoCalculaTaxaTest() {
	
		numeroDeDias = 21;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		
		Assert.assertNotEquals(RETORNO_ESPERADO, taxa, 0);
		Assert.assertEquals(-1.0,taxa, 0.0);
		
	}

}
