/* Uma empresa decide dar um aumento de 30% aos funcionários cujo 
salário é inferior a 5000. Escreva um programa que possa ser utilizado 
para efetuar o cálculo do salário reajustado de um funcionário, a partir 
do valor do salário informado pelo usuário.  */

public class ex9 {
    public static void main(String[] args) {
        double s,ns;
        System.out.println("Informe o valor do seu salário: ");
        s = Double.parseDouble(System.console().readLine());
        
        if (s < 5000){
            ns = (s * 0.30) + s;
            System.out.printf("Você terá um aumento, novo reajustado = R$ %.2f\n", ns);
        }
        else{
            System.out.printf("Você não terá um aumento, salário = R$ %.2f\n", s);
        }
    }
}