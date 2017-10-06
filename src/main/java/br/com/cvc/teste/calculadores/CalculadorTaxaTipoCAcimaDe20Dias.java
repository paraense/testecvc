/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cvc.teste.calculadores;

import br.com.cvc.teste.utils.CalculadoraUtils;

/**
 *
 * @author johngomes
 */
public class CalculadorTaxaTipoCAcimaDe20Dias extends CalculadoraTaxa{
    
    private final double PERCENTUAL = 6.0;

    public CalculadorTaxaTipoCAcimaDe20Dias(CalculadoraTaxa proximo) {
        super(proximo);
    }

    @Override
    public double calculaTaxa(double valor, long numeroDeDias) {
        if(numeroDeDias > 20 && numeroDeDias <= 30){
          return CalculadoraUtils.calculaValorSobPercentual(valor, PERCENTUAL);
        }
        return -1;
    }
    
    
}
