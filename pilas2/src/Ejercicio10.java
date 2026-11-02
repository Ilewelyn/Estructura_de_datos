/*
* Ejercicio 10: Trata de buscar la secuencia de parentesis mas larga que este completamente bien armada 
* dentro de un texto y tambien cuenta cuantas veces se repite esa misma longitud maxima primero guarda una referencia base * en la pila y recorre el texto caracter por caracter si encuentra un parentesis que abre guarda su posicion y si 
* encuentra uno que cierra saca el ultimo elemento si la pila se queda vacia marca la posicion actual como nueva base y si 
* aun hay elementos calcula el tamaño restando la posicion actual menos la que esta arriba en la pila si ese tamaño es 
* mayor que el mejor que tenia guardado lo actualiza y si mide lo mismo aumenta la cuenta de cuantas veces paso al final 
* imprime el tamaño maximo encontrado y cuantas veces aparecio o un cero y uno si no encontro nada
*
* @author Camacho Gómez Jenny Alexandra
* 02/11/26
*/

public class Ejercicio10 {
    public static void main(String[] args) {

	/* busca la subcadena mas larga con parentesis bien cerrados
	* y cuenta cuantas veces aparece esa longitud
	* si no hay ninguna imprime 0 1
	*/

        // String cadena = ")((())))(()())";
	String cadena = ")((";

        PilaArreglo<Integer> pila = new PilaArreglo<>();
        // guarda una base para saber donde empieza un tramo que no sirve
        pila.push(-1);
        int mejor = 0;
        int cuantas = 0;

        // revisa cada letra del texto usando su posicion
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(') {
                // guarda la posicion del parentesis que abre
                pila.push(i);
            } else {
                // saca el ultimo elemento cuando encuentra un cierre
                pila.pop();
                if (pila.isEmpty()) {
                    // si la pila queda vacia el cierre sobra y se vuelve la nueva base
                    pila.push(i);
                } else {
                    // calcula cuanto mide la parte valida restando las posiciones
                    int largo = i - pila.peek();
                    // si es mas larga que la anterior guarda el nuevo record
                    if (largo > mejor) {
                        mejor = largo;
                        cuantas = 1;
                    } else if (largo == mejor) {
                        // si mide lo mismo suma uno a la cuenta
                        cuantas++;
                    }
                }
            }
        }

        // si nunca encontro nada valido imprime cero y uno
        if (mejor == 0) {
            System.out.println("0 1");
        } else {
            // imprime la longitud maxima y cuantas veces se repitio
            System.out.println(mejor + " " + cuantas);
        }
    }
}