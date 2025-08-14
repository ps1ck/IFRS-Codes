public class MontandoTabuleiro {
    
    static char[] montaTabuleiro(char[] palavra) {

       char[] tabuleiro = new char[palavra.length]; // palavra é o vetor globalmente declarado onde a palavra sorteada ta armazenada.

       for(int cont = 0; cont < tabuleiro.length; cont++) {

             tabuleiro[cont] = '_';

       }
       return tabuleiro;
    }
}
