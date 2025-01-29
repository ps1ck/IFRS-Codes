public class fatorial {
    public static void main(String[] args) {

         int numero, valor, fatorial;
         System.out.print("Informe um número inteiro: ");
         numero = Integer.parseInt(System.console().readLine());

         valor = 2;

         fatorial = 1;

         while(valor <= numero) {

               fatorial = fatorial * valor;

               valor = valor + 1;

         }

         System.out.printf("O fatorial de %d é %d.\n", numero, fatorial);

    }

}

/* Se o número 0 for digitado deveria ser imprimido 1, pois o fatorial de 0 é 1, nesse caso seria impresso 0. Uma forma de
corrigir isso seria colocando um if antes pra verificar se o número é 0, false -> imprime 1. true -> vai pro while */