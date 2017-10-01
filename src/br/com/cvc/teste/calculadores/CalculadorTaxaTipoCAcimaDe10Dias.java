package br.com.cvc.teste.calculadores;

import br.com.cvc.teste.utils.CalculadoraUtils;

/**
 *
 * @author johngomes
 */
public class CalculadorTaxaTipoCAcimaDe10Dias extends CalculadorAbstract {
    
    private static final double PERCENTUAL = 8.2;

    public CalculadorTaxaTipoCAcimaDe10Dias(CalculadorAbstract proximo) {
        super(proximo);
    }

    @Override
    public double calculaTaxa(double valor, double numeroDeDias) {
        if (numeroDeDias > 10 && numeroDeDias <= 20) {
            return CalculadoraUtils.calculaValorSobPercentual(valor, PERCENTUAL);
        }
        return -1;
    }

}
