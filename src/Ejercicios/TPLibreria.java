package Ejercicios;

import java.util.Scanner;

class Libro {
	int codigo;
	String titulo;
	String autor;
	String genero;
	int precio;
	int stock;
}

/**
 * # TRABAJO GRUPAL
 * 
 * Universidad Nacional de San Antonio de Areco
 * Algoritmos y Programación II - 2026
 * 
 * ## Indicaciones generales
 * 
 * El objetivo de la actividad es simular el trabajo de un equipo de desarrollo.
 * Para ello, deberán organizarse,
 * dividir el problema en módulos y posteriormente integrar el trabajo realizado
 * por todos los integrantes.
 * Organización del equipo
 * 
 * Cada equipo deberá:
 *  Analizar el problema antes de comenzar a programar.
 *  Identificar los datos necesarios y definir el registro que utilizarán.
 *  Definir el arreglo que almacenará los registros.
 *  Dividir el problema en módulos.
 *  Distribuir los módulos entre los integrantes.
 *  Acordar previamente:
 * o nombres de variables;
 * o parámetros de cada módulo;
 * o tipos de datos;
 * o valores que devuelve cada función;
 * o información que modifica cada procedimiento.
 *  Integrar todos los módulos en un único programa.
 *  Probar el programa completo antes de realizar la entrega.
 *  Cada integrante deberá participar en el desarrollo de al menos dos módulos.
 * El trabajo deberá utilizar los contenidos vistos durante la cursada, haciendo
 * especial énfasis en arreglos,
 * registros, modularización y algoritmos de búsqueda.
 * Entrega
 * Todos los integrantes del equipo deberán entregar en la plataforma:
 *  El programa completo en Java.
 *  El programa completo en pseudocódigo.
 *  Una breve identificación de los integrantes y los módulos realizados por
 * cada uno.
 * 
 * ## Gestión de una librería
 * 
 * Una librería desea desarrollar un sistema que permita administrar la
 * información de los libros disponibles para
 * la venta.
 * El sistema deberá trabajar con un máximo de 100 libros. Para cada libro se
 * deberá almacenar:
 *  Código
 *  Título
 *  Autor
 *  Género
 *  Precio
 *  Cantidad disponible en stock
 * 
 * El programa deberá contar con un menú de opciones que permita al usuario
 * seleccionar la operación que
 * desea realizar.
 * El menú deberá continuar funcionando hasta que se seleccione
 * la opción de salida.
 * 
 * ## Opciones del menú
 * 
 * 1. Cargar libros: Permitir la carga de libros hasta que se ingrese un código
 * igual a 0 o se alcance la capacidad
 * máxima del arreglo.
 * El código 0 se utilizará únicamente como condición de finalización y no
 * deberá almacenarse ni procesarse.
 * 2. Mostrar libros: Mostrar la información de los libros que fueron cargados.
 * 3. Buscar libro: Solicitar un código y buscar el libro correspondiente
 * mediante una búsqueda secuencial.
 * Si el libro existe, informar su título, autor, precio y stock. Si no existe,
 * informar que no se encuentra
 * registrado.
 * 4. Consultar mayor stock: Determinar cuál es el libro que posee la mayor
 * cantidad de ejemplares disponibles
 * e informar su posición, título y cantidad de ejemplares.
 * 5. Analizar códigos: Determinar cuántos libros poseen código par y cuántos
 * poseen código impar.
 * 6. Consultar por género: Solicitar un género y determinar cuántos libros
 * pertenecen a él y cuál es el precio
 * promedio de esos libros. Si no existen libros de ese género, informar dicha
 * situación.
 * 7. Consultar libros con stock bajo: Mostrar los libros que tengan menos de 5
 * unidades disponibles en stock.
 * 8. Salir: Finalizar el programa.
 */
public class TPLibreria {
	/**
	 * Inicio
	 * 
	 * @author 
	 */
	public TPLibreria() {
		Libro[] libros = new Libro[100];
		int cantidad = 0;

		Scanner in = new Scanner(System.in);

		int entrada = 0;
		do {
			menu();

			// Pedir entrada al usuario
			System.out.print("Seleccionar opcion: ");
			entrada = in.nextInt();

			switch (entrada) {
				case 1:
					cargarLibros(libros);
					cantidad = buscarTamaño(libros);
					break;
				case 2:
					mostrarLibros(libros, cantidad);
					break;
				case 3:
					buscarLibro(libros, cantidad);
					break;
				case 4:
					consultarMayorStock(libros, cantidad);
					break;
				case 5:
					analizarCodigos(libros, cantidad);
					break;
				case 6:
					consultarPorGenero(libros, cantidad);
					break;
				case 7:
					consultarLibrosConStockBajo(libros, cantidad);
					break;
				case 8:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Ingrese una opción disponible");
					break;
			}

		} while (entrada != 8);

		in.close();
	}

	/**
	 * Menu
	 * 
	 * @author 
	 */
	public static void menu() {
		System.out.println("---------------------------------------");
		System.out.println("------Programa gestión libreria--------");
		System.out.println("----------Opciones del menú------------");
		System.out.println("1 para cargar libros | LIMITE=100 libros | INGRESE 0 PARA TERMINAR DE CARGAR");
		System.out.println("");
		System.out.println("2 para mostrar los libros cargados");
		System.out.println("");
		System.out.println("3 para buscar un libro por código");
		System.out.println("");
		System.out.println("4 para consultar el libro con mayor stock");
		System.out.println("");
		System.out.println("5 para ver cuantos libros tienen codigo par e impar");
		System.out.println("");
		System.out.println("6 para consultar por genero");
		System.out.println("");
		System.out.println("7 para los libros que tengan ");
		System.out.println("");
		System.out.println("8 para salir del programa");
	}

	/**
	 * Cargar libros
	 * 
	 * @author 
	 */
	public static void cargarLibros(Libro[] libros) {
		int salir = 99;
		int capacidadMaxima = 0;
		Scanner in = new Scanner(System.in);

		do {
			for (int i = 0; i < libros.length; i++) {

				Libro nuevoLibro = new Libro();
				if (capacidadMaxima >= 100 || nuevoLibro.codigo == 0) {
					salir = 0;
				}
				System.out.println("Ingrese el codigo del libro");
				nuevoLibro.codigo = in.nextInt();
				System.out.println("Ingrese el título del libro");
				nuevoLibro.titulo = in.next();
				System.out.println("Ingrese el autor del libro");
				nuevoLibro.autor = in.next();
				System.out.println("ingrese el género del libro");
				nuevoLibro.genero = in.next();
				System.out.println("Ingrese el precio del libro");
				nuevoLibro.precio = in.nextInt();
				System.out.println("Ingrese el stock del libro");
				nuevoLibro.stock = in.nextInt();
				capacidadMaxima++;

			}
		} while (salir != 0);

		in.close();
	}

	/**
	 * Buscar libro
	 * 
	 * Solicitar un código y buscar el libro correspondiente
	 * mediante una búsqueda secuencial.
	 * Si el libro existe, informar su título, autor, precio y stock.
	 * Si no existe, informar que no se encuentra registrado.
	 * 
	 * @author 
	 */
	public static void buscarLibro(Libro[] libros, int cantidad) {
		Scanner in = new Scanner(System.in);

		System.out.println("ingrese el código de libro buscado");
		int codigo = in.nextInt();

		for (int i = 0; i < cantidad; i++) {
			Libro libro = libros[i];

			if (libro.codigo == codigo) {
				// Reutilizamos el procedimiento mostrar libro
				mostrarLibro(libro);
			} else {
				System.out.println("Este libro no existe");
			}
		}

		in.close();
	}

	/**
	 * Tamaño del arreglo
	 * 
	 * @author
	 */
	public static int buscarTamaño(Libro[] libros) {
		int i = 0;
		while (libros[i].titulo != null) {
			i++;
		}

		return i;
	}

	/**
	 * Mostrar todos los libros
	 * 
	 * @author Federico Dueñas
	 */
	static void mostrarLibros(Libro[] libros, int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			Libro libro = libros[i];
			mostrarLibro(libro);
		}
	}

	/**
	 * Mostrar un solo libro
	 * 
	 * @author Federico Dueñas
	 */
	public static void mostrarLibro(Libro libro) {
		System.out.println("Codigo: " + libro.codigo);
		System.out.println("Titulo: " + libro.titulo);
		System.out.println("Autor: " + libro.autor);
		System.out.println("Genero: " + libro.genero);
		System.out.println("Precio: " + libro.precio);
		System.out.println("Stock: " + libro.stock);
	}

	/**
	 * Consultar el libro con mayor stock
	 * 
	 * @author 
	 */
	public static void consultarMayorStock(Libro[] libros, int cantidad) {
		int maxStock = libros[0].stock;
		int posicion = 0;

		for (int i = 0; i < cantidad; i++) {
			if (libros[i].stock > maxStock) {
				maxStock = libros[i].stock;
				posicion = i;
			}
		}

		System.out.println("Posición en areglo: " + posicion);
		System.out.println("Titulo: " + libros[posicion].titulo);
		System.out.println("Ejemplares: " + maxStock);
	}

	/**
	 * Cuantos codigos son pares o impares
	 * 
	 * @author Federico Dueñas
	 */
	public static void analizarCodigos(Libro[] libros, int cantidad) {
		int cantidadPar = 0;
		int cantidadImpar = 0;

		for (int i = 0; i < cantidad; i++) {
			Libro libro = libros[i];
			if (libro.codigo % 2 == 0) {
				// Es par
				cantidadPar++;
			} else {
				cantidadImpar++;
			}
		}

		int[] resultado = new int[2];
		resultado[0] = cantidadPar;
		resultado[1] = cantidadImpar;
		System.out.println("Cantidad de pares: " + cantidadPar);
		System.out.println("Cantidad impares: " + cantidadImpar);
	}

	/**
	 * Mostrar libros que tienen un stock inferior a 5
	 * 
	 * @author Federico Dueñas
	 */
	public static void consultarLibrosConStockBajo(Libro[] libros, int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			Libro libro = libros[i];
			if (libro.stock < 5) {
				mostrarLibro(libro);
			}
		}
	}

	/**
	 * Consultar por genero
	 * 
	 * Solicitar un género y determinar cuántos libros
	 * pertenecen a él y cuál es el precio promedio de esos libros.
	 * Si no existen libros de ese género, informar dicha
	 * situación.
	 * 
	 * @author
	 */
	public static void consultarPorGenero(Libro[] libros, int cantidad) {
		int cantidadGenero = 0;
		int sumaPrecio = 0;
		double promedio = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el genero a buscar");
		String generoBuscado = in.next();
		in.close();

		for (int i = 0; i < cantidad; i++) {
			if (libros[i].genero.equals(generoBuscado)) {
				cantidadGenero++;
				sumaPrecio = sumaPrecio + libros[i].precio;
			}
		}

		if (cantidadGenero > 0) {
			System.out.println("El genero " + generoBuscado + " posee " + cantidadGenero + " de libros.");
			promedio = sumaPrecio / cantidadGenero;
			System.out.println("El promedio de precios del genero " + generoBuscado + " es: " + promedio);
		} else {
			System.out.println("No hay libros con ese genero");
		}
	}
}
