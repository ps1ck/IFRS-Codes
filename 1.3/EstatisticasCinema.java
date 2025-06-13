public class EstatisticasCinema {

    public static void main(String[] args) {

      int idade, somaIdades = 0, maiorIdade = -1, contEspectadores = 0;
      int resOtimo = 0, resRuim = 0, resPessimo = 0;
      char nota;
      double mediaIdades = 0.0, percentualPessimo = 0.0;
   
      for(int cont = 1; cont <= 100; cont++) {
           System.out.printf("--- ESPECTADOR %03d ---\n", cont);
           System.out.printf("Idade: ");
           idade = Integer.parseInt(System.console().readLine());

           System.out.printf("Nota: ");
           nota = System.console().readLine().charAt(0);

           if(nota == 'A' || nota == 'a'){
               resOtimo++;
           }else if(nota == 'D' || nota == 'd'){
               resRuim++;
               somaIdades+= idade;
           }else if(nota == 'E' || nota == 'e'){
               resPessimo++;
               if(idade > maiorIdade)
                   maiorIdade = idade;
           }
           contEspectadores++;
      }
      percentualPessimo = ((resPessimo * 100)/contEspectadores);
      mediaIdades = somaIdades / resRuim;
      System.out.printf("Notas Ótimo = %d\n", resOtimo);
      System.out.printf("Média Idades das notas ruins= %.2f\n", mediaIdades); 
      System.out.printf("Percentual notas 'Péssimo' = %.2f %%\n", percentualPessimo);
      System.out.printf("Maior idade a responder 'Péssimo' = %d\n", maiorIdade);
   }
}