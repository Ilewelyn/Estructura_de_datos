package src;

import java.util.EmptyStackException;

public class PilaArreglo<T> implements IPila<T> {
    private T[] datos;
    private int tope;

    @SuppressWarnings("unchecked")
    public PilaArreglo() {
        datos = (T[]) new Object[5];
        tope = 0;
    }

    @SuppressWarnings("unchecked")
    private void redimensionar() {
        T[] nuevo = (T[]) new Object[datos.length * 2];
        for (int i = 0; i < tope; i++) {
            nuevo[i] = datos[i];
        }
        datos = nuevo;
    }

    @Override
    public void pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        tope--;
        datos[tope] = null;
    }

    @Override
    public void push(T dato) {
        if (tope == datos.length) {
            redimensionar();
        }
        datos[tope] = dato;
        tope++;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return datos[tope - 1];
    }

    @Override
    public boolean isEmpty() {
        return tope == 0;
    }

    public static void main(String[] args) {
        IPila<Integer> pila = new PilaArreglo<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.peek());
        pila.pop();
        System.out.println(pila.peek());
        pila.pop();
        pila.pop();
        System.out.println(pila.isEmpty());

       /* IPila<Integer> pila2 = new PilaArreglo<>();
        for (int i = 1; i <= 100; i++) {
            pila2.push(i);
        }
        while (!pila2.isEmpty()) {
            System.out.print(pila2.peek() + " ");
            pila2.pop();
        }*/

        System.out.println(invertirPalabra("Gavilan"));
        System.out.println(invertirPalabra("Paloma"));
        System.out.println(invertirPalabra("José"));
    }
	public static String invertirPalabra(String palabra) {
    IPila<Character> pila = new PilaArreglo<>();
    for (int i = 0; i < palabra.length(); i++) {
        pila.push(palabra.charAt(i));
    }
    StringBuilder resultado = new StringBuilder();
    while (!pila.isEmpty()) {
        resultado.append(pila.peek());
        pila.pop();
    }
    return resultado.toString();
}

}