/*  Desenvolva um programa que leia quatro valores numéricos inteiros e 
mostre os valores que são divisíveis por 2 e 3. */

public class ex5 {
    public static void main(String[] args) {
        
        int n1,n2,n3,n4;
        System.out.println("Digite o 1° número: ");
        n1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o 2° número: ");
        n2 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o 3° número: ");
        n3 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o 4° número: ");
        n4 = Integer.parseInt(System.console().readLine());

        System.out.println("Os números divisíveis por 2 e 3 são: ");
        
        if ((n1 % 2) == 0 && (n1 % 3) == 0){
            System.out.println(n1);
        }
        if ((n2 % 2) == 0 && (n2 % 3) == 0){
            System.out.println(n2);
        }
        if ((n3 % 2) == 0 && (n3 % 3) == 0){
            System.out.println(n3);
        }
        if ((n4 % 2) == 0 && (n4 % 3) == 0){
            System.out.println(n4);
        }
    }
}
