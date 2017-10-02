package br.com.cvc.teste.modelos;

import java.time.LocalDate;

import org.junit.Test;

import org.junit.Assert;;

public class TrasnferenciaTest {

	private Transferencia transferencia;

	@Test
	public void getIntervaloDias0Test() {
		transferencia = new Transferencia(LocalDate.now(), 0.0);
		long intervalo = transferencia.getIntervaloDias();

		Assert.assertEquals(transferencia.getDataOperacao(),transferencia.getDataTransferencia());
		Assert.assertEquals(0, intervalo);
	}
	
	@Test
	public void getIntervaloDias10Test(){
		transferencia = new Transferencia(LocalDate.now().plusDays(10), 0.0);
		long intervalo = transferencia.getIntervaloDias();
		
		Assert.assertNotEquals(transferencia.getDataOperacao(),transferencia.getDataTransferencia());
		Assert.assertEquals(10, intervalo);
	}

}
