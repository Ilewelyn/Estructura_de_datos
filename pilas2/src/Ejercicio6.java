/*
* Ejercicio 6:El objetivo de este ejericio es guardar los nombres de la lista uno por uno y luego los muestra al reves  
* empezando por el ultimo que entro
* @author Camacho Gómez Jenny Alexandra
* 02/11/26
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        String[] llegadas = {"PABLO", "VANESSA", "MARIANA", "DANIELA", "IVAN"};
        PilaArreglo<String> pila = new PilaArreglo<>();

        // guarda cada nombre en el orden en que llega
        for (String nombre : llegadas) {
            pila.push(nombre);
        }

        // saca y muestra primero a los que llegaron al final
        while (!pila.isEmpty()) {
            System.out.println(pila.peek());
		pila.pop();
        }
    }
}