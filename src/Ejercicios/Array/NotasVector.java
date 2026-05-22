package Ejercicios.Array;

import java.util.Scanner;

/**
 * 1. Promedio de notas
 * Realice un programa que lea desde el teclado 20 notas reales positivas y los
 * almacene en un vector.
 * Una vez finalizada la carga, se pide calcular el promedio de notas.
 */
public class NotasVector {
	int size = 20;

	// Proceso principal
	// 
	public NotasVector() {
		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese 20 notas: ");
		double[] notas = leerNotas(in);

		double promedio = promedioDeNotas(notas);
		System.out.println("El promedio de notas es: " + promedio);
	}

	// Calcular el promedio de notas
	double promedioDeNotas(double[] notas) {
		// Sumar todo
		double total = 0;

		for(int i = 0; i < notas.length; i++) {
			total += notas[i];
		}

		// Dividir por el total
		return total / notas.length;
	}

	// Lee las 20 notas y las devuelve
	double[] leerNotas(Scanner in) {
		double[] notas = new double[size];
		int notaActual = 0;

		while (true) {
			if (notaActual >= notas.length) {
				break;
			}

			// Leer nota
			System.out.print("Ingrese la nota Numero " + (notaActual + 1) + ": ");
			double nota = in.nextDouble();

			// Se podria validar que las notas sean menores a 10 pero no lo pide el ejercicio

			// Validar que sean positivos
			if (nota < 0) {
				System.out.println("No se pueden ingresar notas menores a 0.");
				continue;
			}

			notas[notaActual] = nota;
			notaActual++;
		}

		return notas;
	}
}
