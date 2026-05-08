/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 * 
 * 
 * @author UNSAdA
 */
public class Ejercicio4 {
	public Ejercicio4() {
		// Ejercicio 1
		System.out.println("--- Ejercicio 1 ---");
		saludar();

		// Ejercicio 2
		System.out.println("--- Ejercicio 2 ---");
		ejercicio2();

		// Ejercicio 3
		System.out.println("--- Ejercicio 3 ---");
		ejercicio3();

		// Ejercicio 4
		System.out.println("--- Ejercicio 4 ---");
		ejercicio4();

		// Ejercicio 5
		System.out.println("--- Ejercicio 5 ---");
		ejercicio5();

		// Ejercicio 6
		System.out.println("--- Ejercicio 6 ---");
		ejercicio6();

		// Ejercicio 7
		System.out.println("--- Ejercicio 7 ---");
		ejercicio7();
	}

	public void ejercicio7() {
		menu();
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Salir");

			int option = sc.nextInt();

			// Salir
			if (option == 3) {
				break;
			}

			System.out.println("Ingrese el primer numero: ");
			int num1 = sc.nextInt();
			System.out.println("Ingrese el segundo numero");
			int num2 = sc.nextInt();

			if (option == 1) {
				System.out.println("La suma de ambos numeros es: " + (num1 + num2));
			} else if (option == 2) {
				System.out.println("La resta de ambos numeros es: " + (num1 - num2));
			}
		}

		sc.close();
	}

	public void ejercicio6() {
		System.out.println("El mayor de 4 y 7 es: " + mayor(4, 7));
		System.out.println("El mayor de 20 y 5 es: " + mayor(20, 5));
	}

	public int mayor(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}

		return num2;
	}

	public void ejercicio5() {
		System.out.println("5 es par?: " + esPar(5));
		System.out.println("10 es par?: " + esPar(10));
	}

	public boolean esPar(int num) {
		return num % 2 == 0;
	}

	public void ejercicio4() {
		int num1 = 5;
		int num2 = 10;
		int resultado = sumar(num1, num2);
		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
	}

	public int sumar(int a, int b) {
		return a + b;
	}

	public void ejercicio3() {
		int numero = 5;
		int resultado = doble(numero);
		System.out.println("El doble del numero " + numero + " es: " + resultado);
	}

	public int doble(int numero) {
		return numero * 2;
	}

	public void mostrarNumero(int numero) {
		System.out.println("El numero es: " + numero);
	}

	public void ejercicio2() {
		int numero = 5;
		mostrarNumero(numero);
	}

	public void saludar() {
		System.out.println("Hola alumnos");
	}
}
