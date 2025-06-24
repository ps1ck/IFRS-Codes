/* 5. Foi realizada uma pesquisa de algumas características físicas da população de                         
certa região, a qual coletou os seguintes dados referentes a cada habitante 
para serem analisados: 
    - sexo (M ou F); 
    - cor dos olhos (1 – azuis, 2 – verdes, 3 – castanhos); 
    - cor dos cabelos (L – louros, C – castanhos, P – pretos, R - ruivos); 
    - idade; 
    - altura; 
    - peso. 
Escreva um programa que leia essas informações para cada pessoa e apresente 
a média da idade dos participantes, a média do peso e da altura de seus habitantes, a 
porcentagem de pessoas do sexo feminino, a porcentagem de pessoas do sexo 
masculino e quantas pessoas possuem olhos azuis e cabelos ruivos. A cada iteração 
deverá ser perguntado ao usuário se deseja continuar ou não. Os resultados deverão 
ser mostrados apenas quando o usuário não desejar mais inserir dados. */

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) { 
        
        char sexo, cabelos, continuar = 'S';
        int idade, olhos, altura, contadorM = 0, contadorF = 0, contadorParticipantes = 0;
        int somaidade = 0, somaAltura = 0, contadorEspeciais = 0;
        double peso, somapeso = 0, mediaIdade, mediaPeso, mediaAltura, porcentagemM, porcentagemF;

        Scanner sc = new Scanner(System.in);
        
        while(continuar == 'S' || continuar == 's'){
            System.out.printf("Digite o sexo ('M' ou 'F'): ");      sexo = sc.next().charAt(0);
            System.out.printf("Digite a cor dos olhos (1 - azuis, 2 - verdes, 3 - castanhos) ");        olhos = sc.nextInt();
            System.out.printf("Digite a cor dos cabelos (L - louros, C - castanhos, P - pretos, R - ruivos) ");        cabelos = sc.next().charAt(0);
            System.out.printf("Digite a idade em anos: ");        idade = sc.nextInt();
            System.out.printf("Digite a altura em cm: ");        altura = sc.nextInt();
            System.out.printf("Digite o peso em Kg: ");        peso = sc.nextDouble();
            contadorParticipantes += 1; somaidade += idade; somapeso += peso; somaAltura += altura;

                if(sexo == 'M' || sexo == 'm'){ contadorM += 1;}
                if(sexo == 'F' || sexo == 'f'){ contadorF += 1;}

                if(olhos == 1 && cabelos == 'R'){
                    contadorEspeciais += 1;
                }

            System.out.printf("Deseja continuar? ('S' ou 'N'): ");      continuar = sc.next().charAt(0);
        }
        sc.close();
        mediaIdade = somaidade / contadorParticipantes;
        mediaPeso = somapeso / contadorParticipantes;
        mediaAltura = somaAltura / contadorParticipantes;
        porcentagemF = ((double)contadorF / contadorParticipantes) * 100;
        porcentagemM = ((double)contadorM / contadorParticipantes) * 100;

        System.out.printf("Média da IDADE dos participantes: %.2f\n",mediaIdade);
        System.out.printf("Média de PESO dos participantes: %.2f\n",mediaPeso);
        System.out.printf("Média de ALTURA dos participantes: %.2f\n",mediaAltura);
        System.out.printf("Porcentagem de pessoas do sexo FEMININO: %.2f %%\n",porcentagemF);
        System.out.printf("Porcentagem de pessoas do sexo MASCULINO: %.2f %%\n",porcentagemM);
        System.out.printf("Quantas pessoas tem olhos AZUIS e cabelos RUIVOS: %d\n",contadorEspeciais);

    }
}