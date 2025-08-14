// Utilizando a abordagem top-down, escrevemos o código geral e agora vamos criar as funções pra completar o código
// Coloquei esse código como comentário porque como os métodos não foram declarados, muitos erros aparecem e esse código só serve pra vermos o antes(incompleto) e o depois(completo).

/* public class JogoDaForcaINCOMPLETO {
    public static void main(String[] args) {
        char[] palavra = sorteiaPalavra();
        char[] tabuleiro = montaTabuleiro(palavra);
        int erros = 0;
        
        while(erros <= 7 && !Arrays.equals(tabuleiro, palavra)) {
            mostraTabuleiro(tabuleiro);                        
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

    } */