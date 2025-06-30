/* Faça um programa que apresente o menu de opções a seguir, que permita ao                             Exercícios com Switch (ESCOLHA) - 3/5
usuário escolher a opção desejada, receba os dados necessários para executar 
a operação e mostre o resultado. Verifique a possibilidade de opção inválida. 
Menu de opções: 
    1. Novo salário 
    2. Férias 
    3. Décimo terceiro 
    4. Sair 
Na opção 1, receber o salário de um funcionário, calcular e mostrar o novo 
salário usando as regras a seguir: 

Salários                        Percentagem de Aumento 
Até R$ 1000,00                          15% 
De R$ 1000,01 a R$ 3000,00              10% 
Acima de R$ 3000,00                     5% 

Na opção 2, receber o salário de um funcionário, calcular e mostrar o valor de 
suas férias. Sabe-se que as férias equivalem ao seu salário acrescido de um 
terço do salário. 
Na opção 3, receber o salário de um funcionário e o número de meses de 
trabalho na empresa, no máximo doze, calcular e mostrar o valor do décimo 
terceiro salário. Sabe-se que o décimo terceiro salário equivale ao seu salário 
multiplicado pelo número de meses de trabalho dividido por 12. 
Na opção 4, sair do programa. */

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        
        int opcao, meses;
        double salario, novoSalario = 0, ferias = 0, decimoT = 0;

        Scanner sc = new Scanner(System.in);

        do{
           
            System.out.println("Menu de opções: "); System.out.println("    1. Novo salário");
            System.out.println("    2. Férias");  System.out.println("    3. Décimo terceiro");
            System.out.println("    4. Sair"); System.out.println("Digite o número de acordo com a sua escolha:");
            opcao = sc.nextInt();

                switch(opcao){
                    case 1:
                        System.out.printf("Digite o salário do funcionário: "); salario = sc.nextDouble();
                            if(salario <= 1000.00){ novoSalario = salario + (salario*0.15); }
                            if(salario > 1000.00 && salario <= 3000.00){ novoSalario = salario + (salario*0.10); }
                            if(salario > 3000.00){ novoSalario = salario + (salario*0.05); } 
                        System.out.printf("Novo salário: %.2f\n\n",novoSalario); break;
                    case 2:
                        System.out.printf("Digite o salário do funcionário: "); salario = sc.nextDouble();
                        ferias = salario + (salario/3); System.out.printf("Valor das férias do funcionário: %.2f\n\n", ferias); break;
                    case 3:
                        System.out.printf("Digite o salário do funcionário: "); salario = sc.nextDouble();
                        System.out.printf("Digite por quantos meses esse funcionário trabalhou (no máximo 12): "); meses = sc.nextInt();
                        decimoT = (salario * meses) / 12; System.out.printf("Décimo terceiro: %.2f\n\n",decimoT); break;
                    case 4: System.out.println("Finalizando o programa!\n\n"); break;

                    default:
                        System.out.printf("\nOpção inválida, digite novamente por favor!\n\n"); break;
                }

        }while(opcao != 4);

        sc.close();
    }
}