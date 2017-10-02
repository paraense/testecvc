package br.com.cvc.teste.utils;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraUtilsTest {
	
	private double percentual = 10.0;
	private double valor = 100.0;
	
	@Test
	public void calculaValorSobPercentualTest(){
		double resultado = CalculadoraUtils.calculaValorSobPercentual(valor, percentual);
		
		Assert.assertEquals(0, 10.0, resultado);
	}

}
