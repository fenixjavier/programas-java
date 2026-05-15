package Retos;

import java.util.Scanner;

public class ExtraerNumeros {
    public ExtraerNumeros() {
        System.out.println("Ingrese un numero con muchos digitos.");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        // Contar la cantidad de digitos
        int digitos = cantidadDeDigitos(numero);
        System.out.println("La cantidad de digitos es: " + digitos);

        numeroAArreglo(numero);

        scanner.close();
    }

    // Contar la cantidad de digitos
    //
    int cantidadDeDigitos(int num) {
        int digitos = 0;
        int numCopy = num;
        while(true) {
            int digito = numCopy % 10;
            
            if(digito > 0) {
                digitos++;
            } else {
                break;
            }

            // Reducir la cantidad de digitos
            numCopy /= 10;
        }

        return digitos;
    }

    // Extraer digitos como arreglo
    // 
    int[] numeroAArreglo(int num) {
        // Crear un arreglo con la cantidad de digitos
        int[] digitos = new int[cantidadDeDigitos(num)];

        // Extraer los digitos e insertarlos en el arreglo
        int numCopy = num;
        for(int i = 0; i < digitos.length - 1; i++) {
            // Insertar el digito en la posicion
            digitos[i] = numCopy % 10;
            
            // Removerlo del numero
            numCopy /= 10;
        }

        return digitos;
    }
}
