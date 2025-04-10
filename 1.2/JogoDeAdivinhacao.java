public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        int numero_sorteado, palpite; 
        numero_sorteado = (int)(Math.random()*1000+1);

        do {

            System.out.print("Palpite: ");
            palpite = Integer.parseInt(System.console().readLine());

            if(palpite > numero_sorteado){
                System.out.println("Muito alto");}

            else if(palpite < numero_sorteado){
                System.out.println("Muito baixo");}
            else{
            System.out.println("Você acertou!");}
        
        } while(palpite != numero_sorteado);

    }
}