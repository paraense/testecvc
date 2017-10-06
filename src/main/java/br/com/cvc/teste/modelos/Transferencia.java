package br.com.cvc.teste.modelos;

import java.time.Duration;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.cvc.teste.calculadores.CalculadorTaxaTipoA;
import br.com.cvc.teste.calculadores.CalculadorTaxaTipoB;
import br.com.cvc.teste.calculadores.CalculadorTaxaTipoCAcimaDe10Dias;
import br.com.cvc.teste.calculadores.CalculadorTaxaTipoCAcimaDe20Dias;
import br.com.cvc.teste.calculadores.CalculadorTaxaTipoCAcimaDe30Dias;
import br.com.cvc.teste.calculadores.CalculadorTaxaTipoCAcimaDe40Dias;
import br.com.cvc.teste.calculadores.CalculadoraTaxa;

/**
 *
 * @author johngomes
 */
public class Transferencia {

	private Conta remetente;
	private Conta destinatario;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataOperacao;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataTransferencia;

	private double valor;
	private double taxa;

	private double valorFinal;

	public Transferencia(LocalDate dataTransferencia, double valor) {
		this.dataTransferencia = dataTransferencia;
		this.dataOperacao = LocalDate.now();
		this.valor = valor;
		this.calculaTaxa();

	}

	public Transferencia() {
		this.dataOperacao = LocalDate.now();

	}

	public Conta getRemetente() {
		return remetente;
	}

	public void setRemetente(Conta remetente) {
		this.remetente = remetente;
	}

	public Conta getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Conta destinatario) {
		this.destinatario = destinatario;
	}

	public LocalDate getDataOperacao() {
		return dataOperacao;
	}

	public void setDataOperacao(LocalDate dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	public LocalDate getDataTransferencia() {
		return dataTransferencia;
	}

	public void setDataTransferencia(LocalDate dataTransferencia) {
		this.dataTransferencia = dataTransferencia;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public long getIntervaloDias() {
		return Duration.between(dataOperacao.atStartOfDay(), dataTransferencia.atStartOfDay()).toDays();
	}

	public void calculaTaxa() {
		CalculadoraTaxa calculadoraTaxa = new CalculadorTaxaTipoA(
				new CalculadorTaxaTipoB(new CalculadorTaxaTipoCAcimaDe10Dias(new CalculadorTaxaTipoCAcimaDe20Dias(
						new CalculadorTaxaTipoCAcimaDe30Dias(new CalculadorTaxaTipoCAcimaDe40Dias(null))))));

		this.setTaxa(calculadoraTaxa.getTaxa(this.getValor(), this.getIntervaloDias()));
	}
}
