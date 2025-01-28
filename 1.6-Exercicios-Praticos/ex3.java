/* Construa um programa que leia três valores numéricos (representados 
pelas variáveis A, B e C) e faça o cálculo do delta de uma equação de 
segundo grau, segundo a fórmula de Báskara. O programa deve mostrar 
quantas raízes reais a equação possui (delta < 0 – mostrar uma 
mensagem dizendo que a equação não possui raízes reais, delta > 0 – 
mostrar que possui duas raízes reais, delta = 0 – mostrar que possui 
uma única raiz real).  */

public class ex3 {
    public static void main(String[] args) {
        double a,b,c,delta;
        System.out.println("Digite o A da equação: ");
        a = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o B da equação: ");
        b = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o C da equação: ");
        c = Double.parseDouble(System.console().readLine());

        delta = (b*b) - (4 * a * c);
        if (delta < 0){
            System.out.println("A equação não possui raízes reais. (delta < 0)");
        }
        if (delta > 0){
            System.out.println("Possui duas raízes reais. (delta > 0)");
        }
        if (delta == 0){
            System.out.println("Possui uma única raiz real. (delta == 0)");
        }
    }
}
