package Ejercicios.Array;

import java.util.Scanner;

/**
 * 5. Inversión de un Arreglo: Realice un programa que lea desde teclado 10
 * números enteros y
 * los almacene en un vector. Una vez finalizada la carga, mostrarlo en orden
 * inverso en otro
 * vector.
 */
public class InversionDeArreglo {
	int cantidad = 3;

	/**
	 * 
	 */
	public InversionDeArreglo() {
		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese 10 numeros enteros.");

		// Leer numeros
		int[] numeros = leerNumeros(in);

		// Invertir
		int[] arregloInvertido = invertirArreglo(numeros);

		// Mostrar el arreglo
		mostrarArreglo(arregloInvertido);
	}

	/**
	 * Mostrar un arreglo
	 * 
	 * @param arreglo
	 * @return
	 */
	public void mostrarArreglo(int[] arreglo) {
		System.out.print("[");
		for (int i = 0; i < arreglo.length - 1; i++) {
			System.out.print(arreglo[i] + ", ");
		}
		System.out.print(arreglo[arreglo.length - 1] + "]");
	}

	/**
	 * Invertir un arreglo
	 * 
	 * @return
	 */
	int[] invertirArreglo(int[] arreglo) {
		int[] arregloInvertido = new int[arreglo.length];
		// Inidice sumador
		int indice = 0;
		// i es un indice decreciente
		for (int i = arreglo.length - 1; i >= 0; i--) {
			arregloInvertido[i] = arreglo[indice];
			indice++;
		}

		return arregloInvertido;
	}

	/**
	 * Leer numeros
	 */
	int[] leerNumeros(Scanner in) {
		int[] numeros = new int[cantidad];
		int indice = 0;
		while (true) {
			if (indice >= cantidad) {
				break;
			}

			System.out.print("Ingrese un numero: ");
			numeros[indice] = in.nextInt();
			indice++;
		}

		return numeros;
	}
}
