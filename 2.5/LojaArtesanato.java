public class LojaArtesanato {
	public static void main(String[] args) {

		// DECLARAÇÃO E CRIAÇÃO DOS VETORES
		double[] vetValorUnit = new double[10];
		int[] vetQuantVend = new int[10];

		int cont, objMaisVend;
		double total, totalGeral, comissao;

		for(cont = 1; cont <= 10; cont++) {
			System.out.printf("--- PRODUTO %d ---\n", cont);
			System.out.print("Preço Unitário: ");
			vetValorUnit[cont-1] = Double.parseDouble(System.console().readLine());
			System.out.print("Quant. Vendida: ");
			vetQuantVend[cont-1] = Integer.parseInt(System.console().readLine());
		}

		totalGeral = 0;
		for(cont = 1; cont <= 10; cont++) {

			// escrevendo os dados do produto
			System.out.printf("Produto: %d\n", cont);
			System.out.printf("Quant. vendida: %d\n", vetQuantVend[cont-1]);
			System.out.printf("Preço Unit.: %.2f\n", vetValorUnit[cont-1]);

			total = vetValorUnit[cont-1] * vetQuantVend[cont-1];
			System.out.printf("Valor total do produto: %.2f\n\n", total);

			totalGeral += total;
		}
		comissao = totalGeral * 0.05;
		System.out.printf("Total geral = R$ %.2f\n", totalGeral);
		System.out.printf("Comissão = R$ %.2f\n", comissao);

		objMaisVend = 0;
		for(cont = 2; cont <= 10; cont++) {
			if(vetQuantVend[cont-1] > vetQuantVend[objMaisVend])
				objMaisVend = cont-1;
		}

		System.out.printf("Produto mais vendido = %d\n", objMaisVend+1);
		System.out.printf("Preço do produto mais vendido = R$ %.2f\n", vetValorUnit[objMaisVend]);
	}
}
