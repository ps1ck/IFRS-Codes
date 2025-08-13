/* 
4. A prefeitura da cidade A realizou um concurso para seleção de técnicos 
em informática. O concurso consistiu em uma prova contendo dez 
questões objetivas com cinco alternativas cada (A, B, C, D ou E). Ao 
todo, dez candidatos fizeram as provas. 
Faça um programa em Java que leia uma matriz 10x10 contendo as 
respostas de todos os candidatos. Cada linha da matriz conterá as 
respostas de um candidato à cada uma das questões. O programa 
também deve ler um vetor de 10 posições contendo o gabarito da prova. 
Ao final, o programa deve mostrar o total de pontos obtidos por cada 
candidato.
 */

import java.util.Scanner;

public class exr4 {
    public static void main(String[] args) {
        char[][] matrizCandidatosRespostas = new char[10][10];
        char[] gabarito = new char[10];
        int[] notasCandidatos = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int l = 0; l < 10; l++){
            System.out.printf("- CANDIDATO n°%d -\n",(l+1));
            for(int c = 0;c < 10; c++){
                System.out.printf("Questão n°%d: ",(c+1)); matrizCandidatosRespostas[l][c] = sc.next().toUpperCase().charAt(0);
            }
        }
        
        
        System.out.println("- Agora digite o gabarito da prova por favor - ");
        for(int i = 0; i < 10; i++){
            System.out.printf("Repostas questão %d: ",(i+1)); gabarito[i] = sc.next().toUpperCase().charAt(0);
        }
        sc.close();

        for(int l = 0; l < 10; l++){
            notasCandidatos[l] = 0;
            for(int c = 0;c < 10; c++){
                if(matrizCandidatosRespostas[l][c] == gabarito [c]){
                    notasCandidatos[l] += 1;
                } 
            }
        }        

        System.out.printf("--- NOTAS ---\n");
        for(int i = 0;i < 10;i++){
            System.out.printf("Candidato n°%d -> %d\n",(i+1),notasCandidatos[i]);
        }

    }
}