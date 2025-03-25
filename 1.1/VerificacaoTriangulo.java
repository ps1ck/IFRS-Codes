public class VerificacaoTriangulo {

    public static void main(String[] args) {
 
        double A, B, C;
 
        System.out.print("Medida A: ");
        A = Double.parseDouble(System.console().readLine());
 
        System.out.print("Medida B: ");
        B = Double.parseDouble(System.console().readLine());

        System.out.print("Medida C: ");
        C = Double.parseDouble(System.console().readLine());
 
       if(A + B > C && A + C > B && B + C > A) {
 
            if(A == B && B == C)
            System.out.println("As medidas formam um triângulo EQUILÁTERO");
 
            else if(A != B && A != C && B != C)
                System.out.println("As medidas formam um triângulo ESCALENO");
 
            else
                System.out.println("As medidas formam um triângulo ISÓSCELES");
 
       } else {
            System.out.println("As medidas informadas NÃO formam um triângulo");
 
       }
 
    }
 
 }