public class Exemplo01 { 

     public static void main(String[] args) {

          double N1, N2, N3, N4, RES;     

          N1 = Double.parseDouble(System.console().readLine());

          N2 = Double.parseDouble(System.console().readLine());

          N3 = Double.parseDouble(System.console().readLine());

          N4 = Double.parseDouble(System.console().readLine());

        

          RES = (N1 + N2 + N3 + N4) / 4;       

          System.out.println(RES);

     }

}