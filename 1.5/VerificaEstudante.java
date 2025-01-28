public class VerificaEstudante {
    public static void main(String[] args) {
        double n1,n2,n3,media,notaExame;
        System.out.print("Digite a nota 1 do estudante: ");
        n1 = Double.parseDouble(System.console().readLine());
        System.out.print("Digite a nota 2 do estudante: ");
        n2 = Double.parseDouble(System.console().readLine());
        System.out.print("Digite a nota 3 do estudante: ");
        n3 = Double.parseDouble(System.console().readLine());

        media = (n1 + n2 + n3) / 3;
        System.out.printf("Média = %.1f\n", media);

        if(media >= 0 && media < 3){
            System.out.println("Reprovado");
        }
        if(media >= 3 && media < 7){
            System.out.println("Exame");
            notaExame = 12 - media;
            System.out.printf("Nota p/ exame = %.1f\n", notaExame);
        }
        if(media >= 7){
            System.out.println("Aprovado");
        }
    }
    
}
