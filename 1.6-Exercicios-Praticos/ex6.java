/* 6. Faça um programa que mostre os conceitos finais dos alunos de uma turma de 
75 pessoas, considerando a tabela a seguir. Para isso, a nota final e o código do 
aluno deverão ser fornecidos pelo usuário. Ao final do programa, apresente a 
quantidade de alunos e a média de nota alcançada para cada conceito. 
Nota                    Conceito            
De 0,0 a 2,9                E
De 3,0 a 4,9                D 
De 5,0 a 6,9                C
De 7,0 a 8,9                B
De 9,0 a 10,0               A
*/


import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        
        double notafinal, mediaE, mediaD, mediaC, mediaB, mediaA;
        double cE = 0, cD = 0, cC = 0, cB = 0, cA = 0;
        double somaE = 0, somaD = 0, somaC = 0, somaB = 0, somaA = 0;
        int codigoAluno;
        
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 75;i++){
            System.out.printf("Digite a notafinal do aluno %d: ",i);  notafinal = sc.nextDouble();
            System.out.printf("Digite o código do aluno %d: ",i);    codigoAluno = sc.nextInt();
            
            if(notafinal >= 0.0 && notafinal <= 2.9){ cE += 1; somaE += notafinal; }
            if(notafinal >= 3.0 && notafinal <= 4.9){ cD += 1; somaD += notafinal; }
            if(notafinal >= 5.0 && notafinal <= 6.9){ cC += 1; somaC += notafinal; }
            if(notafinal >= 7.0 && notafinal <= 8.9){ cB += 1; somaB += notafinal; }
            if(notafinal >= 9.0 && notafinal <= 10.0){ cA += 1; somaA += notafinal; }

        }

        mediaE = somaE / cE; mediaD = somaD / cD; mediaC = somaC / cC; mediaB = somaB / cB; mediaA = somaA / cA;

        System.out.println("Média dos conceitos com 75 alunos!");
        System.out.printf("Média de notas do conceito E %.1f\n",mediaE);
        System.out.printf("Média de notas do conceito D %.1f\n",mediaD);
        System.out.printf("Média de notas do conceito C %.1f\n",mediaC);
        System.out.printf("Média de notas do conceito B %.1f\n",mediaB);
        System.out.printf("Média de notas do conceito A %.1f\n",mediaA);

        sc.close();
    }
}