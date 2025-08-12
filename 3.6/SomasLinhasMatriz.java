// Crie um programa que preencha uma matriz 10x20 com números inteiros e some cada uma das linhas, armazenando o resultado das somas 
//em um vetor. A seguir, o programa deverá multiplicar cada elemento da matriz pela soma da linha correspondente e mostrar a matriz resultante.

public class SomasLinhasMatriz {
    public static void main(String[] args) {

    int[][] matriz = new int[10][20];
    int[] somas = new int[10];
    int linha, coluna;

    for(linha = 0; linha < 10; linha++) {
        for(coluna = 0; coluna < 20; coluna++) {
            System.out.printf("Informe o valor para matriz[%d][%d]", linha, coluna);
            matriz[linha][coluna] = Integer.parseInt(System.console().readLine()); } }

    for(linha = 0; linha < 10; linha++) {
        somas[linha] = 0;
        
        for(coluna = 0; coluna < 20; coluna++) {
            somas[linha] += matriz[linha][coluna]; } }

    for(linha = 0; linha < 10; linha++) {
        for(coluna = 0; coluna < 20; coluna++) {
            matriz[linha][coluna] = matriz[linha][coluna] * somas[linha] ; } } // Fiz uma correção aqui, o vscode não estava aceitando, por ser muito grande fica dificil testar, mas creio
                                                                               //que está funcionando corretamente.
    for(linha = 0; linha < 10; linha++) {
        for(coluna = 0; coluna < 20; coluna++) {
            System.out.printf("Matriz[%d][%d] = %d\n", linha, coluna, matriz[linha][coluna]);  }  }
    }
}