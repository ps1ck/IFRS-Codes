public class AtualizandoOTabuleiro {

    static void atualizaTabuleiro(char[] tabuleiro, char[] palavra, char letra) {

       for(int cont = 0; cont < palavra.length; cont++) {

             if(palavra[cont] == letra){

                    tabuleiro[cont] = letra; } // adiciona a letra na posição que tem um _ desse vetor, atualizando a tabela e revelando a letra.
       }
    }
}
