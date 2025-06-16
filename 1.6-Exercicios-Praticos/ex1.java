/* Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os 
dados de idade, sexo (M ou F), e salário. Faça um programa que leia essas 
informações para cada habitante, calcule e mostre: 
    - a média dos salários do grupo; 
    - a maior e a menor idade do grupo; 
    - a quantidade de mulheres com salário até R$ 1500,00; 
    - a idade e o sexo da pessoa que possui o menor salário. 
Finalize a entrada de dados ao ser digitada uma idade negativa.  */

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        int idade = 0, nHabitantes = 1, contadorM = 0, contadorF = 0, x = 0, menorSalarioIdade = 0;
        int maiorIdadeM = 0, menorIdadeM = 150, maiorIdadeF = 0, menorIdadeF = 150, mulheresSalarioAte1500 = 0;
        double salario, salariosM = 0, salariosF = 0, mediaM, mediaF, menorSalarioDeTodos = 9999999999999.99;
        char sexo, menorSalarioSexo = 'A';

        Scanner sc = new Scanner(System.in);
        System.out.println("--- PESQUISA HABITANTES ---\nDigite uma idade negativa para finalizar o programa!");
        while(idade >= 0){ 

            System.out.printf("HABITANTE N° %d\n",nHabitantes); nHabitantes += 1;
            System.out.printf("Digite sua idade: ");    idade = sc.nextInt();
            if(idade >= 0){
            System.out.printf("Digite seu salário: ");  salario = sc.nextDouble();
            System.out.printf("Digite seu sexo (M ou F): ");      sexo = System.console().readLine().charAt(0);
                if(salario < menorSalarioDeTodos) { 
                    menorSalarioDeTodos = salario;
                    menorSalarioIdade = idade;
                    menorSalarioSexo = sexo;
                 }    
            x = 0;
                while(x == 0){
                    if (sexo == 'M' || sexo == 'm'){
                        contadorM += 1; x += 1; salariosM += salario;
                        if(idade >= maiorIdadeM) { maiorIdadeM = idade; }
                        if(idade <= menorIdadeM) { menorIdadeM = idade; }
                    }
                    else if (sexo =='F' || sexo =='f'){
                        contadorF += 1; x += 1; salariosF += salario;
                        if(idade >= maiorIdadeF) { maiorIdadeF = idade; }
                        if(idade <= menorIdadeF) { menorIdadeF = idade; }
                        if(salario <= 1500.00) { mulheresSalarioAte1500 += 1; }
                    }
                    else{
                        System.out.println("Valor inválido! Por favor digite M ou F!");
                        System.out.printf("Digite seu sexo (M ou F): ");      
                        sexo = System.console().readLine().charAt(0);
                    }
                }
            }
            else{ System.out.println("Finalizando o programa e calculando resultados..."); }
        }

        mediaM = salariosM / contadorM;
        mediaF = salariosF / contadorF;

        System.out.println("GRUPO MASCULINO: ");
        if (contadorM > 0){
        System.out.printf("Média dos salários: %.2f\n", mediaM);
        System.out.printf("Maior idade: %d\n",maiorIdadeM);
        System.out.printf("Menor idade: %d\n",menorIdadeM);}
        else{ System.out.println("Dados insuficientes!"); }
        
        System.out.println("GRUPO FEMININO: ");
        if (contadorF > 0){
        System.out.printf("Média dos salários: %.2f\n", mediaF);
        System.out.printf("Maior idade: %d\n",maiorIdadeF);
        System.out.printf("Menor idade: %d\n",menorIdadeF);}
        else{ System.out.println("Dados insuficientes!"); }

        System.out.println("--- OUTROS DADOS ---");
        if (contadorM > 0 || contadorF > 0){
        System.out.printf("Quantidade de mulheres com salário até R$ 1500.00: %d\n",mulheresSalarioAte1500);
        System.out.println("Dados da pessoa com o MENOR salário de todos: ");
            if(menorSalarioSexo == 'M' || menorSalarioSexo == 'm'){ System.out.printf("Salário de R$ %.2f com %d anos e do sexo masculino.",menorSalarioDeTodos,menorSalarioIdade); }
            else{ System.out.printf("Salário de R$ %.2f com %d anos e do sexo feminino.",menorSalarioDeTodos,menorSalarioIdade); }}
        else{ System.out.println("Dados insuficientes!"); }

        sc.close();
        
    }
}