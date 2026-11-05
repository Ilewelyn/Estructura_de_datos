public class Ordenamiento_Burbuja {

    // Contadores globales para comparaciones, intercambios y pasadas
    static int comparaciones = 0;
    static int intercambios = 0;
    static int pasadas = 0;

    // Ordena el arreglo con el método burbuja y muestra el arreglo después de cada pasada
    public static void bubbleSort(int[] arreglo) {

        int n = arreglo.length;
        comparaciones = 0;
        intercambios = 0;
        pasadas = 0;

        // el primer ciclo repite el proceso las veces necesarias para asegurar que todo quede ordenado
        for (int a = 0; a <= n - 2; a++) {

            pasadas++;

            // el segundo ciclo va recorriendo la lista numero por numero para comparar vecinos
            for (int b = 0; b <= n - a - 2; b++) {

                comparaciones++;

                // si el numero de la izquierda es más grande que el de la derecha..
                if (arreglo[b] > arreglo[b + 1]) {

                    // intercambiamos de lugar los dos números usando una casilla temporal
                    int c = arreglo[b];              // se guarda temporalmente el numero grande
                    arreglo[b] = arreglo[b + 1];     // se mueve el numero pequeño a la izquierda
                    arreglo[b + 1] = c;              // se coloca el numero grande a la derecha
                    intercambios++;
                }
            }

            // mostramos el arreglo después de cada pasada
            System.out.print("Pasada " + pasadas + ": ");
            imprimirArreglo(arreglo);
        }
    }

    // Imprime los elementos del arreglo separados por espacios
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    // Muestra el resumen de contadores
    public static void imprimirResumen() {
        System.out.println("Total de pasadas: " + pasadas);
        System.out.println("Total de comparaciones: " + comparaciones);
        System.out.println("Total de intercambios: " + intercambios);
    }

    // Ordena un arreglo de String alfabéticamente con compareTo
    public static void bubbleSortString(String[] arreglo) {

        int n = arreglo.length;

        for (int a = 0; a <= n - 2; a++) {
            for (int b = 0; b <= n - a - 2; b++) {
                if (arreglo[b].compareTo(arreglo[b + 1]) > 0) {
                    String c = arreglo[b];
                    arreglo[b] = arreglo[b + 1];
                    arreglo[b + 1] = c;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Prueba 1: arreglo desordenado del pseudocódigo
        System.out.println("=== Prueba 1: arreglo desordenado ===");
        int[] arreglo1 = {34, 12, 25, 8, 19};
        System.out.print("Original: ");
        imprimirArreglo(arreglo1);
        bubbleSort(arreglo1);
        System.out.print("Final: ");
        imprimirArreglo(arreglo1);
        imprimirResumen();

        // Prueba 2: arreglo ya ordenado (no debería haber intercambios)
        System.out.println("\n=== Prueba 2: arreglo ya ordenado ===");
        int[] arreglo2 = {8, 12, 19, 25, 34};
        System.out.print("Original: ");
        imprimirArreglo(arreglo2);
        bubbleSort(arreglo2);
        System.out.print("Final: ");
        imprimirArreglo(arreglo2);
        imprimirResumen();

        // Prueba 3: arreglo en orden inverso (el peor caso)
        System.out.println("\n=== Prueba 3: arreglo en orden inverso ===");
        int[] arreglo3 = {34, 25, 19, 12, 8};
        System.out.print("Original: ");
        imprimirArreglo(arreglo3);
        bubbleSort(arreglo3);
        System.out.print("Final: ");
        imprimirArreglo(arreglo3);
        imprimirResumen();

        // Variación: ordenar Strings alfabéticamente
        String[] nombres = {"Ale", "Laura", "José", "Yeli", "Gabriel"};
        System.out.print("Original: ");
        for (String s : nombres) {
            System.out.print(s + " ");
        }
        System.out.println();
        bubbleSortString(nombres);
        System.out.print("Final: ");
        for (String s : nombres) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}