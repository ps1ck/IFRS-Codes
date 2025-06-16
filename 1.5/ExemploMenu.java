public class ExemploMenu {
public static void main(String[] args) {

int opcao;
double salario, imposto;

    do {
        System.out.println("Menu de opções:");
        System.out.println("1. Imposto");
        System.out.println("2. Novo salário");
        System.out.println("3. Classificação");
        System.out.println("4. Finalizar o programa");
        System.out.print("Digite sua opção: ");

        opcao = Integer.parseInt(System.console().readLine());

    switch(opcao) {
        case 1:
            System.out.print("Salário do funcionário: ");
            salario = Double.parseDouble(System.console().readLine());
                    
                if(salario < 1000)
                    imposto = salario * 0.05;
                else if(salario <= 3000)
                    imposto = salario * 0.10;
                else
                    imposto = salario * 0.15;
                    System.out.printf("Imposto = R$ %.2f\n", imposto);
        break;    
        case 2:
            System.out.print("Salário do funcionário: ");
            salario = Double.parseDouble(System.console().readLine());

                if(salario < 1350)
                    salario += 300;
                else if(salario < 2250)
                    salario += 225;
                else if(salario <= 4500)
                    salario += 150;
                else
                    salario += 75;
                    System.out.printf("Novo Salário = R$ %.2f\n", salario);
        break;
        case 3:
            System.out.print("Salário do funcionário: ");
            salario = Double.parseDouble(System.console().readLine());
                
                if(salario <= 1500)
                    System.out.println("Mal remunerado");
                else
                    System.out.println("Bem remunerado");
        break;
        case 4:
            System.out.println("Finalizando programa..."); 
        break;
        default: 
            System.out.println("Opção inválida!");
        break;
                    }
          } while(opcao != 4);
    }
}