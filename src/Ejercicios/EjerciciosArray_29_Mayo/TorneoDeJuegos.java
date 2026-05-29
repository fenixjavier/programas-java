package Ejercicios.EjerciciosArray_29_Mayo;

import java.util.Scanner;

/**
 * 1. Se desea registrar los puntajes obtenidos por los participantes de un
 * torneo de videojuegos. El sistema
 * dispone de memoria para almacenar como máximo 50 puntajes. La carga finaliza
 * cuando el usuario ingresa
 * el valor -1, el cual no debe almacenarse.
 * Se pide:
 * a) Almacenar los puntajes en un arreglo.
 * b) Informar cuántos puntajes fueron cargados.
 * c) Calcular el promedio de los puntajes ingresados.
 * d) Informar el puntaje máximo.
 * e) Informar cuántos puntajes fueron pares.
 */
public class TorneoDeJuegos {
	public int size = 50;

	/**
	 * Constructor
	 */
	public TorneoDeJuegos() {
		System.out.println("Ingrese " + size + " puntajes.");
		System.out.println("Para finalizar, ingrese un -1.");
		Scanner in = new Scanner(System.in);

		// Pedir puntajes al usuario
		int[] puntajes = pedirPuntajes(in);
		System.out.println("Fueron cargados " + puntajes.length + " puntajes.");

		// Promedio de puntajes ingresados
		int promedio = promedioDePuntajes(puntajes);
		System.out.println("Promedio de puntajes: " + promedio);

		// Informar puntaje maximo
		int maxPuntaje = puntajeMaximo(puntajes);
		System.out.println("El puntaje maximo es: " + maxPuntaje);

		// Cuantos puntajes son pares
		int cantidadDePares = puntajesPares(puntajes);
		System.out.println("La cantidad de puntajes pares es: " + cantidadDePares);
	}

	/**
	 * Calcular cuantos puntajes son pares
	 * 
	 * @param puntajes
	 * @return
	 */
	public int puntajesPares(int[] puntajes) {
		int puntajesPares = 0;
		for (int i = 0; i < puntajes.length; i++) {
			int valor = puntajes[i];
			if (valor % 2 == 0) {
				puntajesPares++;
			}
		}
		return puntajesPares;
	}

	/**
	 * Conseguir el puntaje maximo
	 */
	public int puntajeMaximo(int[] puntajes) {
		int puntajeMaximo = puntajes[0];
		for (int i = 0; i < puntajes.length; i++) {
			if (puntajeMaximo < puntajes[i]) {
				puntajeMaximo = puntajes[i];
			}
		}
		return puntajeMaximo;
	}

	/**
	 * Promedio de puntajes
	 */
	public int promedioDePuntajes(int[] puntajes) {
		int sumaTotal = 0;
		for (int i = 0; i < puntajes.length; i++) {
			sumaTotal += puntajes[i];
		}
		return sumaTotal / puntajes.length;
	}

	/**
	 * Pedir puntajes al usuario
	 */
	public int[] pedirPuntajes(Scanner in) {
		int[] puntajes = new int[size];
		int indice = 0;

		while (true) {
			if (indice >= size) {
				System.out.println("Limite de puntaje alcanzado(" + size + ")");
				break;
			}

			// Pedir puntaje
			int puntaje = in.nextInt();

			// Verificar si es -1
			if (puntaje == -1) {
				break;
			}

			// Almacenar puntaje
			puntajes[indice] = puntaje;
			indice++;
		}

		return puntajes;
	}
}
