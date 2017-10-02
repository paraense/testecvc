package br.com.cvc.teste.calculadores;

import br.com.cvc.teste.utils.CalculadoraUtils;

/**
 *
 * @author johngomes
 */
public class CalculadorTaxaTipoCAcimaDe30Dias extends CalculadoraTaxa {

    private static final double PERCENTUAL = 4.7;

    public CalculadorTaxaTipoCAcimaDe30Dias(CalculadoraTaxa proximo) {
        super(proximo);
    }

    @Override
    public double calculaTaxa(double valor, long numeroDeDias) {
        if (numeroDeDias > 30 && numeroDeDias <= 40) {
            return CalculadoraUtils.calculaValorSobPercentual(valor, PERCENTUAL);
        }
        return -1;
    }

}
