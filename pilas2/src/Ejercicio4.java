/*
* Ejercicio 4: lo que hace este codigo es calcular cuantos cambios se necesitan para corregir los simbolos en un texto
* primero guarda todos los simbolos que abren y cuando encuentra uno que cierra revisa si coincide con el ultimo que abrio * si no coincide cuenta un cambio si encuentra un cierre solo si al final quedan simbolos abiertos sin pareja marca * que * es imposible arreglarlo
* @author Camacho Gómez Jenny Alexandra
* 02/11/26
*/
public class Ejercicio4 {
    public static void main(String[] args) {

	// "[]()" (o "[]()" + "{<>}" debe ser cero y claro entonces "{{" debe dar imposible
        // String cadena = "[)";  
	// String cadena = "{{";
	String cadena = "{<>}";

        PilaArreglo<Character> pila = new PilaArreglo<>();
        int cambios = 0;
        boolean imposible = false;

        for (char c : cadena.toCharArray()) {
            // guarda los simbolos que abren
            if (c == '(' || c == '[' || c == '{' || c == '<') {
                pila.push(c);
            } else {
                // si hay un cierre sin apertura no se puede arreglar
                if (pila.isEmpty()) {
                    imposible = true;
                    break;
                }
                char abre = pila.peek();
		pila.pop();
                // si el cierre no coincide con la apertura cuenta un cambio
                if (cierreDe(abre) != c) {
                    cambios++;
                }
            }
        }

        // si al final sobraron simbolos abiertos no se puede arreglar
        if (!pila.isEmpty()) {
            imposible = true;
        }

        if (imposible) {
            System.out.println("imposible");
        } else {
            System.out.println(cambios);
        }
    }

    // busca el cierre que le corresponde a cada apertura
    static char cierreDe(char abre) {
        switch (abre) {
            case '(': return ')';
            case '[': return ']';
            case '{': return '}';
            default: return '>';
        }
    }
}