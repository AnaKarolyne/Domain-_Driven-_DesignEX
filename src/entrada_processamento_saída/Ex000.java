package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex000 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int a, b, soma;
			
			System.out.printf("Digite o primeiro valor: ");
			a = ler.nextInt();
			
			System.out.printf("Digite o segundo valor: ");
			b = ler.nextInt();
			
			soma = a + b;
			
			//System.out.printf("A soma �: %d", soma);
			
			System.out.printf("A soma �: %d + %d = %d\n", a, b, soma);
		}
	}

}