/* Para cada uma das mercadorias com que um armazém trabalha dispõe
se dos seguintes dados: 
−  o nome da mercadoria; 
−  o seu preço unitário; 
−  a quantidade total vendida no mês. 
Elabore um programa para calcular o faturamento total mensal do armazém. O 
faturamento total do armazém será calculado somando-se o total faturado por 
cada mercadoria, que é igual a quantidade vendida da mercadoria vezes o seu 
preço unitário. O número de mercadorias comercializadas pelo armazém deve 
ser informado pelo usuário.  */

public class Exe6 {
    public static void main(String[] args) {
        
        int qm, i = 0;
        double pu, qt, ftm = 0;
        String nome;

        System.out.println("Digite o número de mercadorias comercializadas pelo armazém: ");
        qm = Integer.parseInt(System.console().readLine());

        while(i < qm){
            System.out.println("Digite o nome da mercadoria: ");
            nome = System.console().readLine();
            System.out.printf("Digite o preço unitário de %s: \n",nome);
            pu = Double.parseDouble(System.console().readLine());
            System.out.printf("Digite a quantidade total vendida no mês de %s: \n",nome);
            qt = Double.parseDouble(System.console().readLine());
            ftm += (qt * pu);
            i += 1;
        }

        System.out.printf("Faturamento total do armazém: R$%.2f \n",ftm);

    }
}
