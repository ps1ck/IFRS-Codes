/* É um pouco diferente, ele faz até o teste ser FALSO, então ali ele só vai parar se o número for IGUAL a 8, que retornaria
 * falso e pararia o programa.
 */

public class repitaEmJava {

    public static void main(String[] args) {
    
    int numero;
    
    do {
    
    System.out.print("Digite um número inteiro: ");
    
    numero = Integer.parseInt(System.console().readLine());
    
    } while(numero != 8);
    
    System.out.println("Você acertou o número!");
    
    }
    
    
    
    }