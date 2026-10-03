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

    public static void main(String[] args) {

        int[][] matriz = {
                {9, 3, 7, 1},
                {4, 8, 2, 6},
                {5, 0, 9, 3},
                {1, 7, 4, 8}
        };

        imprimirMatriz(matriz, "Matriz Original");
    }
}