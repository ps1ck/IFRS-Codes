/* 7. Faça um programa que apresente o menu de opções a seguir:                                         Exercícios com Switch (ESCOLHA) - 1/5
Menu de opções: 
    1. Média Aritmética 
    2. Média ponderada 
    3. Sair 
Na opção 1, receber duas notas, calcular e mostrar a média aritmética deles. 
Na opção 2, receber três notas e seus respectivos pesos, calcular e mostrar a 
média ponderada. 
Na opção 3, sair do programa. 
Verifique a possibilidade de opção inválida, Neste caso, o programa deverá 
mostrar uma mensagem. */

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        
        int opcao = 1;
        double n1, n2, mediaArit;
        double nota1, nota2, nota3, peso1, peso2, peso3, mediaPond;

        Scanner sc = new Scanner(System.in);
        
        while(opcao != 3){

            System.out.println("Escolha uma opção: ");
            System.out.println(" Menu de opções: ");
            System.out.printf("     1. Média Aritmética\n");
            System.out.printf("     2. Média ponderada\n");
            System.out.printf("     3. Sair\n");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite a primeira nota: "); n1 = sc.nextDouble();
                    System.out.println("Digite a segunda nota: "); n2 = sc.nextDouble();
                    mediaArit = (n1+n2) / 2; System.out.printf("A média aritmética é: %.1f\n",mediaArit); break;
                case 2:
                    System.out.println("Digite a primeira nota: "); nota1 = sc.nextDouble();
                    System.out.println("Digite o peso da respectiva nota: "); peso1 = sc.nextDouble();
                    System.out.println("Digite a segunda nota: "); nota2 = sc.nextDouble();
                    System.out.println("Digite o peso da respectiva nota: "); peso2 = sc.nextDouble();
                    System.out.println("Digite a terceira nota: "); nota3 = sc.nextDouble();
                    System.out.println("Digite o peso da respectiva nota: "); peso3 = sc.nextDouble();
                    mediaPond = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
                    System.out.printf("A média ponderada é: %.1f\n",mediaPond); break;
                case 3:
                    System.out.println("Programa finalizado!"); break;
                default:
                    System.out.println("Opção inválida, digite novamente!");
            }
        }
        
        sc.close();
    }
}