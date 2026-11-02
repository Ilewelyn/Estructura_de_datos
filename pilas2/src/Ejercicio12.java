/*
* Ejercicio 12: Se trata sobre seguir una lista de instrucciones usando una pila de numeros cuando dice agrega
* guarda el numero que viene despues en la pila cuando dice consume saca los ultimos dos numeros que estan arriba los suma y * vuelve a guardar el resultado cuando dice imprime muestra el numero que esta hasta arriba sin sacarlo 
*
* @author Camacho Gómez Jenny Alexandra
* 02/11/26
*/

public class Ejercicio12 {
    public static void main(String[] args) {
        // lista de operaciones que va a realizar el programa
        String[] operaciones = {
            "AGREGA 2", "AGREGA 3", "IMPRIME",
            "AGREGA 4", "IMPRIME", "CONSUME", "IMPRIME"
        };
        PilaArreglo<Integer> pila = new PilaArreglo<>();

        // recorre cada operacion de la lista
        for (String op : operaciones) {
            // separa la orden y el numero por el espacio
            String[] partes = op.split(" ");
            
            // si la orden es agrega guarda el numero en la pila
            if (partes[0].equals("AGREGA")) {
                pila.push(Integer.parseInt(partes[1]));
            } else if (partes[0].equals("CONSUME")) {
                // si la orden es consume saca los dos ultimos numeros
                // los suma y guarda el resultado
                int a = pila.peek();
                pila.pop();
                int b = pila.peek();
                pila.pop();
                pila.push(a + b);
            } else if (partes[0].equals("IMPRIME")) {
		System.out.println(pila.peek());
            }
        }
    }
}