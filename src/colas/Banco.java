/*
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 30/10/2026
*/
package colas;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Banco {
    public static void main(String[] args) {
        ColaEnlazada<String> fila = new ColaEnlazada<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n1. Llega un cliente");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Ver quién sigue");
            System.out.println("4. Ver cantidad en espera");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            
            try {
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer
            } catch (InputMismatchException e) {
                System.out.println("¡Error! Debe ingresar un número entre 1 y 5.");
                sc.nextLine(); // Limpiar el texto incorrecto del buffer (como "Maria")
                opcion = 0;    // Forzar el reinicio del ciclo
                continue;      // Saltar directamente al inicio del do-while
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = sc.nextLine();
                    fila.encolar(nombre);
                    System.out.println("Cliente " + nombre + " agregado a la fila.");
                    break;
                    
                case 2:
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera");
                    } else {
                        String atendido = fila.desencolar();
                        System.out.println("Atendiendo a: " + atendido);
                    }
                    break;
                    
                case 3:
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera");
                    } else {
                        System.out.println("El siguiente cliente en la fila es: " + fila.frente());
                    }
                    break;
                    
                case 4:
                    System.out.println("Cantidad de clientes en espera: " + fila.tamanio());
                    break;
                    
                case 5:
                    System.out.println("Saliendo de la simulación bancaria...");
                    break;
                    
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);

        sc.close();
    }
}

