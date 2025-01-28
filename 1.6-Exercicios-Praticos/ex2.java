/* Faça um programa que leia um valor numérico inteiro. O programa deve 
apresentar a mensagem “O valor está na faixa permitida”, caso o valor 
informado esteja entre 1 e 9. Se o valor estiver fora da faixa, o programa 
deve apresentar a mensagem “O valor está fora da faixa permitida”. */

public class ex2 {
    public static void main(String[] args) {
        int x;
        System.out.println("Digite o número para verificação: ");
        x = Integer.parseInt(System.console().readLine());
     
        if (x >= 1 && x <= 9){
            System.out.println("O número está na faixa permitida");
        }
        else{
            System.out.println("O valor está fora da faixa permitida");
        }
    }
}
