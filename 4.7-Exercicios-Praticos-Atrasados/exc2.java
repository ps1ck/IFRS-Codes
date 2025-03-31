/* Escreva um programa em Java que mostre os números os números de 0 
a 100 e seus correspondentes em binário.  */

public class exc2 {
    public static void main(String[] args) {
        
        int i;
        String b;

        for(i = 0; i < 101; i++){
            b = Integer.toString(i, 2);         /* Só de passar um int para string ele sai em binário, muito interessante! */
            System.out.printf("O correspondente em binário de %d é %s\n",i,b);
        }

    }
}