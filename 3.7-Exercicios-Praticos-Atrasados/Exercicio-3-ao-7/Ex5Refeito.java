/* 3 a 7. Refaça os exercícios 1, 2, 5, 6, 7 do caderno de exercícios do módulo 
anterior utilizando as estruturas para..faça e for.

Exercício 5:
Crie um programa para ler a quantidade de litros de combustível e a 
distância percorrida por um carro em várias viagens. O programa deve 
calcular o consumo médio do carro, que é igual a média de quilômetros 
por litro de todas as viagens. O número de viagens realizado deve ser 
informado pelo usuário.
*/

public class Ex5Refeito {
    public static void main(String[] args) {
        
        int qtdV, i;
        double lc, dp, cm, somaKm = 0;

        System.out.println("Digite a quantidade de viagens: ");
        qtdV = Integer.parseInt(System.console().readLine());

        for(i = 1; i < qtdV+1; i += 1){
            System.out.printf("Digite quantos litros de combustível foram gastos na %d° viagem: \n",i);
            lc = Double.parseDouble(System.console().readLine());
            System.out.println("Digite a distância percorrida: ");
            dp = Double.parseDouble(System.console().readLine());
            somaKm += (dp / lc);
        }

        cm = somaKm / qtdV;
        System.out.printf("O consumo médio do carro em %d viagens foi de: %.1f km/l.\n",qtdV,cm);

    }
}