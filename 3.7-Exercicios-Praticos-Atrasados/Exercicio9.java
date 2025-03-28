/* A série de Fibonacci é formada pela seguinte sequência: 1, 1, 2, 3, 5, 8, 13, 
21, 34, 55, ... etc, onde o próximo número é igual a soma dos dois anteriores. 
Escreva um programa que gere os dez primeiros números da série de 
Fibonacci, utilizando estruturas repita e do...while.  */

public class Exercicio9 {
    public static void main(String[] args) {
        int i = 0, z, x = 0, y = 1;

        do{
            
            z = x + y;
            System.out.println(z);
            x = y;
            y = z;

            i += 1;

        }while(i != 10);
    }
}