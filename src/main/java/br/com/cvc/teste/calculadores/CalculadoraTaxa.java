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
        
        if(taxa == -1 && proximo != null){
        	return proximo.getTaxa(valor, numeroDeDias);
        }
        
        return taxa;
    }
    
    public abstract double calculaTaxa(double valor, long numeroDeDias);

}
