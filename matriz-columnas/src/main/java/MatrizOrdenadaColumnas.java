public class MatrizOrdenadaColumnas {

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz, String titulo) {
        System.out.println("\n=== " + titulo + " ===");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Ordena cada columna de la matriz de menor a mayor usando Selection Sort.
     * También cuenta las comparaciones realizadas por cada columna.
     * Complejidad: O(n²) por columna → O(m * n²) donde m = número de columnas
     */
    public static void ordenarColumnasSelectionSort(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        System.out.println("\n>>> PROCESO DE ORDENAMIENTO (Selection Sort por columnas)");

        for (int col = 0; col < columnas; col++) {
            int comparaciones = 0;

            System.out.println("\n--- Ordenando columna " + col + " ---");

            // Selection Sort para la columna actual
            for (int i = 0; i < filas - 1; i++) {
                int minIndex = i;

                for (int j = i + 1; j < filas; j++) {
                    comparaciones++; // Contamos cada comparación
                    if (matriz[j][col] < matriz[minIndex][col]) {
                        minIndex = j;
                    }
                }

                // Intercambio
                if (minIndex != i) {
                    int temp = matriz[i][col];
                    matriz[i][col] = matriz[minIndex][col];
                    matriz[minIndex][col] = temp;

                    // Mostrar el estado después del intercambio (proceso)
                    System.out.println("Intercambio en fila " + i + " ↔ fila " + minIndex);
                    imprimirMatriz(matriz, "Estado actual");
                }
            }

            System.out.println("Comparaciones realizadas en columna " + col + ": " + comparaciones);
        }
    }
    public static void main(String[] args) {

        int[][] matriz = {
                {9, 3, 7, 1},
                {4, 8, 2, 6},
                {5, 0, 9, 3},
                {1, 7, 4, 8}
        };

        imprimirMatriz(matriz, "Matriz Original");

        // Ordenar las columnas
        ordenarColumnasSelectionSort(matriz);

        // Mostrar matriz final
        imprimirMatriz(matriz, "Matriz Resultante (columnas ordenadas)");
    }
}