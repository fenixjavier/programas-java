package Ejercicios.Array;

import java.util.Scanner;

/**
 * 7. Eliminar Duplicados en un Arreglo: Realice un programa que lea desde teclado 10 números
 * enteros y los almacene en un vector. Una vez finalizada la carga, buscar si hay números
 * duplicados y en caso que los haya, reemplazar el duplicado por el número 0. Mostrar todos
 * los números del arreglo final.
 */
public class EliminarDuplicados {
	int cantidad = 10;
	
	/**
	 * 
	 */
	public EliminarDuplicados() {
		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese 10 numeros: ");
		int[] numeros = leerNumeros(in);


	}

	/**
	 * Reemplazar duplicados
	 * 
	 * @return
	 */
	int[] reemplazarDuplicados() {
		
	}

	/**
	 * Leer numeros
	 */
	int[] leerNumeros(Scanner in) {
		int[] numeros = new int[cantidad];
		int indice = 0;
		while(true) {
			if(indice >= cantidad) break;

			System.out.print("Ingrese un numero: ");
			numeros[indice] = in.nextInt();
			indice++;
		}
		return numeros;
	}
}
