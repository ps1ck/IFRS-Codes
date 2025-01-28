public class MaiorDeDoisNumeros {

    public static void main(String[] args) {

       double n1, n2;
       System.out.print("Digite o primeiro número:");
       n1 = Double.parseDouble(System.console().readLine());
       System.out.print("Digite o segundo número: ");
       n2 = Double.parseDouble(System.console().readLine());

       if(n1 > n2)
              System.out.printf("Maior número:%f\n",n1);
       if(n2 > n1)
              System.out.printf("Maior número:%f\n", n2);
       if(n1 == n2)
              System.out.println("Os números são iguais.");
}

}