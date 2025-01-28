/* Construa um programa que leia três valores para os lados de um 
triângulo (A, B e C). O programa deve verificar se os lados fornecidos 
formam realmente um triângulo. Em caso positivo, deve mostrar a 
mensagem “Os lados formam um triângulo” e caso contrário “Os valores 
informados não podem formar um triângulo”.  Para que três valores de 
lados formem um triângulo, cada par de lados somados não pode ser 
menor ou igual ao terceiro lado.  */

public class ex4 {
    public static void main(String[] args) {
        double a,b,c;
        System.out.println("Valor para o lado A: ");
        a = Double.parseDouble(System.console().readLine());
        System.out.println("Valor para o lado B: ");
        b = Double.parseDouble(System.console().readLine());
        System.out.println("Valor para o lado C: ");
        c = Double.parseDouble(System.console().readLine());

        if (a > b && a > c){
            if ((b + c) > a){
                System.out.println("Os lados formam um triângulo");
            }
            else{
                System.out.println("Os valores informados não podem formar um triângulo");
            }
        }

        if (b > a && b > c){
            if ((a + c) > b){
                System.out.println("Os lados formam um triângulo");
            }
            else{
                System.out.println("Os valores informados não podem formar um triângulo");
            }
        }

        if (c > a && c > b){
            if ((a + b) > c){
                System.out.println("Os lados formam um triângulo");
            }
            else{
                System.out.println("Os valores informados não podem formar um triângulo");
            }
        }

    }
}
