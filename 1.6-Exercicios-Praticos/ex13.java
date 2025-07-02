/* 13. As Ilhas Weblands formam um reino independente nos mares do Pacífico. 
Como é um reino recente, a sociedade é muito influenciada pela informática. A 
moeda oficial é o Bit; existem notas de B$ 50,00, B$10,00, B$5,00 e B$1,00. 
Você foi contratado(a) para ajudar na programação dos caixas automáticos de 
um grande banco das Ilhas Weblands.  
    Os caixas eletrônicos das Ilhas Weblands operam com todos os tipos de 
notas disponíveis, mantendo um estoque de cédulas para cada valor (B$ 50,00, 
B$10,00, B$5,00 e B$1,00). Os clientes do banco utilizam os caixas eletrônicos para 
efetuar retiradas de um certo número inteiro de Bits.  
    Sua tarefa é escrever um algoritmo e um programa que, dado o valor de 
Bits desejado pelo cliente, determinem o número de cada uma das notas 
necessário para totalizar esse valor, de modo a minimizar a quantidade de cédulas 
entregues. Por exemplo, se o cliente deseja retirar B$50,00, basta entregar uma 
única nota de cinquenta Bits. Se o cliente deseja retirar B$72,00, é necessário 
entregar uma nota de B$50,00, duas de B$10,00 e duas de B$1,00. Notas cuja 
quantidade for zero não devem ser mostradas.  
    Todos os caixas iniciam sua operação com um número de 100 notas de cada 
valor. O programa não deve permitir saques que utilizam mais notas do que o 
contido no caixa. Além disso, o valor máximo que pode ser sacado a cada retirada é 
de B$ 1000,00.  
    O programa deve permitir que o usuário entre com diversos valores, até 
que ele digite um número negativo ou atinja o número limite de saques, que é de 
100. A cada saque, o número de notas no caixa de cada valor deve ser 
decrementado de acordo com o valor retirado.  
    Ao final, o algoritmo/programa deve mostrar o total de cada nota que resta 
no caixa. Como exemplo, consideremos um caso em que três saques foram feitos, 
no valor de 100, 20 e 7 bits. O relatório deveria mostrar:  
Restam 98 notas de B$ 50, 98 notas de B$ 10, 99 notas 
de R$ 5 e 98 notas de B$ 1. */

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

        int notas50 = 100, notas10 = 100, notas5 = 100, notas1 = 100;
        int maxSaques = 100, numeroDeSaques = 0;

        while (numeroDeSaques < maxSaques) {
            System.out.print("Digite o valor para saque (negativo para encerrar): "); int valor = sc.nextInt();
            
            if (valor < 0) { System.out.println("Valor negativo digitado, encerrado o programa!"); break; }
            if (valor > 1000) {
                System.out.println("Valor máximo por saque é B$1000. Tente novamente.");
                continue;               // Pula o resto do código e volta pro início do while!
            }

            // Verificação antes de confirmar o saque pra ver se é possível fazê-lo
            int v = valor;
            int n50 = Math.min(v / 50, notas50);
            v -= n50 * 50;

            int n10 = Math.min(v / 10, notas10);
            v -= n10 * 10;

            int n5 = Math.min(v / 5, notas5);
            v -= n5 * 5;

            int n1 = Math.min(v / 1, notas1);
            v -= n1;

            if (v > 0) {
                System.out.println("Não há notas suficientes para realizar este saque."); // Não subtraímos do valor original, porque usamos cópias,
                continue;                                                                   //assim não teremos problemas, o programa só vai rodar de novo.
            }

            // Se chegar aqui, o saque foi efetivado, então agora subtraímos do valor real, e não das cópias :D
            notas50 -= n50;
            notas10 -= n10;
            notas5 -= n5;
            notas1 -= n1;

            System.out.println("Notas entregues:");
            if (n50 > 0) System.out.println(n50 + " nota(s) de B$50");
            if (n10 > 0) System.out.println(n10 + " nota(s) de B$10");
            if (n5 > 0) System.out.println(n5 + " nota(s) de B$5");
            if (n1 > 0) System.out.println(n1 + " nota(s) de B$1");

            numeroDeSaques++;
        }
        sc.close();

        // Relatório final
        System.out.println("\nRelatório final de notas restantes:");
        System.out.println("Restam " + notas50 + " notas de B$ 50");
        System.out.println("Restam " + notas10 + " notas de B$ 10");
        System.out.println("Restam " + notas5 + " notas de B$ 5");
        System.out.println("Restam " + notas1 + " notas de B$ 1");
    }
}
        // Como já estava a muito tempo nessa lista, usei o chat gpt pra me ajudar a escrever esse código e poupar tempo, aprendi a instrução "continue;", 
        //formatei o código inteiro da forma que eu gostaria, além de comentar o código explicando pra mim mesmo o que ta sendo feito e claro, aprender.