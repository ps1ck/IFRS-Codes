/* 2. O Detran deseja realizar uma vistoria geral nos veículos do estado. Para 
isso, elaborou a seguinte distribuição, a partir do último dígito do número na 
placa do automóvel: 
    - Placas que terminam com 0 devem realizar a vistoria em Janeiro 
    do próximo ano 
    - Placas que terminam com 1 devem realizar a vistoria em 
    Fevereiro do próximo ano 
    - Placas que terminam com 2 devem realizar a vistoria em Março 
    do próximo ano 
    - Placas que terminam com 3 devem realizar a vistoria em Abril do 
    próximo ano 
    - Placas que terminam com 4 devem realizar a vistoria em Maio do 
    próximo ano 
    - Placas que terminam com 5 devem realizar a vistoria em Junho 
    do próximo ano 
    - Placas que terminam com 6 devem realizar a vistoria em 
    Setembro deste ano 
    - Placas que terminam com 7 devem realizar a vistoria em Outubro 
    deste ano 
    - Placas que terminam com 8 devem realizar a vistoria em 
    Novembro deste ano 
    - Placas que terminam com 9 devem realizar a vistoria em 
    Dezembro deste ano 
Escreva um algoritmo (utilizando escolha) e um programa em Java (utilizando 
switch) que, a partir do número da placa de um veículo (um inteiro de 4 dígitos), 
mostrem em qual mês ele deve realizar a vistoria. DICA: para obter o último 
dígito da placa obtenha o resto a divisão dela por 10.  */

public class Exercicio2 {
    public static void main(String[] args) {
     
        int placa;

        System.out.println("Digite a placa do carro: ");
        placa = Integer.parseInt(System.console().readLine());

        switch(placa%10){
            case 0:
                System.out.println("Sua vistoria será em Janeiro do próximo ano.");
                break;
            case 1:
                System.out.println("Sua vistoria será em Fevereiro do próximo ano.");
                break;
            case 2:
                System.out.println("Sua vistoria será em Março do próximo ano.");
                break;
            case 3:
                System.out.println("Sua vistoria será em Março do próximo ano.");
                break;
            case 4:
                System.out.println("Sua vistoria será em Março do próximo ano.");
                break;
            case 5:
                System.out.println("Sua vistoria será em Junho do próximo ano.");
                break;
            case 6:
                System.out.println("Sua vistoria será em Setembro deste ano.");
                break;
            case 7:
                System.out.println("Sua vistoria será em Outubro deste ano.");
                break;
            case 8:
                System.out.println("Sua vistoria será em Novembro deste ano.");
                break;
            case 9:
                System.out.println("Sua vistoria será em Dezembro deste ano.");
                break;
            default:
                System.out.println("Valor inválido!");
        }


    }
}