/* 8. Em uma eleição presidencial existem quatro candidatos. Os votos são                               Exercícios com Switch (ESCOLHA) - 2/5
informados por meio de um código. Os códigos utilizados são: 
1, 2, 3, 4              Votos para os 
                        respectivos candidatos 
5                       Voto nulo 
6                       Voto em branco 
Faça um programa que calcule e mostre: 
    - o total de votos para cada candidato; 
    - o total de votos nulos; 
    - o total de votos em branco; 
    - a percentagem de votos nulos sobre o total de votos; 
    - a percentagem de votos em branco sobre o total de votos. 
Para finalizar o conjunto de votos, tem-se o valor zero e, para códigos inválidos, 
o programa deverá mostrar uma mensagem. */

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        int opcao;
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, vn = 0, vb = 0;
        double pvn, pvb;

        Scanner sc = new Scanner(System.in);
        
        do{
            
            System.out.println("Digite o número que corresponde ao seu voto: ");
            System.out.printf("     1. Candidato n° 1\n");  System.out.printf("     2. Candidato n° 2\n");
            System.out.printf("     3. Candidato n° 3\n");  System.out.printf("     4. Candidato n° 4\n");
            System.out.printf("     5. Voto nulo\n");  System.out.printf("     6. Voto em branco\n");

            opcao = sc.nextInt();

            switch(opcao){
                case 0: System.out.println("Programa finalizado!"); break;
                case 1: c1 += 1; break;
                case 2: c2 += 1; break;
                case 3: c3 += 1; break;
                case 4: c4 += 1; break;
                case 5: vn += 1; break;
                case 6: vb += 1; break;
                default:
                    System.out.println("Opção inválida, digite novamente!"); break;
            }
        }while(opcao != 0);

        System.out.println("Total de votos:");
        System.out.printf("     Candidato n° 1: %d votos\n",c1);
        System.out.printf("     Candidato n° 2: %d votos\n",c2);
        System.out.printf("     Candidato n° 3: %d votos\n",c3);
        System.out.printf("     Candidato n° 4: %d votos\n",c4);
        System.out.printf("     Votos nulos: %d\n",vn);
        System.out.printf("     Votos em branco: %d\n",vb);
        pvn = (double)(vn*100) / (double)(c1+c2+c3+c4+vn+vb);
        pvb = (double)(vb*100) / (double)(c1+c2+c3+c4+vn+vb);
        System.out.println("Porcentagens: ");
        System.out.printf("Porcentagem de votos nulos: %.2f %%\n",pvn);
        System.out.printf("Porcentagem de votos brancos: %.2f %%\n",pvb);
        
        sc.close();
    }
}