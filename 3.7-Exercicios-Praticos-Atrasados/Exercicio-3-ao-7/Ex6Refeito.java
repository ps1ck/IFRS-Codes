/* 3 a 7. Refaça os exercícios 1, 2, 5, 6, 7 do caderno de exercícios do módulo 
anterior utilizando as estruturas para..faça e for. 

Exercício 6:
Para cada uma das mercadorias com que um armazém trabalha dispõe
se dos seguintes dados: 
−  o nome da mercadoria; 
−  o seu preço unitário; 
−  a quantidade total vendida no mês. 
Elabore um programa para calcular o faturamento total mensal do armazém. O 
faturamento total do armazém será calculado somando-se o total faturado por 
cada mercadoria, que é igual a quantidade vendida da mercadoria vezes o seu 
preço unitário. O número de mercadorias comercializadas pelo armazém deve 
ser informado pelo usuário.
*/

public class Ex6Refeito {
    public static void main(String[] args) {
        
        int qtdm, i = 0;
        double pu, qtdv, ftm = 0;
        String nome;

        System.out.println("Digite o número de mercadorias comercializadas pelo armazém: ");
        qtdm = Integer.parseInt(System.console().readLine());

        for(i = 1; i < qtdm + 1;i += 1)
        {
            System.out.printf("Digite o nome da %d° mercadoria: \n",i);
            nome = System.console().readLine();

            System.out.printf("Digite o preço unitário de %s: \n",nome);
            pu = Double.parseDouble(System.console().readLine());

            System.out.printf("Digite a quantidade total vendida no mês de %s: \n",nome);
            qtdv = Double.parseDouble(System.console().readLine());

            ftm += (qtdv * pu);

        }

        System.out.printf("Faturamento total do armazém: R$%.2f \n",ftm);

    }
}