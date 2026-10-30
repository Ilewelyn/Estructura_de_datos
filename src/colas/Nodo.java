/*
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 30/10/2026
*/
package colas;

public class Nodo<T> {
    // la cajita donde guardamos el valor o el nombre de la persona
    T dato;
    // la flecha o el enlace que apunta a la persona que viene atras
    Nodo<T> siguiente;

    // constructor para armar el nodo con su informacion desde el principio
    public Nodo(T dato) {
        this.dato = dato;
        // al principio no sabemos quien sigue atras asi que lo dejamos vacio
        this.siguiente = null;
    }
}
