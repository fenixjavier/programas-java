package Ejercicios.Array;

import java.util.Scanner;

/**
 * 2. Número Mayor y Menor: Realice un programa que lea desde teclado 10 números
 * enteros y
 * los almacene en un vector.
 * Una vez finalizada la carga, encontrar el número mayor y el
 * número menor dentro del arreglo y mostrarlo por pantalla.
 */
public class NumeroMayorYMenor {
	int cantidadDeNumeros = 10;

	// Iniciar programa
	public NumeroMayorYMenor() {
		Scanner in = new Scanner(System.in);

		// Leer numeros
		int[] numeros = leerNumeros(in);

		// Encontrar mayor y menor
		int[] numerosEncontrados = mayorYMenor(numeros);

		System.out.println("Numero menor: " + numerosEncontrados[0]);
		System.out.println("Numero mayor: " + numerosEncontrados[1]);
	}

	// Encontrar el numero mayor y el numero menor
	int[] mayorYMenor(int[] numeros) {
		int numMayor = numeros[0];
		int numMenor = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			int num = numeros[i];

			// Guardar mayor
			if (num > numMayor) {
				numMayor = num;
			}

			// Guardar menor
			if (num < numMenor) {
				numMenor = num;
			}
		}

		int[] numerosEncontrados = { numMenor, numMayor };
		return numerosEncontrados;
	}

	// Leer numeros
	int[] leerNumeros(Scanner in) {
		int indice = 0;
		int[] numerosEnteros = new int[cantidadDeNumeros];
		while (true) {
			// Salir al leer todos los numeros
			if (indice >= numerosEnteros.length) {
				break;
			}

			System.out.print("Ingrese un numero: ");

			// No pide validacion
			numerosEnteros[indice] = in.nextInt();
			indice++;
		}

		return numerosEnteros;
	}
}
