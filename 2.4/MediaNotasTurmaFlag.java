/* Coloquei "soma" e "nota" como double de novo, pois as notas são números reais. Adicionei ao final o número de alunos
 * também. O programa vai parar quando um NÚMERO NEGATIVO for digitado.
 */


public class MediaNotasTurmaFlag {
    public static void main(String[] args) {

         int notaslidas;
         double media, soma, nota;

         soma = 0;

         notaslidas = 0;

         System.out.printf("Nota 1: ");

         nota = Double.parseDouble((System.console().readLine()));

         while(nota >= 0) {

               soma = soma + nota;
               notaslidas = notaslidas + 1;

               System.out.printf("Nota %d: ", notaslidas+1);
               nota = Double.parseDouble(System.console().readLine());

         }

         media = soma / notaslidas;
         System.out.printf("Media das notas = %.1f\n", media);
         System.out.printf("Número de alunos = %d\n", notaslidas);

    }

}