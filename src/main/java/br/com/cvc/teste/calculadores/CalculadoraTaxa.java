/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cvc.teste.calculadores;

/**
 *
 * @author johngomes
 */
public abstract class CalculadoraTaxa {

    private CalculadoraTaxa proximo;

    public CalculadoraTaxa(CalculadoraTaxa proximo) {
        this.proximo = proximo;
    }
    
    public double getTaxa(double valor, long numeroDeDias){
        double taxa = calculaTaxa(valor, numeroDeDias);
        return taxa == -1 ? proximo.getTaxa(valor, numeroDeDias) : taxa;
    }
    
    public abstract double calculaTaxa(double valor, long numeroDeDias);

}
