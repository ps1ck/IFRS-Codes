public class estatisticasCinema2 {
    public static void main(String[] args) {

        int idade, somaIdades = 0, maiorIdade = -1;
        int resOtimo = 0, resRuim = 0, resPessimo = 0, numPessoas = 0, cont = 0;
        char nota;
        double mediaIdades, percPessimo;

        do {
            cont++;
            System.out.printf("--- ESPECTADOR %03d ---\n", cont);
            System.out.printf("Idade: ");
            idade = Integer.parseInt(System.console().readLine());

            System.out.printf("Nota: ");
            nota = System.console().readLine().charAt(0);            

            if(nota != 'F') {
                numPessoas++;
                if(nota == 'A' || nota == 'a')
                resOtimo++;

                else if(nota == 'D' || nota == 'd') {
                    resRuim++;
                    somaIdades += idade;

                } else if(nota == 'E' || nota == 'e') {
                    resPessimo++;

                    if(idade > maiorIdade)
                    maiorIdade = idade;
                }
            }
        } while(nota != 'F');

        mediaIdades = somaIdades / resRuim;
        percPessimo = resPessimo * 100 / numPessoas;    

        System.out.printf("Notas Ótimo = %d\n", resOtimo);
        System.out.printf("Média Idades das notas ruins = %.1f\n", mediaIdades);
        System.out.printf("Percentual notas 'Péssimo' = %.1f %%\n", percPessimo);
        System.out.printf("Maior idade a responder 'Péssimo' = %d\n", maiorIdade);
    }
}