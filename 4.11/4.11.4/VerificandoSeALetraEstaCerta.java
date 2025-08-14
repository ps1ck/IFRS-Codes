public class VerificandoSeALetraEstaCerta {

    static boolean acertou(char[] palavra, char letra) { // letra digitada pelo usuário, comparada com o vetor palavra, que tem todas as letras da palavra sorteada.

       for(int cont = 0; cont < palavra.length; cont++) {

             if(palavra[cont] == letra){                
                    return true; }
       }
       return false;
    }
}
