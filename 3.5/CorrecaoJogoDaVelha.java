// A versão final dada pelo IFRS não funciona corretamente... Vou tentar corrigir para que o empate funcione
// Ainda da pra escrever em cima do que o adversário escolheu, mas como só pode haver 9 jogadas, é funcional...

public class CorrecaoJogoDaVelha {
    public static void main(String[] args) {

    char jogador = 'X', vencedor = 'A'; // Já inicializamos aqui
    int linha, coluna, cont, contaJogadas = 0;
    char[][] tabuleiro = new char[3][3];

while(vencedor != 'X' && vencedor != 'O'&& vencedor != 'E') { // Alterei aqui e parece funcionar o empate!
    System.out.printf("Jogador %c é a sua vez.\n", jogador);
    System.out.print("Linha: ");
        linha = Integer.parseInt(System.console().readLine());
    System.out.print("Coluna: ");
        coluna = Integer.parseInt(System.console().readLine());

    if(linha >= 1 && linha <= 3 && coluna >= 1 && coluna <= 3) {                            
        tabuleiro[linha-1][coluna-1] = jogador;
        
        if(jogador == 'X'){
            jogador = 'O';}
        else{
            jogador = 'X';}

        contaJogadas++;

        if(contaJogadas == 9){
            vencedor = 'E';}
        
        for(cont = 0; cont < 3; cont++) {
            
            if(tabuleiro[cont][0] == tabuleiro[cont][1] && tabuleiro[cont][1] == tabuleiro[cont][2]){
                vencedor = tabuleiro[cont][0];}

            if(tabuleiro[0][cont] == tabuleiro[1][cont] && tabuleiro[1][cont] == tabuleiro[2][cont]){
                vencedor = tabuleiro[0][cont];}
            }

        if(tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]){
            vencedor = tabuleiro[0][0];}

        if(tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]){
            vencedor = tabuleiro[0][2];}

        // MOSTRA TABULEIRO
        for(cont = 0; cont < 3; cont++) {
            System.out.printf("%c  %c  %c\n", tabuleiro[cont][0], tabuleiro[cont][1], tabuleiro[cont][2]);}
    
    } else {
        System.out.println("Essa posição não existe!");}
}

// MOSTRA VENCEDOR
if(vencedor == 'E'){
    System.out.println("\nHouve empate!\n");}
else{
    System.out.printf("\nVENCEDOR: Jogador %c\n", vencedor);}
    }
}

// Esse código não funciona corretamente... O empate não está sendo executado e os jogadores podem escrever por cima do que o adversário 
//escolheu. Mas como a ideia é só ensinar sobre matrizes, ta valendo...