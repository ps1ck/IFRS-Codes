/* 2. Faça um programa que receba o tipo de ação, ou seja, uma letra qualquer a ser 
comercializada na bolsa de valores, o preço de compra e o preço de venda de 
cada ação e que calcule e mostre: 
    - a quantidade de ações com lucro superior a R$ 1.000,00; 
    - a quantidade de ações com lucro inferior a R$ 200,00. 
Finalize com o tipo de ação ‘F’.  */

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
     
        char acao = 'A';
        double compra, venda, lucro;
        int contadorSuperior = 0, contadorInferior = 0;
        
        Scanner sc = new Scanner(System.in);
        
        while(acao != 'F'){
        System.out.printf("Digite o tipo de ação ('F' finaliza o programa): ");      acao = System.console().readLine().charAt(0);
        if(acao == 'F'){ break; }
        System.out.printf("Digite o preço de compra da ação %c: ",acao);       compra = sc.nextInt();
        System.out.printf("Digite o preço de venda da ação %c: ",acao);        venda = sc.nextInt();
        lucro = (venda - compra);
        System.out.printf("Lucro da ação %c = R$ %.2f\n",acao,lucro);
        if(lucro > 1000){ contadorSuperior += 1;}
        if(lucro < 200){ contadorInferior += 1;}
        }

        System.out.printf("Ações com lucro superior a R$ 1.000,00 = %d\n",contadorSuperior);
        System.out.printf("Ações com lucro inferior a R$ 200,00 = %d\n",contadorInferior);
        
        sc.close();

    }
}