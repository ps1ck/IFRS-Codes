/* Escreva um programa em Java que leia um número real qualquer e um 
número de casas decimais (inteiro) e o arredonde o número real para o 
número de casas especificado. Por exemplo, caso o usuário informe o 
número 1,1379 e 2 casas decimais, o número seria arredondado para 
1,14.  */

public class exc5 {
    public static void main(String[] args) {
        
        double casas,n,r;
        int c;

        System.out.println("Digite o número real: ");
        n = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o número de casas decimais desejadas: ");
        c = Integer.parseInt(System.console().readLine());

        casas = Math.pow(10, c);
        r = Math.round( n * casas) / casas;                     /* Sobe o valor do número pra arredondar somente a parte solicitada, depois volta o número pro normal */
        System.out.printf("Número arredondado para %d casas: %." + c +"f\n",c,r); /* Imprime com o número exato solicitado pelo exercício. */

    }
}
