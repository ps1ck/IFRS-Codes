public class CalculaFuncao {

    public static void main(String[] args) {

         double x, fx;
         System.out.print("Valor de X: ");
         x = Double.parseDouble(System.console().readLine());

         while(x != 0) {                                        // Flag / Sentinela / Variável de controle

               fx = x*x - 5*x + 6;

               System.out.printf("F(x) = %f\n", fx);

               System.out.print("Valor de X: ");

               x = Double.parseDouble(System.console().readLine());

         }

    }

}