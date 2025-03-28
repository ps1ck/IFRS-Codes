/* Escreva um algoritmo (utilizando escolha) e um programa em Java 
(utilizando switch) que leiam três números inteiros que representam uma data 
com dia, mês e ano respectivamente. O programa deve escrever esta data da 
seguinte forma: 
dia de nome do mês de ano */

public class Exercicio1 {
    public static void main(String[] args) {
        
        int d, m, a;

        System.out.println("Digite o dia: ");
        d = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o mês: ");
        m = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o ano: ");
        a = Integer.parseInt(System.console().readLine());

        switch(m){
            case 1:
                System.out.printf("%d de Janeiro de %d. \n",d,a);
                break;
            case 2:
                System.out.printf("%d de Fevereiro de %d. \n",d,a);
                break;
            case 3:
                System.out.printf("%d de Março de %d. \n",d,a);
                break;
            case 4:
                System.out.printf("%d de Abril de %d. \n",d,a);
                break;
            case 5:
                System.out.printf("%d de Maio de %d. \n",d,a);
                break;
            case 6:
                System.out.printf("%d de Junho de %d. \n",d,a);
                break;
            case 7:
                System.out.printf("%d de Julho de %d. \n",d,a);
                break;
            case 8:
                System.out.printf("%d de Agosto de %d. \n",d,a);
                break;
            case 9:
                System.out.printf("%d de Setembro de %d. \n",d,a);
                break;
            case 10:
                System.out.printf("%d de Outubro de %d. \n",d,a);
                break;
            case 11:
                System.out.printf("%d de Novembro de %d. \n",d,a);
                break;
            case 12:
                System.out.printf("%d de Dezembro de %d. \n",d,a);
                break;
            default:
                System.out.println("Valor inválido!");
        }

    }
}
