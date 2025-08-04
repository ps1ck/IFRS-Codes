public class MediaAlturas {
	public static void main(String[] args) {
		int[] alturas = new int[10];
		int cont, soma, maiores;
		double media;

		for(cont = 0; cont < 10; cont++) {
			System.out.printf("Altura da %dª pessoa: ", cont+1);
			alturas[cont] = Integer.parseInt(System.console().readLine());
		}

		soma = 0;
		for(cont = 0; cont < 10; cont++) {
			soma += alturas[cont];
		}

		media = soma / 10.0;

		maiores = 0;
		for(cont = 0; cont < 10; cont++) {
			if(alturas[cont] > media)
				maiores++;
		}

		System.out.printf("Quantidade de alturas maiores do que a média: %d\n", maiores);
	}
}
