/* Faça um programa que apresente os quadrados dos números inteiros de 
15 a 200. */

public class Exe7 {
    public static void main(String[] args) {
        
        int i = 14, q;

        while(i != 200){
            i += 1;
            q = i*i;
            System.out.printf("O quadrado de %d é = %d \n",i,q);
        }

    }
}
