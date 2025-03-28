/* 3 a 7. Refaça os exercícios 1, 2, 5, 6, 7 do caderno de exercícios do módulo 
anterior utilizando as estruturas para..faça e for. 

Exercício 1:
Faça um programa que calcule a soma de dez números quaisquer 
fornecidos pelo usuário
*/

public class Ex1Refeito {
    public static void main(String[] args) {
        
        double n, soma = 0;
        int qtdN;

        for(qtdN = 1; qtdN < 11; qtdN += 1){
            System.out.printf("Digite o %d° número: \n", qtdN);
            n = Integer.parseInt(System.console().readLine());
            soma += n;
        }

        System.out.printf("A soma dos 10 números é de = %.1f", soma);

    }
}