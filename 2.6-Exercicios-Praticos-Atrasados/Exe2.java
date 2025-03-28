/* Faça um programa que calcule o somatório, a soma dos quadrados e a 
média entre os n primeiros números inteiros positivos. */


public class Exe2 {
    public static void main(String[] args) {

        int auxMedia = 0;
        double numero = 1, somaINT = 0, media, quadrado = 0, somatorio;

        while(numero != 0){

            System.out.println("Digite um número (Digite 0 para parar o programa): ");
            numero = Double.parseDouble(System.console().readLine());

                if (numero != 0){    
                        if (numero >= 0 && (numero%1) == 0){
                            System.out.println("É um inteiro positivo.");
                            somaINT += numero;
                            auxMedia += 1;
                            quadrado = quadrado + (numero*numero); 
                        }
                        else{
                            System.out.println("Não é um inteiro positivo.");
                            quadrado += (numero*numero); 
                        }
                    }
                else{
                    break;
                }
        }

        media = somaINT / auxMedia;
        somatorio = quadrado + media;
        System.out.printf("Soma dos quadrados: %.2f\n", quadrado);
        System.out.printf("Média dos %d primeiros números inteiros positivos: %.2f\n",auxMedia, media);
        System.out.printf("Somatório: %.2f\n", somatorio);

    }
}
