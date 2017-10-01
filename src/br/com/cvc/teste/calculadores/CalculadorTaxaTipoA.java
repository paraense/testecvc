package br.com.cvc.teste.calculadores;

import br.com.cvc.teste.utils.CalculadoraUtils;

/**
 *
 * @author johngomes
 */
public class CalculadorTaxaTipoA extends CalculadorAbstract {

    private static final double VALOR_DA_TAXA_PADRAO = 3.0;
    private static final double PERCENTUAL = 3.0;
    
    public CalculadorTaxaTipoA(CalculadorAbstract proximo) {
        super(proximo);
    }

    @Override
    public double calculaTaxa(double valor, double numeroDeDias) {
        
        if (numeroDeDias == 0.0) {
            double taxa = VALOR_DA_TAXA_PADRAO;
            taxa += CalculadoraUtils.calculaValorSobPercentual(valor, PERCENTUAL);
            return taxa;
        }
        
        return -1;

    }
}
