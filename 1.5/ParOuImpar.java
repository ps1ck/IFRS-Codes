public class ParOuImpar {
    public static void main(String[] args) {
    int numero;
    System.out.print("Digite o número desejado: ");
    numero = Integer.parseInt(System.console().readLine());

    if(numero % 2 == 0)
        System.out.println("O número é par");
    else
        System.out.println("O número é ímpar");

}



}