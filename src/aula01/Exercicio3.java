package aula01;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("digite seu texto");
		String frase = scan.nextLine();
		System.out.println("String processada pelo metodo: ");
		System.out.println(frase.replaceAll("[aAeEiIoOuU]", ""));
		
		scan.close();
	}
}
