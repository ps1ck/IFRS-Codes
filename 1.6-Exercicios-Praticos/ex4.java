/* 4. A empresa PowerSoftware Ltda. possui 58 funcionários e pretende processar 
sua folha de pagamento de forma informatizada. Para isso, é necessário 
construir um programa que leia o salário de cada funcionário da empresa e 
calcule os descontos de imposto de renda e INSS de acordo com as tabelas 
abaixo e também uma porcentagem fixa correspondente ao plano de saúde 
que é de 4,5% do valor do salário.  O programa também deve: 
    a. calcular o valor do salário líquido de cada um dos 58 funcionários; 
    b. calcular o valor total da folha de pagamento (soma dos salários de todos 
    os funcionários); 
    c. calcular o valor total do imposto de renda que a empresa deverá 
    recolher.  
De acordo com as informações disponíveis no site da Receita Federal, a tabela 
de alíquotas do imposto de renda para o ano de 2018 é: 

    Salário bruto (R$)                          Alíquota (%) 
    Até 1.903,98                                -
    De - 1.903,99 até 2.826,65                  7,5 
    De 2.826,66 até 3.751,05                    15 
    De 3.751.06 até 4.664,68                    22,5 
    Acima de 4.664,68                           27,5

Desconto do INSS: 
 
    Salário bruto (R$)                          Alíquota (%)    
    Até 1.693,72                                8% 
    De 1.693,73 até 2.822,90                    9% 
    Acima de 2.822,90                           11% 

*/

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        
        double salarioBruto, salarioLiquido, valorTOTAL = 0, valorTOTALimpostoR = 0;
        double iRenda = 0, iNss = 0, planoSaude = 0.045;
        
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 58; i++){
            System.out.printf("Digite o salário bruto do funionário %d: ",i);   salarioBruto = sc.nextDouble();
        
                if(salarioBruto <= 1903.98){ iRenda = 0.0;}
                else if(salarioBruto > 1903.98 && salarioBruto <= 2826.65){ iRenda = 0.075;}
                else if(salarioBruto > 2826.65 && salarioBruto <= 3751.05){ iRenda = 0.15;}
                else if(salarioBruto > 3751.05 && salarioBruto <= 4664.68){ iRenda = 0.225;}
                else if(salarioBruto > 4664.68){ iRenda = 0.275;}

                if(salarioBruto <= 1693.72){ iNss = 0.08;}
                else if(salarioBruto > 1693.72 && salarioBruto <= 2822.90){ iNss = 0.09;}
                else if(salarioBruto > 2822.90){ iNss = 0.11;}

            valorTOTAL += salarioBruto;
            valorTOTALimpostoR += (salarioBruto*iRenda);
            salarioLiquido = salarioBruto - ((salarioBruto*iRenda) + (salarioBruto*iNss) + (salarioBruto*planoSaude)) ;
                
            System.out.printf("Salário líquido: R$ %.2f\n",salarioLiquido);
        }
        sc.close();

        System.out.printf("Valor TOTAL da folha de pagamento: R$ %.2f\n",valorTOTAL);
        System.out.printf("Valor TOTAL do imposto de renda: R$ %.2f\n",valorTOTALimpostoR);
    }
}