package AyP_II.TP_1;

import java.util.Scanner;

class Venta {
	int mes;
	double monto;
}

/**
 * 5. Control de Ventas: Implementar un sistema de control de ventas. Cada venta tiene un número de
 * factura, un mes (1 al 12) y un monto. El programa debe permitir registrar 100 ventas y luego calcular
 * el total de ventas por mes. Validar los meses para que solo se pueda ingresar números del 1 al 12.
 */
public class ControlVentas {
	/**
	 * Control ventas
	 */
	public ControlVentas() {
		Scanner in = new Scanner(System.in);
		int totalVentas = 100;
		Venta[] ventas = new Venta[totalVentas];
		int ventasIngresadas = 0;

		// Como hay que validar los meses es mejor usar un while
		// para seguir preguntando al usuario hasta que ingrese un
		// valor correcto
		while(ventasIngresadas < totalVentas) {
			System.out.println(" --- Nueva venta ---");
			System.out.println("Ingrese el mes: ");
			int mes = in.nextInt();

			// Validar mes
			if(!validarMes(mes)) {
				System.out.println("El numero del mes es invalido");
				continue;
			}

			System.out.println("Ingrese el monto: ");
			double monto = in.nextDouble();

			ventas[ventasIngresadas].mes = mes;
			ventas[ventasIngresadas].monto = monto;

			ventasIngresadas++;
		}

		double sumaTotalVentas = totalDeVentas(ventas);
		System.out.println("Total de ventas: " + sumaTotalVentas);

		in.close();
	}

	/**
	 * Validar mes
	 */
	public boolean validarMes(int mes) {
		return mes >= 1 && mes <= 12;
	}

	/**
	 * Total de ventas
	 */
	public double totalDeVentas(Venta[] ventas) {
		double total = 0;
		for (int i = 0; i < ventas.length; i++) {
			total += ventas[i].monto;
		}
		return total;
	}
}
