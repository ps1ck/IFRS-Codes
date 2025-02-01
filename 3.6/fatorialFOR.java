public class fatorialFOR {

    public static void main(String[] args) {
    
    int numero, valor, fatorial;
    
    System.out.print("Número: ");
    
    numero = Integer.parseInt(System.console().readLine());
    
    fatorial = 1;
    
    for(valor = 2; valor <= numero; valor = valor + 1)
        fatorial = fatorial * valor;
    
    System.out.printf("Fatorial = %d\n", fatorial);
    
    }
    
    }