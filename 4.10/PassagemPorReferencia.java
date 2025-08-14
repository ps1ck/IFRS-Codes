public class PassagemPorReferencia {
    static void modificaVetor(int b[]) {
        for(int cont = 0;cont < b.length;cont++){
            b[cont] *= 2;
        }
    }

    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5};

        System.out.println("Valores originais: ");
        for(int pos = 0;pos < 5;pos++){
            System.out.println(numeros[pos] + " ");
        }

        modificaVetor(numeros);

        System.out.println("Valores modificados: ");
        for(int pos = 0;pos < 5;pos++){
            System.out.println(numeros[pos] + " ");
        }

    }
}
