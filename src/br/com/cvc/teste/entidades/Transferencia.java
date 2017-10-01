package br.com.cvc.teste.entidades;

import java.util.Calendar;

/**
 *
 * @author johngomes
 */
public class Transferencia {
    
    
    private Conta remetente;
    private Conta destinatario;
    
    private Calendar dataOperacao;
    private Calendar dataTransferencia;

    private double valor;
    private double taxa;
    
    private double valorFinal;

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

    public Calendar getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Calendar dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public Calendar getDataTransferencia() {
        return dataTransferencia;
    }

    public void setDataTransferencia(Calendar dataTransferencia) {
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
    
    
    
    
    
    
}
