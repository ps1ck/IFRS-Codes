/* Crie um programa para ler a quantidade de litros de combustível e a 
distância percorrida por um carro em várias viagens. O programa deve 
calcular o consumo médio do carro, que é igual a média de quilômetros 
por litro de todas as viagens. O número de viagens realizado deve ser 
informado pelo usuário. */

public class Exe5 {
    public static void main(String[] args){

        int qv, i = 0;
        double litros, distanciaPercorrida, kmPorLitro, somaKm = 0, consumoMedio;

        System.out.println("Digite a quantidade de viagens: ");
        qv = Integer.parseInt(System.console().readLine());

        while(i != qv){

            if (i != qv){
            i += 1;
            System.out.printf("Digite quantos litros de combustível foram gastos na %d° viagem: \n",i);
            litros = Double.parseDouble(System.console().readLine());
            System.out.println("Digite a distância percorrida: ");
            distanciaPercorrida = Double.parseDouble(System.console().readLine());
            kmPorLitro = distanciaPercorrida / litros;
            somaKm += kmPorLitro;
            }
            else{
                break;
            }

        }

        consumoMedio = somaKm / qv;
        System.out.printf("O consumo médio do carro em %d viagens foi de: %.1f km/l.\n",qv,consumoMedio);

    }
}
