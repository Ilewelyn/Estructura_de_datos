package src;
 
// lineal: siguiente >
// doble: siguiente y anterior < >
// circular: siguiente, siguiente y adelante 

public class Nodo<T> {
    // Clases siempre con mayúsculas
    private T dato;
    private Nodo<T> next; // Se añade <T> para mantener la consistencia del genérico

    // El constructor debe ir DENTRO de la clase
    public Nodo(T nuevoDato) {
        this.dato = nuevoDato;
        this.next = null; // Es buena práctica inicializarlo en null
    }

    // Métodos (Getters y Setters)
    public Nodo<T> getNodo() {
        return this.next;
    }

    public void setNodo(Nodo<T> nuevo) {
        this.next = nuevo;
    }

    public T getDato() {
        return this.dato;
    }
} 
