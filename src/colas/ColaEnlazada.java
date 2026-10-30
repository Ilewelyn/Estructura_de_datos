/*
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 30/10/2026
*/
package colas;

public class ColaEnlazada<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tamanio;

    public ColaEnlazada() {
        this.frente = null;
        this.fin = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() { 
        return frente == null;
    }

    public int tamanio() {
        return tamanio;
    }

    public void encolar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor); 
        if (estaVacia()) {
            frente = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo; 
        tamanio++;
    }

    public T desencolar() { 
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T valor = frente.dato; 
        frente = frente.siguiente; 
        
        if (frente == null) {
            fin = null; 
        }
        tamanio--; 
        return valor;
    }

    public T frente() { 
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }

    // este es el metodo que te faltaba guardar bien en el archivo
    public void imprimirCola() {
        if (estaVacia()) {
            System.out.println("La cola esta vacia");
            return;
        }
        
        Nodo<T> actual = frente;
        System.out.print("Elementos en la cola: ");
        
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
