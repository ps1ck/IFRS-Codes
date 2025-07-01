/* 12. Muitas canções populares são baseadas em padrões repetitivos. Logo é                             Exercícios com Switch (ESCOLHA) - 5/5
possível construir algoritmos que montem suas letras a partir desses padrões 
que se repetem.  
Escreva um programa em Java que gere e mostre no terminal shell 
(console) a letra da popular canção norte-americana de Natal “The Twelve Days 
of Christmas” transcrita abaixo. Utilize estruturas de controle e não 
simplesmente um System.out.print ou println em toda a música.
----- Náo vou copiar a letra porque tem toda uma formatação a seguir...-----   */

import java.util.ArrayList;
import java.util.Collections;

public class ex12 {
    public static void main(String[] args) {

        int dia = 1;
        String day = "";
        String presente = "";

        ArrayList<String> listaPresentes = new ArrayList();

        do{
            switch(dia){
            case 1:
                day = "first"; presente = "a partridge in a pear tree."; listaPresentes.add("and a partridge in a pear tree."); break;
            case 2:
                day = "second"; presente = "two turtle doves,"; listaPresentes.add(presente); break;
            case 3:
                day = "third"; presente = "three french hens,"; listaPresentes.add(presente); break;
            case 4:
                day = "fourth"; presente = "four calling birds,"; listaPresentes.add(presente); break;     
            case 5:
                day = "fifth"; presente = "five gold rings,"; listaPresentes.add(presente); break;
            case 6:
                day = "sixth"; presente = "six geese a-laying,"; listaPresentes.add(presente); break;
            case 7:
                day = "seventh"; presente = "seven swans a-swimming,"; listaPresentes.add(presente); break;
            case 8:
                day = "eighth"; presente = "eight maids a-milking,"; listaPresentes.add(presente); break;
            case 9:
                day = "ninth"; presente = "nine ladies waiting,"; listaPresentes.add(presente); break;
            case 10:
                day = "tenth"; presente = "ten lords a-leaping,"; listaPresentes.add(presente); break;
            case 11:
                day = "eleventh"; presente = "eleven pipers piping,"; listaPresentes.add(presente); break;
            case 12:
                day = "twelth"; presente = "twelve drummers drumming,"; listaPresentes.add(presente); break;
            }
            
            System.out.printf("On the %s day of Christmas, my love gave to me %s\n",day, presente);
            int tamanhoLista = listaPresentes.size();
            if(dia > 1){
                for(int i = 1; i <= (tamanhoLista-1); i++){ 
                    Collections.reverse(listaPresentes);
                    System.out.printf(" %s\n",(listaPresentes.get(i)));
                    Collections.reverse(listaPresentes); } }
            dia += 1;
        }while(dia <=12);
    }
}