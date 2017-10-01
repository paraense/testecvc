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
public abstract class CalculadorAbstract {

    private CalculadorAbstract proximo;

    public CalculadorAbstract(CalculadorAbstract proximo) {
        this.proximo = proximo;
    }
    
    public double getTaxa(double valor, double numeroDeDias){
        double taxa = calculaTaxa(valor, numeroDeDias);
        return numeroDeDias == -1 ? proximo.getTaxa(valor, numeroDeDias) : taxa;
    }
    
    public abstract double calculaTaxa(double valor, double numeroDeDias);

}
