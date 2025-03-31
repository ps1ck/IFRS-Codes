/* Escreva um programa em Java que leia um string contendo um número 
em binário e o mostre em decimal na tela.  */

public class exc3 {
    public static void main(String[] args) {
        
        String n;
        double r;

        System.out.println("Digite um número em binário para conversão: ");
        n = System.console().readLine();

        r =  Integer.parseInt(n);
        System.out.printf("Número convertido: %f",r);

    }
}
/* Esse programa não lê binários fracionários, mas como não foi especificado no exercício e nem no curso esse tipo de conteúdo, deixei assim. */