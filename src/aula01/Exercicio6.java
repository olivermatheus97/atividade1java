package aula01;

import java.util.Arrays;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * 1. Múltiplos de 10: Dado array, você deve avaliar cada posição. Quando
		 * encontrar um múltiplo de 10, você deve substituir os próximos valores por
		 * esse múltiplo. Caso encontre outro, o valor deve mudar para este novo
		 * múltiplo. Ex: 1, 10, 11, 20, 12 -> 1, 10, 10, 20, 20.
		 */
		int ultimoMultiplo = 0;

		int[] array = { 1, 10, 11, 20, 12 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 == 0) {
				ultimoMultiplo = array[i];
			} else {
				array[i] = ultimoMultiplo;
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
