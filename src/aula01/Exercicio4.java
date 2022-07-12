package aula01;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = scan.nextInt();

		if (n % 2 == 1) {

			System.out.println(n + " é primo");
		} else {
			System.out.println(n + " não e primo");
		}
		scan.close();
	}

}
