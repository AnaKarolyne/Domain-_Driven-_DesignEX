package estrutura_repeticao;

import java.util.Scanner;

public class EX23W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner ler = new Scanner(System.in)) {
			String c;
		
		System.out.print("Digite o seu sexo: F para femenino e M para masculino: ");
    	c = ler.next();
    	c = c.toUpperCase();
    	
    	while(c != "F" && c != "M") {
		    System.out.printf("Erroou! O nosso código não está pronto para receber esse tipo de informação. Por favor, digite F para o sexo feminino e M para o sexo masculino: ");
    	}
    	{
         	System.out.printf("Sexo registrado! ");
         }

	}
}
}	
