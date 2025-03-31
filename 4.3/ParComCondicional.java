public class ParComCondicional {

    public static void main(String[] args) {

        int numero;
        String resposta;

        System.out.print("Digite um numero inteiro: ");
        numero = Integer.parseInt(System.console().readLine());

        resposta = numero % 2 == 0 ? "par" : "impar";           /* teste ? valor1 : valor2 -> Caso seja verdadeiro, valor1 será usado, senão será o valor2. */

        System.out.printf("O numero é %s.\n", resposta);

    }

}