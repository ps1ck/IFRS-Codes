/* 3 a 7. Refaça os exercícios 1, 2, 5, 6, 7 do caderno de exercícios do módulo 
anterior utilizando as estruturas para..faça e for. 

Exercício 2:
Faça um programa que calcule o somatório, a soma dos quadrados e a 
média entre os n primeiros números inteiros positivos.
*/

public class Ex2Refeito {
    public static void main(String[] args) {
        
        int qtd, i, qtdNip = 0;
        double n, sQuadrados = 0, sNI = 0, media, somatorio;

        System.out.println("Digite quantas vezes o programa deve receber números: ");
        qtd = Integer.parseInt(System.console().readLine());

        for(i = 1; i < qtd+1; i += 1){

            System.out.printf("Digite o %d° número: \n",i);
            n = Double.parseDouble(System.console().readLine());
            sQuadrados += (n*n);

            if (n >= 0 && (n%1) == 0){
                sNI += n;
                qtdNip += 1;
            }

        }

        media = sNI / qtdNip;
        somatorio = media + sQuadrados;
        System.out.printf("Soma dos quadrados: %.2f\n", sQuadrados);
        System.out.printf("Média dos %d primeiros números inteiros positivos: %.2f\n",qtdNip, media);
        System.out.printf("Somatório: %.2f\n", somatorio);

    }
}