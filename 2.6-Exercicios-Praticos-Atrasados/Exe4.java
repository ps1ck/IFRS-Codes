/* Faça um programa que receba várias idades, calcule e mostre a média 
das idades digitadas. Finalize digitando idade igual a zero.  */

public class Exe4 {
    public static void main(String[] args){

        int i = 1, qIdade = 0;
        double media = 0, soma = 0;

        while(i != 0){

            System.out.println("Digite uma idade (0 para o programa): ");
            i = Integer.parseInt(System.console().readLine());
            if (i !=  0){
                qIdade += 1;
                soma += i;
            }
            else{
                break;
            }
        }

        media = soma / qIdade;
        System.out.printf("Média das idades digitadas: %.1f",media, qIdade);

    }
}
