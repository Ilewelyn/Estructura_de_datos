package src;

/**
 * Interface Pila Genérica
 * @author Camacho Gómez Jenny Alexandra
 */
public interface IPila<T> {
    public void pop();
    public void push(T dato);
    public T peek();
    public boolean isEmpty();
}