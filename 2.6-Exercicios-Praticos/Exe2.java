/* Faça um programa que calcule o somatório, a soma dos quadrados e a 
média entre os n primeiros números inteiros positivos. */


public class Exe2 {
    public static void main(String[] args) {

        int Cn = 0, Cv = 0, auxV = 0,auxN =0, n;
        double numero, soma = 0, media, quadrado = 0, somatorio;
        System.out.println("Digite quantas vezes você quer digitar um número: ");
        Cv = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o valor de n (média entre os n primeiros números inteiros positivos): ");
        n = Integer.parseInt(System.console().readLine());

        while(auxV < Cv){

            System.out.println("Digite um número: ");
            numero = Double.parseDouble(System.console().readLine());

               if(auxN < n){     
                    if (numero >= 0 && (numero%1) == 0){
                        System.out.println("É um inteiro positivo.");
                        soma += numero;
                        auxN += 1;
                    }
                    else{
                        System.out.println("Não é um inteiro positivo.");
                    }
                }

            quadrado = quadrado + (numero*numero); 
            auxV = auxV +1;
        }

        media = soma / n;
        somatorio = quadrado + media;
        System.out.printf("Soma dos quadrados: %.2f\n", quadrado);
        System.out.printf("Média dos %d(n) primeiros números inteiros positivos: %.2f\n",n, media);
        System.out.printf("Somatório: %.2f\n", somatorio);

    }
}
