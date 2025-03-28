/* 3 a 7. Refaça os exercícios 1, 2, 5, 6, 7 do caderno de exercícios do módulo 
anterior utilizando as estruturas para..faça e for. 

Exercício 7:
Faça um programa que apresente os quadrados dos números inteiros de 
15 a 200.
*/

public class Ex7Refeito {
    public static void main(String[] args) {
        
        int i,q;

        for(i = 15; i < 201; i += 1){
            q = i*i;
            System.err.printf("O quadrado de %d é %d.\n",i,q);
        }

    }
}