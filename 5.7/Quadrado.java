public class Quadrado {
    public static void main(String[] args) {

        double num, quad;

        num = Double.parseDouble(System.console().readLine());

        quad = num * num;

        System.out.printf("%f ao quadrado eh %f\n", num, quad);

    }
}

//%% - mostra um sinal de % (não é necessário informar nenhuma variável ou expressão para substituí-lo).
//%d - permite mostrar valores inteiros.

//%f - permite mostrar valores reais. É possível especificar quantas casas decimais se deseja colocar a vírgula. Por exemplo, “%.2f” mostraria um número
// com duas casas após a vírgula e “%.5f” mostraria um número com 5 casas após a vírgula. Se o número tiver menos casas do que o especificado,
// será completado com zeros à direita. Se tiver mais dígitos do que o especificado, será arredondado para o número de dígitos desejado.  

//%b - permite mostrar um valor lógico.
//%c - permite mostrar um valor caractere.
//%s - permite mostrar um valor literal.