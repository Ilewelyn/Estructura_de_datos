/*
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 30/10/2026
*/
package colas;

import java.util.Stack;

public class InvertirCola {
    // metodo que recibe tu cola enlazada y la voltea por completo
    public static void invertir(ColaEnlazada<String> cola) {
        // creamos una pila de java para meter las cosas como si fuera un tubo
        Stack<String> pila = new Stack<>();
        
        // mientras la cola tenga gente los vamos sacando y metiendo a la pila
        while (!cola.estaVacia()) {
            pila.push(cola.desencolar());
        }
        
        // ahora sacamos todo de la pila de reversa y lo regresamos a la cola
        while (!pila.isEmpty()) {
            cola.encolar(pila.pop());
        }
    }
}
