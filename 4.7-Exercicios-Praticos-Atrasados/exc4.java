/* Escreva um programa em Java que calcule as raízes de uma equação 
de segundo grau utilizando a fórmula de Báskara. A equação de 
segundo grau é uma equação no formato Ax2 + Bx + C. O usuário deve 
informar os valores para A, B e C.  */

public class exc4 {
    public static void main(String[] args) {
        
        double a,b,c,delta,x, x2;

        System.out.println("Digite o valor de A: ");
        a = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o valor de B: ");
        b = Double.parseDouble(System.console().readLine());        
        System.out.println("Digite o valor de C: ");
        c = Double.parseDouble(System.console().readLine());

        delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0){
            x = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.printf("Delta é maior que zero (%.3f), logo a equação possui duas raízes reais.\nS = {%.3f , %.3f}",delta,x,x2);
        }
        if (delta == 0){
            x = -b / (2*a);
            System.out.printf("Delta é igual a %.3f, logo a equação só possui uma raíz real.\nS = %.3f",delta,x);
        }
        if (delta < 0){
            System.out.printf("Delta é negativo (%.3f), logo a equação não possui raízes reais.",delta);
        }

    }
}