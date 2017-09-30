package br.com.cvc.teste.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author johngomes
 */
public class TransacaoService {

    public static void main(String[] args) throws ParseException {

        double valorTransferencia = 100.0;
        double taxa = 0.0;

        Calendar dataDoAgendamento = Calendar.getInstance();
        Calendar dataTransferencia = Calendar.getInstance();

        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");

        String dataHoje = "2017-09-01";
        String dataAgendada = "2017-09-21";
        

        dataTransferencia.setTime(dataFormat.parse(dataHoje));
        dataDoAgendamento.setTime(dataFormat.parse(dataAgendada));
        
        System.out.println(dataTransferencia.getTime());
        System.out.println(dataDoAgendamento.getTime());

        long intervaloEntreDatas = dataDoAgendamento.getTime().getTime() - dataTransferencia.getTime().getTime();

        double numeroDeDias = TimeUnit.DAYS.convert(intervaloEntreDatas, TimeUnit.MILLISECONDS);
        System.out.println(numeroDeDias);

        //A: Tranferências no mesmo dia do agendamento tem uma taxa de $3 mais 3% do valor a ser transferido;
        if (numeroDeDias == 0.0) {
            taxa = 3.0;
            taxa += (valorTransferencia / 100) * 3;
            
       //B: Tranferências até 10 dias da data de agendamento possuem uma taxa de $12.     
        }else if (numeroDeDias > 0 && numeroDeDias <= 10){
            taxa = 12.0;
       
       //C: Operações do tipo C tem uma taxa regressiva conforme a data de transferência: 
       // acima de 10 dias da data de agendamento 8.2%
        } else if(numeroDeDias > 10 && numeroDeDias <= 20){
            taxa = (valorTransferencia / 100) * 8.2;
        
       //acima de 20 dias da data de agendamento 6.9%     
        } else if(numeroDeDias > 20 && numeroDeDias <= 30){
            taxa = (valorTransferencia / 100) * 6.9;
       
        // acima de 30 dias da data de agendamento 4.7% 
        } else if(numeroDeDias > 30 && numeroDeDias <= 40){
            taxa = (valorTransferencia / 100) * 4.7;
        
        //acima de 30 dias da data de agendamento 1.7% 
        } else if(numeroDeDias > 40){
            taxa = (valorTransferencia / 100) * 1.7;
        }
    
        System.out.println("Valor da taxa : "+ taxa);

    }

}
