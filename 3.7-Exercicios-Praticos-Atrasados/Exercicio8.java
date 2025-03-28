/* . Faça um algoritmo e um programa, utilizando as estruturas repita e do..while 
que repita a leitura de uma senha até que o usuário digite o número 1234. Após 
isso, mostrar a mensagem “Senha correta, acesso liberado.”  */

public class Exercicio8 {
    public static void main(String[] args) {
        
        int n;

        do{
            System.out.println("Digite a senha:");
            n = Integer.parseInt(System.console().readLine());
        }while(n != 1234);

        System.out.println("Senha correta, acesso liberado.");
    }
}