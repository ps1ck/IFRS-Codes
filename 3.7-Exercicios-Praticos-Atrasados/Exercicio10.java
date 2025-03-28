/* Faça um programa que mostre o menu de opções a seguir, receba a opção 
digitada pelo usuário e os dados  necessários para executar cada operação. 
Note que dependendo da opção escolhida pelo usuário, um conjunto de 
instruções diferente será executado. DICA: utilize as estruturas escolha e 
switch para executar conjuntos de instruções diferentes, dependendo da opção 
escolhida pelo usuário. 
Menu de opções: 
1. Somar dois números. 
2. Número ao quadrado. 
Digite a opção desejada */

public class Exercicio10 {
    public static void main(String[] args) {
        int e;
        double x, y;

        System.out.printf("Menu de opções:\n1. Somar dois números.\n2. Número ao quadrado.\nDigite a opção desejada:\n");
        e = Integer.parseInt(System.console().readLine());

        switch(e){
            case 1:
                System.out.println("Digite o 1° número: ");
                x = Double.parseDouble(System.console().readLine());
                System.out.println("Digite o 2° número: ");
                y = Double.parseDouble(System.console().readLine());
                System.out.printf("A soma dos números %.2f e %.2f resulta em: %.2f",x, y, (x+y));
                break;
            case 2:
                System.out.println("Digite o número: ");
                x = Double.parseDouble(System.console().readLine());
                System.out.printf("O número %.2f ao quadrado resulta em: %.2f",x,(x*x));
                break;
            default: /* Essa parte não foi solicitada, mas decidi fazer para deixar o programa mais eficiente.*/
                System.out.println("Opção inexistente!");
        }
    }
}