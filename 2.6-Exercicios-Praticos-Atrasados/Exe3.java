/* Crie um programa Java para exibir os quadrados de números digitados 
pelo usuário, até que ele digite um número negativo. */

public class Exe3 {
    public static void main(String[] args){

        double x = 1, quadrado = 0;

        while(x >= 0){

            System.out.println("Digite um número positivo (um número negativo para o programa): ");
            x = Double.parseDouble(System.console().readLine());
            if (x >= 0){
            quadrado = x*x;
            System.out.printf("O quadrado do número é: %.1f\n",quadrado);
            }
            else{
                break;
            }
        }

    }
}
