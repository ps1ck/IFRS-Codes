/* Alterei o tipo de "nota" e "soma" para double por que a nota provavemente vai ser um numero real e pra deixar a conta 
mais precisa também. */

public class MediaNotasTurma {
    public static void main(String[] args) {

         int nro_estudantes, notaslidas;
         double media, nota, soma;

         System.out.print("Numero de estudantes da turma: ");
         nro_estudantes = Integer.parseInt(
         System.console().readLine());

         soma = 0;

         notaslidas = 0;

         while(notaslidas < nro_estudantes) {

               System.out.printf("Nota %d: ", notaslidas+1);

               nota = Double.parseDouble(System.console().readLine());

               soma = soma + nota;

               notaslidas = notaslidas + 1;

         }

         media = soma / nro_estudantes;
         System.out.printf("Media das notas = %.1f\n", media);

    }

}
