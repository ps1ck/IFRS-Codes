/*
3. Crie um programa que gere e mostre os números primos de 1 a 100. 
Utilize a função construída no exercício 7.
*/

public class exercicio3 {
    static boolean primos(int n){
        if(n < 2){ return false; } // Essa função pode ser usada em qualquer situação, aqui é somente de 0 até 100, mas se o usuário quisesse digitar qualquer sequência, também funcionaria.
        else{
        for(int i = 2;i <= (Math.sqrt(n));i++){
            if(n % i == 0){ return false; }
        } }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Números primos de 1 a 100.");
        for(int x = 1;x <= 100; x++){
            if(primos(x)){ System.out.printf("%d ",x); count++; }
            if(count == 10){ System.out.println(); count = 0;}
        }
    }
}