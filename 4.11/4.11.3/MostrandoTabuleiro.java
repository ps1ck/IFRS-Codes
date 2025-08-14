public class MostrandoTabuleiro {
    
    static void mostraTabuleiro(char[] tabuleiro) { // vai receber o tabuleiro montado, armazenado pelo método anterior a ele ->  char[] tabuleiro = montaTabuleiro(palavra);

       for(int cont = 0; cont < tabuleiro.length; cont++) {

             System.out.print(tabuleiro[cont]);

             System.out.print(" ");

       }
       System.out.println();
    }
}
