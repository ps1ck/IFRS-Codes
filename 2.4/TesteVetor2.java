public class TesteVetor2 {

    public static void main(String[] args) {

int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; // Mesma coisa que o outro, só que adicionando
                                                                                           //manualmente em vez de usar um for pra isso.
for(int pos = 1; pos <= 20; pos++)
    System.out.println(numeros[pos - 1]);

    }
}

// Para operações que envolvam todas as posições de um vetor (como fizemos em todos os problemas tratados até aqui neste capítulo), 
//podem-se reduzir as chances de erros fazendo-se uso do fato de o vetor possuir uma propriedade chamada length. Esta propriedade 
//armazena o tamanho do vetor . Poderíamos, por exemplo, reescrever a estrutura for do exemplo anterior dessa forma:

//              for(int pos = 1; pos <= números.length; pos++)
//                  System.out.println(numeros[pos - 1]);