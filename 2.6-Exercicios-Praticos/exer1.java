/* 
 1. Faça um programa que preencha três vetores com dez posições cada 
um: o primeiro vetor, com os nomes de dez produtos; o segundo vetor, 
com os códigos dos dez produtos; e o terceiro vetor, com os preços dos 
produtos. Mostre um relatório apenas com o nome, o código, o preço e o 
novo preço dos produtos que sofrerão aumento. Sabe-se que os 
produtos que sofrerão aumento são aqueles que possuem código par ou 
preço superior a R$ 1.000,00.  Sabe-se ainda que, para os produtos que 
satisfizerem às duas condições anteriores, código e preço, o aumento 
será de 20%; para aqueles que satisfizerem apenas à condição do 
código, o aumento será de 15%; e para aqueles que satisfizerem apenas 
à condição de preço, o aumento será de 10%.
 */

public class exer1 {
    public static void main(String[] args) { 

        String[] nomes = {"Processador", "Placa de Vídeo", "Memória RAM", "Cadeira Gamer", "Mesa Gamer", "Monitor 144hz", "Monitor 240hz", "Teclado Mecânico", "Mouse Gamer", "Fone Gamer 7.1"};
        int[] codigos = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        double[] precos = {2500.00, 3500.00, 350.00, 780.00, 1200.00, 1100.00, 2200.00, 500.00, 450.00, 500.00}; 
        double novopreco = 0;

        for(int i = 0;i <= 9; i++){
            if((codigos[i] % 2 == 0) && precos[i] > 1000.00){
                novopreco = precos[i] + (precos[i]*0.20); // %20 de aumento
                System.out.printf("Relatório Produto %d\n Nome: %s - Código %d - Preço: R$ %.2f\n Novo preço do produto: R$ %.2f\n",(i+1),nomes[i], codigos[i], precos[i],novopreco);
            }
            else if((codigos[i] % 2 == 0)){
                novopreco = precos[i] + (precos[i]*0.15); // %15 de aumento
                System.out.printf("Relatório Produto %d\n Nome: %s - Código %d - Preço: R$ %.2f\n Novo preço do produto: R$ %.2f\n",(i+1),nomes[i], codigos[i], precos[i],novopreco);
            }
            else if(precos[i] > 1000.00){
                novopreco = precos[i] + (precos[i]*0.10); // %10 de aumento
                System.out.printf("Relatório Produto %d\n Nome: %s - Código %d - Preço: R$ %.2f\n Novo preço do produto: R$ %.2f\n",(i+1),nomes[i], codigos[i], precos[i],novopreco);
            }
            else{
                System.out.printf("Relatório Produto %d\n Nome: %s - Código %d - Preço: R$ %.2f\n Esse produto não teve aumento!\n",(i+1),nomes[i], codigos[i], precos[i]);
            }
            
        }
    } 
}