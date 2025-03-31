/* Faça um programa que recebe dois números e execute uma das 
operações listadas a seguir, de acordo com a escolha do usuário. Se for 
digitada uma opção inválida, mostre uma mensagem avisando sobre 
isso e termine a execução do programa. As opções são: 
    1. O primeiro número elevado ao segundo número. 
    2. Raiz quadrada de cada um dos números. 
    3. Raiz cúbica de cada um dos números.  */

public class exc7 {
    public static void main(String[] args) {
        
        double x,y,resultado, resultado2;
        int opcao;

        System.out.println("Digite o 1° número: ");
        x = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o 2° número: ");
        y = Double.parseDouble(System.console().readLine());
        System.out.println("Escolha uma das opções abaixo digitando o número correspondente:\n 1. O primeiro número elevado pelo segundo número\n 2. Raiz quadrada de cada um dos números\n 3. Raiz cúbica de cada um dos números.\n ");
        opcao = Integer.parseInt(System.console().readLine());

        switch(opcao){
            case 1:
            resultado = Math.pow(x, y);
            System.out.printf("O resultado de %.1f elevado a %.1f é = %.1f",x,y,resultado);
            break;
            case 2:
            resultado = Math.sqrt(x);
            resultado2= Math.sqrt(y);
            System.out.printf("O resultado da raiz quadradada de %.1f é = %.1f e a de %.1f é = %.1f",x,resultado,y,resultado2);
            break;
            case 3:
            resultado = Math.cbrt(x);
            resultado2= Math.cbrt(y);
            System.out.printf("O resultado da raiz cúbica de %.1f é = %.1f e a de %.1f é = %.1f",x,resultado,y,resultado2);
            break;
            default:
            System.out.println("Opção inválida!");
        }

    }
}