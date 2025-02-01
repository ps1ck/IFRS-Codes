/* A diferença entre o switch e o escolha está no fluxo do programa, depois que um número é escolhido o switch vai direto
 * pro final do programa, no escolha ele verifica todos os casos mesmo depois de um ser verdadeiro. Se tirarmos o break
 * depois de cada case do switch, basicamente vira um escolha.
 */

public class switchEmJava {
        public static void main(String[] args) {
  
              int numero;
  
              System.out.print("Informe um número inteiro de 0 a 10: ");
  
              numero = Integer.parseInt(System.console().readLine());
  
              switch(numero) {
  
                    case 0 -> System.out.println("Zero");
  
                    case 1 -> System.out.println("Um");
  
                    case 2 -> System.out.println("Dois");
  
                    case 3 -> System.out.println("Tres");
  
                    case 4 -> System.out.println("Quatro");
  
                    case 5 -> System.out.println("Cinco");
  
                    case 6 -> System.out.println("Seis");
  
                    case 7 -> System.out.println("Sete");
  
                    case 8 -> System.out.println("Oito");
  
                    case 9 -> System.out.println("Nove");
  
                    case 10 -> System.out.println("Dez");
  
                    default -> System.out.println("Número inválido!");
  
              }
  
        }
  
  }
