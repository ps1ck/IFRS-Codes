public class CorrecaoDeProvas {
	public static void main(String[] args) {
		char[] gabarito = new char[8];
		int cont, numMatr, numResp, pontos, aprovados;
		char resposta;

		for(cont = 0; cont < 8; cont++) {
			System.out.printf("Resposta da questão %d: ", cont+1);

			// Para ler um valor char precisamos primeiro ler um valor String
			// e depois extrair somente o primeiro caractere.
			gabarito[cont] = System.console().readLine().charAt(0);
		}

		aprovados = 0;
		for(cont = 1; cont <= 10; cont++) {
			System.out.printf("\n\n--- ALUNO %d ---\n", cont);
			System.out.print("Número de matrícula: ");
			numMatr = Integer.parseInt(System.console().readLine());
			
			pontos = 0;
			for(numResp = 0; numResp < 8; numResp++) {
				System.out.printf("Resposta do aluno à questão %d: ", numResp+1);
				resposta = System.console().readLine().charAt(0);

				if(resposta == gabarito[numResp])
					pontos++;
			}
			
			System.out.printf("\n\nNúmero de matrícula do aluno: %d\n", numMatr);
			System.out.printf("Pontuação do aluno: %d\n", pontos);

			if(pontos >= 6)
				aprovados++;
		}

		System.out.printf("\n\nNúmero de alunos aprovados = %d\n", aprovados);
	}
}