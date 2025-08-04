public class BuscaDeValores {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		int cont;
		boolean achou;

		for(cont = 0; cont < 10; cont++) {
			System.out.printf("Informe o %dº valor: ", cont+1);
			numeros[cont] = Integer.parseInt(System.console().readLine());
		}

		achou = false;
		for(cont = 0; cont < 10; cont++) {
			if(numeros[cont] > 50) {
				System.out.printf("Valor %d na posição %d.\n", numeros[cont], cont);
				achou = true;
			}
		}

		if(!achou)
			  System.out.println("Nenhum número maior do que 50 foi encontrado.");
	}
}
