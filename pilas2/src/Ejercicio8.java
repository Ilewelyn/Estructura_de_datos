/*
* Ejercicio 8: Este codigo se trata de revisar una lista de numeros y decidir si guarda un valor o si borra varios 
* elementos segun la cantidad que ya lleva acumulada, si hay menos elementos que el numero actual lo agrega y si ya hay 
* suficientes quita tantos elementos como indique ese numero sacandolos de golpe, al final imprime cuantos elementos 
* quedaron y los muestra en orden
* @author Camacho Gómez Jenny Alexandra
* 02/11/26
*/

public class Ejercicio8 {
    public static void main(String[] args) {
        // define la lista de numeros que va a procesar el programa
        int[] datos = {2, 7, 1, 8, 2, 8, 2};
        
        // crea una pila usando arreglos para guardar numeros enteros
        PilaArreglo<Integer> pila = new PilaArreglo<>();
        
        // inicia un contador para llevar la cuenta de cuantos elementos hay en la pila
        int tamano = 0;

        // recorre uno por uno los numeros de la lista original
        for (int a : datos) {
            
            // evalua si la cantidad actual de elementos es menor que el numero que se esta leyendo
            if (tamano < a) {
                // guarda el numero actual dentro de la pila
                pila.push(a);
                
                // aumenta en uno el contador de elementos
                tamano++;
            } else {
                
                // si la pila ya tiene suficientes elementos repite un ciclo tantas veces como indique el numero
                for (int k = 0; k < a; k++) {
                    
                    // saca el elemento que esta hasta arriba de la pila
                    pila.pop();
                    
                    // disminuye en uno el contador de elementos
                    tamano--;
                }
            }
        }

        // imprime en la consola cuantos elementos sobrevivieron al final
        System.out.println(tamano);
        
        // crea un arreglo nuevo para guardar los elementos que quedaron guardados
        int[] orden = new int[tamano];
        
        // saca los elementos de la pila uno por uno para ponerlos en el arreglo
        for (int i = 0; i < tamano; i++) {
            orden[i] = pila.peek();
		pila.pop();
        }
        
        // recorre el arreglo para imprimir los numeros restantes separados por espacios
        for (int i = 0; i < orden.length; i++) {
            System.out.print(orden[i] + (i < orden.length - 1 ? " " : ""));
        }
        
        // da un salto de linea al terminar de imprimir todo
        System.out.println();
    }
}