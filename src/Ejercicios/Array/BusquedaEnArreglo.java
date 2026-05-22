package Ejercicios.Array;

import java.util.Scanner;

/**
 * 6. Búsqueda en un Arreglo: Realice un programa que lea desde teclado 10
 * números enteros y
 * los almacene en un vector. Una vez finalizada la carga, pedirle al usuario un
 * número y
 * buscarlo dentro del vector, en caso de que esté mostrar la posición, en caso
 * contrario mostrar
 * por pantalla el mensaje "el número buscado no se encuentra en el vector".
 */
public class BusquedaEnArreglo {
	int cantidad = 3;

	/**
	 * 
	 * @return
	 */
	public BusquedaEnArreglo() {
		Scanner in = new Scanner(System.in);

		// Leer numeros
		System.out.println("Ingrese " + cantidad + " de numeros: ");
		int[] numeros = leerNumeros(in);

		System.out.print("Ingrese un numero para buscar en el arreglo: ");
		int buscar = in.nextInt();

		// Buscar el numero
		buscarNumero(numeros, buscar);
	}

	/**
	 * Buscar un numero
	 * 
	 * @return
	 */
	public void buscarNumero(int[] numeros, int num) {
		int indice = buscarIndice(numeros, num);

		if (indice == -1) {
			// Numero no encontrado
			System.out.println("El número buscado no se encuentra en el vector.");
		} else {
			// numero encontrado
			System.out.println("Numero encontrado en el indice: " + indice);
		}
	}

	/**
	 * Buscar el indice de un numero
	 * 
	 * @return -1 si no se encontro
	 */
	public int buscarIndice(int[] numeros, int num) {
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num) {
				return i;
			}
		}

		return -1;
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
