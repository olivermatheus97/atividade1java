package aula01;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int numero;
		int par = 0;
		int impar = 0;
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		numero = entrada.nextInt();
		
		for (int i = 0; i <= numero; i++) {
			boolean epar = i  % 2 == 0;
			if(epar) {
				par = par + i;
			} else {
				impar = impar + i;
			  }
	    }
		boolean numentrada = numero % 2 == 0;
		     if(numentrada) {
		    	 System.out.print("A soma dos números pares ate o digitados são : " + par);
		     } else {
		    	 System.out.print("A soma dos números ímpares ate o digitados digitados são : " + impar);
		     }
		     entrada.close();
    }
}	