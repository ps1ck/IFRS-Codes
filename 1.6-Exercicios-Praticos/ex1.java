/* Faça um programa que leia dois valores numéricos inteiros e apresente 
o resultado da diferença do maior valor pelo menor valor. Se os valores 
forem iguais, o programa deve mostrar zero. */

public class ex1 {
    public static void main(String[] args) {

        int n1, n2, maior, menor, res;
        System.out.print("Digite o primeiro número:");
        n1 = Integer.parseInt(System.console().readLine());
        System.out.print("Digite o segundo número: ");
        n2 = Integer.parseInt(System.console().readLine());

        if (n1 == n2){
            System.out.println("Os números são iguais.");
            res = 0;
            System.out.printf("Logo, o resultado da diferença do maior pro menor é de = %d\n", res);
        }
        if(n1 > n2){
            maior = n1;
            menor = n2;
            res = maior - menor;
            System.out.printf("O maior número é = %d\n", maior);
            System.out.printf("Sendo %d o menor \n", menor);
            System.out.printf("E o resultado da diferença do maior pro menor é de = %d\n", res);
        }
        if(n2 > n1){
            maior = n2;
            menor = n1;
            res = maior - menor;
            System.out.printf("O maior número é = %d\n", maior);
            System.out.printf("Sendo %d o menor \n", menor);
            System.out.printf("E o resultado da diferença do maior pro menor é de = %d\n", res);
        }
    }
}
