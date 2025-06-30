import java.util.Scanner;
import java.text.Normalizer;

public class ex11 {
    public static void main(String[] args) {

        String resposta;

        Scanner sc = new Scanner(System.in);
        
        System.out.printf("É mamífero? "); resposta = sc.nextLine();
        if(removerAcentos(resposta).equals("sim")){ 
            System.out.printf("É quadrúpede? "); resposta = sc.nextLine(); 
            if(removerAcentos(resposta).equals("sim")){ 
                System.out.printf("É carnívoro? "); resposta = sc.nextLine();
                if(removerAcentos(resposta).equals("sim")){ System.out.printf("Então o animal escolhido foi o leão."); }
                else if(removerAcentos(resposta).equals("nao")){ 
                    System.out.printf("É herbívoro? "); resposta = sc.nextLine();
                    if(removerAcentos(resposta).equals("sim")){ System.out.printf("Então o animal escolhido foi o cavalo.");  }
                    else if(removerAcentos(resposta).equals("nao")){ System.out.printf("Animal não encontrado!"); }  
                 } 
             }
            else if(removerAcentos(resposta).equals("nao")){ 
            System.out.printf("É bípede? "); resposta = sc.nextLine();
            if(removerAcentos(resposta).equals("sim")){ 
                System.out.printf("É onívoro? "); resposta = sc.nextLine();
                if(removerAcentos(resposta).equals("sim")){ System.out.printf("Então o animal escolhido foi o homem."); }
                else if(removerAcentos(resposta).equals("nao")){ 
                    System.out.printf("É frutívoro? "); resposta = sc.nextLine();
                    if(removerAcentos(resposta).equals("sim")){ System.out.printf("Então o animal escolhido foi o macaco."); }
                    else if(removerAcentos(resposta).equals("nao")){ System.out.printf("Animal não encontrado!"); }  
                 }  
             }
            else if(removerAcentos(resposta).equals("nao")){ 
                System.out.printf("É voador? "); resposta = sc.nextLine();
                if(removerAcentos(resposta).equals("sim")){ System.out.printf("Então o animal escolhido foi o morcego."); }
                else if(removerAcentos(resposta).equals("nao")){ 
                    System.out.printf("É aquático? "); resposta = sc.nextLine();
                    if(removerAcentos(resposta).equals("sim")){ System.out.printf("Então o animal escolhido foi a baleia."); }
                    else if(removerAcentos(resposta).equals("nao")){ System.out.printf("Animal não encontrado!"); }  
                 }  
             }  
             }
            }
        else if(removerAcentos(resposta).equals("nao")){ 
        System.out.printf("É ave? "); resposta = sc.nextLine(); 
        if(removerAcentos(resposta).equals("sim")){ 
            System.out.printf("É não-voadora? "); resposta = sc.nextLine();
            if(removerAcentos(resposta).equals("sim")){ 
                System.out.printf("É tropical? "); resposta = sc.nextLine();
                if(removerAcentos(resposta).equals("sim")){ System.out.printf("Então o animal escolhido foi o avestruz."); }
                else if(removerAcentos(resposta).equals("nao")){ 
                    System.out.printf("É polar? "); resposta = sc.nextLine();
                    if(removerAcentos(resposta).equals("sim")){ System.out.printf("Então o animal escolhido foi o pinguim."); }
                    else if(removerAcentos(resposta).equals("nao")){ System.out.printf("Animal não encontrado!"); }         
                 } 
             }
            else if(removerAcentos(resposta).equals("nao")){ 
                System.out.printf("É nadadora? "); resposta = sc.nextLine();
                if(removerAcentos(resposta).equals("sim")){ System.out.printf("Então o animal escolhido foi o pato."); }
                else if(removerAcentos(resposta).equals("nao")){ 
                    System.out.printf("É de rapina? "); resposta = sc.nextLine();
                    if(removerAcentos(resposta).equals("sim")){ System.out.printf("Então o animal escolhido foi a águia."); }
                    else if(removerAcentos(resposta).equals("nao")){ System.out.printf("Animal não encontrado!"); } 
                 } 
             }  
        }
        else if(removerAcentos(resposta).equals("nao")){ 
        System.out.printf("É réptil? "); resposta = sc.nextLine();  
        if(removerAcentos(resposta).equals("sim")){ 
            System.out.printf("É com casco? "); resposta = sc.nextLine();
            if(removerAcentos(resposta).equals("sim")){ System.out.printf("Então o animal escolhido foi a tartaruga."); }
            else if(removerAcentos(resposta).equals("nao")){ 
                System.out.printf("É carnívoro? "); resposta = sc.nextLine();
                if(removerAcentos(resposta).equals("sim")){ System.out.printf("Então o animal escolhido foi o crocodilo."); }
                else if(removerAcentos(resposta).equals("nao")){ 
                    System.out.printf("É sem patas? "); resposta = sc.nextLine();
                    if(removerAcentos(resposta).equals("sim")){ System.out.printf("Então o animal escolhido foi a cobra."); }
                    else if(removerAcentos(resposta).equals("nao")){ System.out.printf("Animal não encontrado!"); } 
                 } 
             } }
        else if(removerAcentos(resposta).equals("nao")){ System.out.printf("Animal não encontrado!"); }}}

        sc.close();
    }

    public static String removerAcentos(String texto) {                 /* Criado pelo chat gpt pra poder ler o "não", com acento... */
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                         .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                         .toLowerCase();
    }
}
