package aula01;

public class Exercicio5 {

	public static void main(String[] args) {
		Boolean validador = true;

		int[] numero = { 1, 4};

		for (int i = 0; i < numero.length; i++) {
			if (numero[i] != 1 && numero[i] != 4) {
				validador = false;
				break;
			}

		}
		if (validador == true) {
			System.out.println("Possui somente 1 e 4");
		} else {
			System.out.println("Nao possui somente 1 e 4");
		}
	}
}
