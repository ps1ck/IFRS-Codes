/*  A nota final de um estudante é calculada a partir de três notas 
atribuídas, respectivamente, a um trabalho de laboratório, a uma 
avaliação semestral e a um exame final. A média das três notas 
mencionadas obedece aos pesos a seguir: 

Nota                            Peso
Trabalho de laboratório         2
Avaliação semestral             3
Exame final                     5
 
Faça um programa que receba as três notas, calcule e mostre a média 
ponderada e o conceito que segue a tabela: 

Média Ponderada                                     Conceito
8,0 (inclusive) a 10,0 (inclusive)                  A
7,0 (inclusive) a 8,0                               B
6,0 (inclusive) a 7,0                               C
5,0 (inclusive) a 6,0                               D
0,0 (inclusive) a 5,0                               E
*/

public class ex10 {
    public static void main(String[] args) {
        double tl,as,ef, media;
        System.out.println("Digite a nota do trabalho de laboratório: ");
        tl = Double.parseDouble(System.console().readLine());
        System.out.println("Digite a nota da avaliação semestral: ");
        as = Double.parseDouble(System.console().readLine());
        System.out.println("Digite a nota do exame final: ");
        ef = Double.parseDouble(System.console().readLine());

        media = ((tl*2) + (as*3) + (ef*5)) / (2 + 3 + 5);
        System.out.printf("Média = %.1f \n", media);

        if (media >= 8.0 && media <= 10.0){
            System.out.println("Conceito = A \n");
        }

        if (media >= 7.0 && media < 8.0){
            System.out.println("Conceito = B \n");
        }

        if (media >= 6.0 && media < 7.0){
            System.out.println("Conceito = C \n");
        }

        if (media >= 5.0 && media < 6.0){
            System.out.println("Conceito = D \n");
        }

        if (media >= 0.0 && media < 5.0){
            System.out.println("Conceito = E \n");
        }

    }
}
