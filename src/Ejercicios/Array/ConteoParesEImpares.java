package Ejercicios.Array;

import java.util.Scanner;

/**
 * 3. Conteo de Números Pares e Impares
 * Realice un programa que lea desde teclado 25 números enteros y los almacene en un vector.
 * Una vez finalizada la carga, contar cuántos son pares y cuántos son impares.
 */
public class ConteoParesEImpares {
	int cantidadDeNumeros = 25;

	/**
	 * Proceso principal
	 */
	public ConteoParesEImpares() {
		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese 25 números enteros");

		// Leer numeros
		int[] numeros = leerNumeros(in);

		// Contar pares e impares
		int[] paresEImpares = contarParesEImpares(numeros);

		System.out.println("Numeros impares: " + paresEImpares[0]);
		System.out.println("Numeros pares: " + paresEImpares[1]);
	}

	/**
	 * Contar pares e impares
	 * 
	 * @return
	 */
	int[] contarParesEImpares(int[] numeros) {
		int pares = 0;
		int impares = 0;
		for(int i = 0; i < numeros.length; i++) {
			int num = numeros[i];

			if(num % 2 == 0) {
				pares++;
			} else {
				// Es impar
				impares++;
			}
		}

		int[] contados = { impares, pares };
		return contados;
	}

	/**
	 * Leer numeros
	 * 
	 * @param in
	 * @return
	 */
	int[] leerNumeros(Scanner in) {
		int[] numeros = new int[cantidadDeNumeros];
		int indice = 0;
		while(true) {
			// Salir al procesar todos los numeros
			if(indice >= cantidadDeNumeros) {
				break;
			}

			System.out.print("Ingrese un numero: ");
			// No pide validacion, guardar directamente
			numeros[indice] = in.nextInt();
			indice++;
		}
		return numeros;
	}
}
