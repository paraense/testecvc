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
public class CalculadorTaxaTipoB extends CalculadoraTaxa{
    
    private static final double VALOR_DA_TAXA_PADRAO = 12.0;

    public CalculadorTaxaTipoB(CalculadoraTaxa proximo) {
        super(proximo);
    }

    @Override
    public double calculaTaxa(double valor, long numeroDeDias) {
         if (numeroDeDias > 0 && numeroDeDias <= 10){
            return VALOR_DA_TAXA_PADRAO * numeroDeDias;
         }
         return -1;
    }

    
}
