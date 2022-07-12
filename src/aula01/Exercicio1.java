package aula01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		double janeiro, fevereiro, marco, soma, media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os gastos de janeiro: ");
		janeiro = entrada.nextDouble();
		
		System.out.println("Digite os gastos de fevereiro : ");
		fevereiro = entrada.nextDouble();
		
		System.out.println("Digite os gastos de março : ");
		marco = entrada.nextDouble();
		
		soma = (janeiro+fevereiro+marco);
		
		media = (soma)/3;		
		System.out.println("A despesas total do trimestre são: "+ soma);
		
		System.out.println("A média é : "+ media);
		
		
		entrada.close();
	}

		
}
