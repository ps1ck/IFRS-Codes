public class SorteioPalavra {
    
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
}
