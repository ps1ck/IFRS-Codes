/* Desenvolva um programa que leia três valores numéricos inteiros, 
identifique e apresente o maior valor informado.  */

public class ex7 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Digite o 1° número: ");
        a = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o 2° número: ");
        b = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o 3° número: ");
        c = Integer.parseInt(System.console().readLine());

        if (a > b && a > c){
            System.out.printf("O número %d é o maior.", a);
        }

        if (b > a && b > c){
            System.out.printf("O número %d é o maior.", b);
        }

        if (c > a && c > b){
            System.out.printf("O número %d é o maior.", c);
        }
    }
}
