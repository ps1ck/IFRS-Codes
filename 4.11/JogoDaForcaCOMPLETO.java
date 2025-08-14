import java.util.Arrays;

public class JogoDaForcaCOMPLETO {

    static char[] sorteiaPalavra() {        // Método de sorteio
       int sorteio = (int)(Math.random()*10)+1;
       switch(sorteio) {

             case 1: return new char[]{'U','V','A'};

             case 2: return new char[]{'B','A','N','A','N','A'};

             case 3: return new char[]{'A','B','A','C','A','X','I'};

             case 4: return new char[]{'M','A','N','G','A'};

             case 5: return new char[]{'M','A','R','A','C','U','J','A'};

             case 6: return new char[]{'L','A','R','A','N','J','A'};

             case 7: return new char[]{'M','O','R','A','N','G','O'};

             case 8: return new char[]{'L','I','M','A','O'};

             case 9: return new char[]{'A','C','E','R','O','L','A'};

             case 10: return new char[]{'C','A','Q','U','I'};

       }
       return new char[0];
    }

    static char[] montaTabuleiro(char[] palavra) {

       char[] tabuleiro = new char[palavra.length]; // palavra é o vetor globalmente declarado onde a palavra sorteada ta armazenada.

       for(int cont = 0; cont < tabuleiro.length; cont++) {

             tabuleiro[cont] = '_';

       }
       return tabuleiro;
    }

    static void mostraTabuleiro(char[] tabuleiro) { // vai receber o tabuleiro montado, armazenado pelo método anterior a ele ->  char[] tabuleiro = montaTabuleiro(palavra);

       for(int cont = 0; cont < tabuleiro.length; cont++) {

             System.out.print(tabuleiro[cont]);

             System.out.print(" ");

       }
       System.out.println();
    }

    static boolean acertou(char[] palavra, char letra) { // letra digitada pelo usuário, comparada com o vetor palavra, que tem todas as letras da palavra sorteada.

       for(int cont = 0; cont < palavra.length; cont++) {

             if(palavra[cont] == letra){                
                    return true; }
       }
       return false;
    }

    static void atualizaTabuleiro(char[] tabuleiro, char[] palavra, char letra) {

       for(int cont = 0; cont < palavra.length; cont++) {

             if(palavra[cont] == letra){

                    tabuleiro[cont] = letra; } // adiciona a letra na posição que tem um _ desse vetor, atualizando a tabela e revelando a letra.
       }
    }



    public static void main(String[] args) {
        char[] palavra = sorteiaPalavra();
        char[] tabuleiro = montaTabuleiro(palavra);
        int erros = 0;
        
        while(erros <= 7 && !Arrays.equals(tabuleiro, palavra)) {   // arrays.equals verifica se os dois vetores forem IGUAIS em tamanho e conteúdo, se sim, retorna true, mas como
            mostraTabuleiro(tabuleiro);                             // tem um ! antes, ele vai retornar true quando eles forem DIFERENTES, ou seja, você ainda não acertou tudo.
            System.out.print("Informe uma letra: ");
            char letra = System.console().readLine().charAt(0);
    
                if(acertou(palavra, letra)){
                    atualizaTabuleiro(tabuleiro, palavra, letra); }
                else{
                    erros++;}
                }

        if(erros > 7){
            System.out.println("Você perdeu :("); }
        else{
            System.out.println("Você venceu :)"); }
          }

    }