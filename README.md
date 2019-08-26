# testecvc
Teste de seleção da cvc

Run:
  mvn install no projeto e java -jar  no .jar gerado dentro de target =D


# A Prova

- Desenvolver um sistema de agendamento de transferências financeiras.
1) O usuário deve poder agendar uma transferência financeira com as seguintesinformações:
    - Conta de origem (padrão XXXXXX)
    - Conta de destino (padrão XXXXXX)
    - Valor da transferência
    - Taxa (a ser calculada)
    - Data da transferência (data que será realizada a transferência)
    - Data de agendamento (hoje)

2) Cada tipo de transação segue uma regra diferente para cálculo da taxa
  
  A: Tranferências no mesmo dia do agendamento tem uma taxa de $3 mais 3% do valor a
  ser transferido;

  B: Tranferências até 10 dias da data de agendamento possuem uma taxa de $12.

  C: Operações do tipo C tem uma taxa regressiva conforme a data de
    transferência:
    - acima de 10 dias da data de agendamento 8.2%
    - acima de 20 dias da data de agendamento 6.9%
    - acima de 30 dias da data de agendamento 4.7%
    - acima de 40 dias da data de agendamento 1.7%
    
  D: Operações do tipo D tem a taxa igual a A, B ou C dependendo do valor da
    transferência.
    - Valores até $1.000 seguem a taxação tipo A
    - Valores de $1.001 até $2.000 seguem a taxação tipo B
    - Valores maiores que $2.000 seguem a taxação tipo C

3) O usuário deve poder ver todos os agendamentos cadastrados.
    Observações:
    - Caso não haja taxa aplicável, lançar um alerta sobre o erro.
    - O sistema deve encontrar o tipo da transferência de acordo com o valor e a data, ou
      seja, o tipo da transferência não deve ser um parâmetro de entrada.
    - A persistência deve ser feita em memória.
