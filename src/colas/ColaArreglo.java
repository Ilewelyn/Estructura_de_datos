/*
* Autor: Jenny Alexandra Camacho Gómez
* Grupo: GTID-244
* Fecha: 30/10/2026
*/
package colas;

public class ColaArreglo {
    // el bloque de celdas en memoria para guardar los numeros
    private int[] datos; 
    // variables para controlar cual es la posicion del primero y del ultimo
    private int frente; 
    private int fin;
    // contadores para ver el espacio total usado y el tamaño maximo permitido
    private int tamanio; 
    private int capacidad;

    // constructor para armar el arreglo con el espacio fijo que le digamos
    public ColaArreglo(int capacidad) { 
        this.capacidad = capacidad; 
        this.datos = new int[capacidad]; 
        this.frente = 0;
        this.fin = -1;
        this.tamanio = 0;
    }

    // funcion para revisar si no hay ningun numero metido en la lista
    public boolean estaVacia() {
        return tamanio == 0;
    }

    // funcion para avisar si ya nos quedamos sin espacio libre en el arreglo
    public boolean estaLlena() {
        return tamanio == capacidad;
    }

    // nos regresa la cantidad exacta de espacios que estan ocupados ahorita
    public int tamanio() { 
        return tamanio;
    }

    // metodo para meter un nuevo numero al final usando la logica de circulo
    public void encolar(int valor) { 
        // si ya se lleno el arreglo no te deja meter nada y da error
        if (estaLlena()) {
            throw new IllegalStateException("La cola está llena");
        }
        // la formula magica para que al llegar al final vuelva a empezar desde cero
        fin = (fin + 1) % capacidad; 
        datos[fin] = valor;          
        tamanio++;
    }

    // metodo para sacar y borrar al primer numero de la fila
    public int desencolar() { 
        // si no hay nada guardado da error porque no hay que sacar
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = datos[frente];
        // movemos el puntero del frente en circulo para la siguiente sacada
        frente = (frente + 1) % capacidad; 
        tamanio--;
        return valor;
    }

    // sirve para espiar cual es el numero que va a salir primero sin quitarlo
    public int frente() { 
        // si no hay numeros guardados arroja un aviso de error
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return datos[frente];
    }
}
