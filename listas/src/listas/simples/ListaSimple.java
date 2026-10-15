package listas.simples;

/*Autor Camacho Gómez J.A.
*15/10/26
*/

public class ListaSimple {
    private Nodo cabeza;

    // constructor con la lista que comienza vacio
    public ListaSimple() {
        this.cabeza = null;
    }

    // metodo para ver si la lista esta vacia
    public boolean estaVacia() {
        return cabeza == null;
    }

    // metodo para insertar un elemento al inicio
    public void insertarAlInicio(int valor) {
        Nodo nuevo = new Nodo(valor); 
        
        if (estaVacia()) {
            cabeza = nuevo; 
        } else {
            nuevo.setSig(cabeza); 
            cabeza = nuevo;   
        }
    }

    // metodo para recorrer la lista e imprimir sus elementos
    public void mostrarLista() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        System.out.print("CABEZA -> ");
        while (actual != null) {
            System.out.print("[" + actual.getValor() + "] -> ");
            actual = actual.getSig();
        }
        System.out.println("null");
    }
}