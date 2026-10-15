package listas.simples;

/*Autor Camacho Gómez J.A.
*15/10/26
*/

public class Nodo {
    private int valor;
    private Nodo sig;

    // constructor vacío
    public Nodo() {
        this.valor = 0;
        this.sig = null;
    }

    // constructor con parámetros
    public Nodo(int valor) {
        this.valor = valor;
        this.sig = null;
    }

    // getters y setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}