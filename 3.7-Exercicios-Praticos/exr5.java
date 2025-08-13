/*
5. Faça um programa que receba: 
    - as notas de 15 alunos em cinco provas diferentes e armazene-as 
em uma matriz 15 x 5; 
    - os nomes dos 15 alunos e armazene-os em um vetor de 15 
posições. 
O programa deverá calcular e mostrar, para cada aluno, o nome, a 
média aritmética das cinco provas e a situação (aprovado, reprovado ou 
exame). Um estudante estará aprovado se atingiu média maior ou igual 
a sete, estará reprovado se atingiu média inferior a dois e em exame se 
atingiu média entre 2 e 7.
 */

import java.util.Scanner;

public class exr5 {
    public static void main(String[] args) {
        double[][] notas = new double[15][5];
        String[] nomes = new String[15];
        double[] media = new double [15];
        
        Scanner sc = new Scanner(System.in);
        
        for(int l = 0;l < 15;l++){
            System.out.printf("Digite o nome do %d° aluno: ",(l+1)); nomes[l] = sc.nextLine();
            System.out.printf("- ALUNO : %s (%d°) -\n",nomes[l],(l+1));
            media[l] = 0;
            for(int c = 0;c < 5;c++){
                System.out.printf("Nota da %d° prova: ",(c+1)); notas[l][c] = sc.nextDouble();
                media[l] += notas[l][c];
            }
            sc.nextLine(); // consumir a quebra de linha do nextdouble!
        }
        sc.close();

        for(int i = 0; i<15;i++){
            media[i] /= 5.0;
            if(media[i] < 2){ System.out.printf("Aluno %s - Média: %.1f - REPROVADO \n",nomes[i],media[i]); }
            else if(media[i] >= 2 && media[i] < 7){ System.out.printf("Aluno %s - Média: %.1f - EM EXAME \n",nomes[i],media[i]); }
            else if(media[i] >= 7){ System.out.printf("Aluno %s - Média: %.1f - APROVADO \n",nomes[i],media[i]); }
        }
        
    }
}
