public class Ordenamiento_Burbuja {

    public static void main(String[] args) {

        //Definimos las variables
        int[] Arreglo;
        int a, b, c, n;

        // le indicamos al programa que guardaremos 5 elementos en total
        Arreglo = new int[5];
        n = 5;

        // le asignamos valor a cada posicion de cada arreglo
        Arreglo[0] = 34;
        Arreglo[1] = 12;
        Arreglo[2] = 25;
        Arreglo[3] = 8;
        Arreglo[4] = 19;

        // el primer ciclo repite el proceso las veces necesarias para asegurar que todo quede ordenado
        for (a = 0; a <= n - 2; a++) {

            // el segundo ciclo va recorriendo la lista numero por numero para comparar vecinos
            for (b = 0; b <= n - a - 2; b++) {

                // si el numero de la izquierda es más grande que el de la derecha..
                if (Arreglo[b] > Arreglo[b + 1]) {

                    // intercambiamos de lugar los dos números usando una casilla temporal en este caso es el c
                    c = Arreglo[b];             // se guarda temporalmente el numero grande
                    Arreglo[b] = Arreglo[b + 1]; // se mueve el numero pequeño a la izquierda
                    Arreglo[b + 1] = c;          // se coloca el numero grande a la derecha

                }
            }
        }

        // aqui se imprimen los numeros de menor a mayor
        for (a = 0; a <= n - 1; a++) {
            System.out.print(Arreglo[a] + " ");
        }
    }
}