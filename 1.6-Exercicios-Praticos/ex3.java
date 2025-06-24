/* 3. A empresa JS Recrutamento e Seleção Ltda. faz recrutamento e seleção de 
funcionários para várias empresas em diversos ramos de atuação. Para facilitar 
o trabalho de identificação do perfil dos candidatos que se inscrevem para as 
vagas, resolveu fazer um programa para registrar alguns dados para obter as 
informações a seguir: 
    a. número de candidatos do sexo feminino; 
    b. número de candidatos do sexo masculino; 
    c. idade média dos homens; 
    d. idade média das mulheres com experiência 
Faça um programa para calcular as informações solicitadas anteriormente, 
sabendo que para cada candidato devem ser informados sexo (M ou F), idade e 
tempo de experiência profissional (em anos). Também considere que a cada 
iteração deverá ser perguntado ao usuário se deseja cadastrar outro candidato 
ou não. Quando a resposta for negativa, os resultados deverão ser 
apresentados. */

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        
        char sexo, continuar = 'S';
        int idade, exp, contadorM = 0, contadorF = 0, somaM = 0, somaFexp = 0, contadorFexp = 0;
        double mediaM, mediaFexp;
        Scanner sc = new Scanner(System.in);
       
        while(continuar == 'S' || continuar == 's'){
        System.out.printf("Digite o sexo ('M' ou 'F'): ");      sexo = System.console().readLine().charAt(0);
        System.out.printf("Digite sua idade: ");        idade = sc.nextInt(); 
        System.out.printf("Digite quantos anos de experiência: "); exp = sc.nextInt();
            if(sexo == 'M' || sexo == 'm'){ contadorM += 1; somaM += idade;}
            if(sexo == 'F' || sexo == 'f'){
                contadorF += 1;
                if(exp > 0){ somaFexp += idade; contadorFexp += 1; }
            }
        System.out.printf("Deseja cadastrar outro candidato? ('S' ou 'N'): ");      continuar = System.console().readLine().charAt(0);
        }
        sc.close();

        mediaM = somaM / contadorM; mediaFexp = somaFexp / contadorFexp;
        System.out.printf("Número de candidatos do sexo feminino: %d\n",contadorF);
        System.out.printf("Número de candidatos do sexo masculino: %d\n",contadorM);
        System.out.printf("Idade média dos homens: %.2f\n",mediaM);
        System.out.printf("Idade média das mulheres com experiência: %.2f\n",mediaFexp);
       
    }
}