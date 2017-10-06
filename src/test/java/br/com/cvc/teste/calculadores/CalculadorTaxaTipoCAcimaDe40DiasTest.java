package br.com.cvc.teste.calculadores;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cvc.teste.calculadores.CalculadorTaxaTipoCAcimaDe40Dias;
import br.com.cvc.teste.calculadores.CalculadoraTaxa;

public class CalculadorTaxaTipoCAcimaDe40DiasTest {
	
	private CalculadoraTaxa calculadoraDeTaxa;
	private long numeroDeDias;
	private double valor = 101_000.0;
	private final double RETORNO_ESPERADO = 2020.0;
	

	@Before
	public void setup() {
		calculadoraDeTaxa = new CalculadorTaxaTipoCAcimaDe40Dias(null);
	}

	@Test
	public void calculaTaxaTest() {
		numeroDeDias = 41;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		Assert.assertEquals(RETORNO_ESPERADO, taxa, 0);
	}
	
	
	@Test
	public void calculaTaxaNumeroDeDiasInsuficienteTest() {
		numeroDeDias = 1;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		
		Assert.assertNotEquals(RETORNO_ESPERADO, taxa, 0);
		Assert.assertEquals(-1.0,taxa, 0.0);
	}
	
	@Test
	public void calculaTaxaValorInsuficienteTest() {
		
		numeroDeDias = 50;
		valor = 500.0;

		double taxa = calculadoraDeTaxa.calculaTaxa(valor, numeroDeDias);
		
		Assert.assertNotEquals(RETORNO_ESPERADO, taxa, 0);
		Assert.assertEquals(-1.0,taxa, 0.0);
	}

}
