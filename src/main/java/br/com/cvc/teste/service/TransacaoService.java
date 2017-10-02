package br.com.cvc.teste.service;

import java.text.ParseException;
import java.time.LocalDate;

import br.com.cvc.teste.calculadores.CalculadorTaxaTipoA;
import br.com.cvc.teste.calculadores.CalculadorTaxaTipoB;
import br.com.cvc.teste.calculadores.CalculadorTaxaTipoCAcimaDe10Dias;
import br.com.cvc.teste.calculadores.CalculadorTaxaTipoCAcimaDe20Dias;
import br.com.cvc.teste.calculadores.CalculadorTaxaTipoCAcimaDe30Dias;
import br.com.cvc.teste.calculadores.CalculadorTaxaTipoCAcimaDe40Dias;
import br.com.cvc.teste.calculadores.CalculadoraTaxa;
import br.com.cvc.teste.modelos.Transferencia;

/**
 *
 * @author johngomes
 */
public class TransacaoService {

    public static void main(String[] args) throws ParseException {

    	double valorTransferencia = 100.0;
    	
    	Transferencia transferencia = new Transferencia(LocalDate.now().plusDays(10), valorTransferencia);

        
        CalculadoraTaxa calculadorDeTaxa = new CalculadorTaxaTipoA(new CalculadorTaxaTipoB(new CalculadorTaxaTipoCAcimaDe10Dias(
        		new CalculadorTaxaTipoCAcimaDe20Dias(new CalculadorTaxaTipoCAcimaDe30Dias(new CalculadorTaxaTipoCAcimaDe40Dias(null))))));
        
        System.out.println(calculadorDeTaxa.getTaxa(valorTransferencia, transferencia.getIntervaloDias()));


    }

}
