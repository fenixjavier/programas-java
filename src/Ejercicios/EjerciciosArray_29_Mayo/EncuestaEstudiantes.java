package Ejercicios.EjerciciosArray_29_Mayo;

import java.util.Scanner;

/**
 * 2. Una universidad realizó una encuesta a 30 estudiantes. Por cada estudiante
 * se registra:
 * - nombre.
 * - edad.
 * - cantidad de materias aprobadas.
 * Se pide:
 * a) Guardar las edades en un arreglo.
 * b) Calcular la edad promedio.
 * c) Informar la mayor edad registrada.
 * d) Indicar cuántos estudiantes tienen edad impar.
 * e) Mostrar la posición del estudiante con más materias aprobadas.
 */
public class EncuestaEstudiantes {
	int size = 30;

	/**
	 * 
	 */
	public EncuestaEstudiantes() {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la informacion de cada estudiante: ");

		// No se puede poner en una funcion por que no puedo devolver los 3 arreglos
		String[] nombres = new String[size];
		int[] edades = new int[size];
		int[] materiasAprobadas = new int[size];
		int indice = 0;

		while (true) {
			if (indice >= size) {
				break;
			}

			// Pedir datos
			System.out.print("Ingrese el nombre del alumno: ");
			String nombre = in.next();
			System.out.println("Nombre: " + nombre);
			System.out.print("Ingrese la edad del alumno: ");
			int edad = in.nextInt();
			System.out.print("Ingrese las materias aprobadas del alumno: ");
			int aprobadas = in.nextInt();

			nombres[indice] = nombre;
			edades[indice] = edad;
			materiasAprobadas[indice] = aprobadas;
			indice++;
		}

		// Calcular edad promedio
		int promedioDeEdades = edadPromedio(edades);
		System.out.println("Edad promedio: " + promedioDeEdades);

		// Mayor edad registrada
		int mayorEdadRegistrada = mayorEdad(edades);
		System.out.println("Mayor edad registrada: " + mayorEdadRegistrada);

		// Cantidad de estudiantes con edad impar
		int cantidadEdadImpar = cantidadEstudiantesConEdadImpar(edades);
		System.out.println("Cantidad de estudiantes con edad impar: " + cantidadEdadImpar);

		// Posicion del estudiante
		int estudiantePosicion = posicionEstudiantePorMateriasAprobadas(materiasAprobadas);
		System.out.println("Posicion del estudiante con mas materias aprobadas: " + estudiantePosicion);

		in.close();
	}

	/**
	 * Edad promedio
	 */
	public int edadPromedio(int[] edades) {
		int sumaDeEdades = 0;
		for (int i = 0; i < edades.length; i++) {
			sumaDeEdades += edades[i];
		}

		return sumaDeEdades / edades.length;
	}

	/**
	 * Conseguir la mayor edad registrada
	 * 
	 * @param edades
	 * @return
	 */
	public int mayorEdad(int[] edades) {
		int mayorEdadRegistrada = 0;
		for (int i = 0; i < edades.length; i++) {
			if (mayorEdadRegistrada < edades[i]) {
				mayorEdadRegistrada = edades[i];
			}
		}
		return mayorEdadRegistrada;
	}

	/**
	 * Cantidad de estudiantes con edad impar
	 * 
	 * @param edades
	 * @return
	 */
	public int cantidadEstudiantesConEdadImpar(int[] edades) {
		int cantidad = 0;
		for (int i = 0; i < edades.length; i++) {
			if (edades[i] % 2 != 0) {
				cantidad++;
			}
		}
		return cantidad;
	}

	/**
	 * Posicion del estudiante con mas materias aprobadas
	 * 
	 * @param materiasAprobadasArreglo
	 * @return
	 */
	public int posicionEstudiantePorMateriasAprobadas(int[] materiasAprobadasArreglo) {
		int indice = 0;
		int maximo = materiasAprobadasArreglo[0];
		for (int i = 0; i < materiasAprobadasArreglo.length; i++) {
			if (materiasAprobadasArreglo[i] > maximo) {
				maximo = materiasAprobadasArreglo[i];
				indice = i;
			}
		}
		return indice;
	}
}
