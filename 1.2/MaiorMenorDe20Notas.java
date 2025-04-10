public class MaiorMenorDe20Notas {
    public static void main(String[] args) {

        double nota, maior, menor;
        System.out.print("Informe a nota 1: ");
        nota = Double.parseDouble(System.console().readLine());
        maior = nota;
        menor = nota;
        
        for(int cont = 2; cont <= 20; cont++) {

            System.out.printf("Informe a nota %d: ", cont);
            nota = Double.parseDouble(System.console().readLine());  

                if(nota > maior){
                    maior = nota;
                }  
                
                if(nota < menor){
                    menor = nota;
                }        
        }

        System.out.printf("Maior nota = %.1f\n", maior);
        System.out.printf("Menor nota = %.1f\n", menor);

    }
}