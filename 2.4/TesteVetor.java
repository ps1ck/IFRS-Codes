public class TesteVetor {
    public static void main(String[] args) {

int[] numeros = new int[20];

for(int pos = 1; pos <= 20; pos++)
    numeros[pos - 1] = pos;

    System.out.println("Numeros de 1 a 20: ");

for(int pos = 1; pos <= 20; pos++)
    System.out.println(numeros[pos - 1]);

    }
}