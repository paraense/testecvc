package br.com.cvc.teste.modelos;

import java.time.Duration;
import java.time.LocalDate;

/**
 *
 * @author johngomes
 */
public class Transferencia {
    
    
    private Conta remetente;
    private Conta destinatario;
    
    private LocalDate dataOperacao;
    private LocalDate dataTransferencia;

    private double valor;
    private double taxa;
    
    private double valorFinal;
    
    public Transferencia(LocalDate dataTransferencia, double valor) {
		this.dataTransferencia = dataTransferencia;
		this.dataOperacao = LocalDate.now();
		this.valor = valor;
		
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
}
