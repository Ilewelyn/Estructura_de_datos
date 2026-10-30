
/*
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 30/10/2026
*/
package colas;

import java.util.LinkedList; 
import java.util.Queue;
import java.util.PriorityQueue;

public class Main { 
    public static void main(String[] args) { 
        System.out.println("Entorno listo"); 
        
        /*
        ColaArreglo colaArreglo = new ColaArreglo(3); 
        colaArreglo.encolar(10); 
        colaArreglo.encolar(20); 
        colaArreglo.encolar(30); 
        System.out.println("Sale: " + colaArreglo.desencolar()); // 10 
        colaArreglo.encolar(40); // reutiliza la posición 0 
        System.out.println("Frente: " + colaArreglo.frente()); // 20 
        System.out.println("Tamaño: " + colaArreglo.tamanio()); // 3 
        System.out.println("¿Llena? " + colaArreglo.estaLlena()); // true 
        */
        
        ColaEnlazada<String> nombres = new ColaEnlazada<>();
        nombres.encolar("Ana");
        nombres.encolar("Luis"); 
        nombres.encolar("María");
        System.out.println("Sale: " + nombres.desencolar());   // Ana
        System.out.println("Frente: " + nombres.frente());     // Luis
        System.out.println("Tamaño: " + nombres.tamanio());    // 2 

        Queue<String> cola = new LinkedList<>();

        cola.offer("Ana");
        cola.offer("Luis"); 
        cola.offer("María");
        System.out.println(cola.peek());    // Ana (no la elimina) 
        System.out.println(cola.poll());    // Ana (la elimina) 
        System.out.println(cola.size());    // 2 
        System.out.println(cola);           // [Luis, María]

        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        
        System.out.println(pq.poll()); // 10 (Sale el menor primero)
        System.out.println(pq.poll()); // 20
        System.out.println(pq.poll()); // 30

        ColaEnlazada<String> listaNombres = new ColaEnlazada<>();
        listaNombres.encolar("Hugo");
        listaNombres.encolar("Paco");
        listaNombres.encolar("Luis");
        
        listaNombres.imprimirCola(); // Muestra: Hugo Paco Luis 

        ColaEnlazada<String> letras = new ColaEnlazada<>();
        letras.encolar("A");
        letras.encolar("B");
        letras.encolar("C");
        
        InvertirCola.invertir(letras);
        
        System.out.print("Cola invertida: ");
        letras.imprimirCola(); // Muestra: C B A
    } 
}


