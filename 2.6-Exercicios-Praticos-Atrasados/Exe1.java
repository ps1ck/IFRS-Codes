/* Faça um programa que calcule a soma de dez números quaisquer 
fornecidos pelo usuário  */

public class Exe1 {
    public static void main(String[] args) {
        
        double nmr;
        double soma = 0;
        int x = 1;

       while (x <= 10){
        
        System.out.printf("Digite o %d° número (máx. 10): ",x);
        nmr = Double.parseDouble(System.console().readLine());
        soma = soma + nmr;
        x = x + 1;
        
       }

       System.out.printf("A soma dos 10 números resultou em: %.1f", soma);
    }
}
