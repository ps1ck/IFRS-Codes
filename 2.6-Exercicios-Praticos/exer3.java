/* 
 3. Faça um programa que receba o nome de oito clientes de uma 
videolocadora e armazene-os em um vetor. Em um segundo vetor, 
armazene a quantidade de DVDs locados em 2017 por cada um dos oito 
clientes. Sabe-se que, para cada dez locações, o cliente tem direito a 
uma locação grátis. Faça um programa que mostre o nome de todos os 
clientes, com a quantidade de locações grátis a que ele tem direito.
 */

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
    
        String[] nomes = new String[8];
        int[] quantidade = new int[8];
        int[] gratis = new int[8];
        
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i <= 7; i++){
            System.out.printf("Digite o nome do cliente n° %d\n",(i+1));    nomes[i] = sc.next();
            System.out.printf("Digite a quantidade de DVDs locados: \n"); quantidade[i] = sc.nextInt();
            
            if(quantidade[i] > 10){ gratis[i] = (quantidade[i] - (quantidade[i] % 10)) / 10; }
            else{gratis[i] = 0;}

        }
        sc.close();

        for(int i = 0; i <= 7; i++){ System.out.printf("Cliente n° %d:\n  Nome: %s\n  Locações grátis: %d\n",(i+1),nomes[i],gratis[i]); }
    }
}
