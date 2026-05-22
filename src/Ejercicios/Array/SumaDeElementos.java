package Ejercicios.Array;

import java.util.Scanner;

/**
 * 4. Suma de Elementos en un Arreglo: Realice un programa que lea desde teclado
 * 10 números
 * enteros y los almacene en un vector. Una vez finalizada la carga, calcular la
 * suma de todos sus elementos.
 */
public class SumaDeElementos {
	int cantidad = 10;

	/**
	 * Proceso principal
	 */
	public SumaDeElementos() {
		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese 10 numeros enteros.");

		// Leer numeros
		int[] numeros = leerNumeros(in);

		int sumaTotal = sumarElementos(numeros);
		System.out.println("Suma total de los elementos: " + sumaTotal);
	}

	/**
	 * Sumar todos los elementos de un arreglo
	 * 
	 * @return
	 */
	int sumarElementos(int[] numeros) {
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}

		return suma;
	}

	/**
	 * Leer todos los numeros
	 */
	int[] leerNumeros(Scanner in) {
		int[] numeros = new int[cantidad];
		int indice = 0;
		while (true) {
			if (indice >= numeros.length) {
				break;
			}

			System.out.print("Ingrese un numero: ");
			numeros[indice] = in.nextInt();
			indice++;
		}

		return numeros;
	}
}
