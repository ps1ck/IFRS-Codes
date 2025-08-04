public class PesquisaTV {
	public static void main(String[] args) {
		int[] contadores = new int[10];
		int cont, canal;

		for(cont = 0; cont < 10; cont++) {
			contadores[cont] = 0;
		}

		for(cont = 1; cont <= 100; cont++) {
			System.out.printf("Informe a %dª resposta: ", cont);
			canal = Integer.parseInt(System.console().readLine());
			contadores[canal-1]++;
		}

		for(cont = 0; cont < 10; cont++) {
			System.out.printf("%d pessoas assistem o canal %d.\n", contadores[cont], cont+1);
		}
	}
}
