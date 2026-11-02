/*
* Ejercicio 2: primero verifica que cada parentesis que abre tenga su pareja que cierra en el orden correcto
* segundo revisa que solamente use las letras a b c o d junto con los parentesis sin permitir ningun otro caracter
* al final si todo esta bien muestra un uno y si encuentra cualquier fallo muestra un cero
* @author Camacho Gómez Jenny Alexandra
* 02/11/26
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena = "bbba(ac)((a)b)b";
        PilaArreglo<Character> pila = new PilaArreglo<>();
        boolean valida = true;

        // revisa letra por letra de la cadena
        for (char c : cadena.toCharArray()) {
            if (c == '(') {
                // guarda el parentesis que abre
                pila.push(c);
            } else if (c == ')') {
                // si intenta cerrar un parentesis que nunca abrio marca error
                if (pila.isEmpty()) {
                    valida = false;
                    break;
                }
                pila.pop();
            } else if ("abcd".indexOf(c) == -1) {
                // si encuentra una letra que no sea a b c o d marca error
                valida = false;
                break;
            }
        }

        // si despues de revisar todo quedan parentesis sin cerrar marca error
        if (!pila.isEmpty()) {
            valida = false;
        }

        System.out.println(valida ? 1 : 0);
    }
}