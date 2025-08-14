public class Quadrado2 {
    static double quad(double num){
        double resultado;
        resultado = num * num;
        return resultado;
    } // fim do metodo quad

    public static void main(String[]args){
        double N;

        System.out.print("Numero: ");
        N = Double.parseDouble(System.console().readLine());

        System.out.printf("O quadrado do número é %f\n",quad(N));
    } // fim do metodo main
} // fim da classe Quadrado2


/* 
    OBSERVAÇÕES: 
"Olhando para a definição de main, podemos perceber que ele também é um método estático que recebe um parâmetro e não retorna valor
(pois o tipo de retorno é void). Vínhamos definindo métodos desde o início e não sabíamos! Todo programa Java é uma classe que define 
um método chamado main. Podemos definir classes sem main, mas essas classes não podem ser executadas como programas."
 */