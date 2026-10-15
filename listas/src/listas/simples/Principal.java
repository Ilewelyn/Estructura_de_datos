package listas.simples;

public class Principal {
    public static void main(String[] args) {
        System.out.println(" Prueba de Lista Simple");
        
        ListaSimple miLista = new ListaSimple();

        // primeor que nada verificamos si esta vacia
        System.out.println("¿La lista está vacía? " + miLista.estaVacia());

        // Insertamos elementos al inicio
        miLista.insertarAlInicio(30);
        miLista.insertarAlInicio(20);
        miLista.insertarAlInicio(10);

        // Mostramos la lista enlazada resultante
        System.out.print("Estado actual de la lista: ");
        miLista.mostrarLista();

        // Verificamos de nuevo el estado
        System.out.println("¿La lista está vacía? " + miLista.estaVacia());
    }
}