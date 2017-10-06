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
public class CalculadorTaxaTipoCAcimaDe40Dias extends CalculadoraTaxa{

    private final double PERCENTUAL = 2.0;
    private final double VALOR_MINIMO = 100_000.0;

    public CalculadorTaxaTipoCAcimaDe40Dias(CalculadoraTaxa proximo) {
        super(proximo);
    }

    @Override
    public double calculaTaxa(double valor, long numeroDeDias) {
        if(numeroDeDias > 40 && valor > VALOR_MINIMO) {
            return CalculadoraUtils.calculaValorSobPercentual(valor, PERCENTUAL);
        }
        return -1;
    }

}
