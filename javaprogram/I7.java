public class I7{
    // Function to multiply matrix by scalar
    public static void multiplyByScalar(int[][] matrix, int scalar) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= scalar;
            }
        }
    }

    // Function to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int scalar = 3;

        System.out.println("Original matrix:");
        printMatrix(matrix);

        multiplyByScalar(matrix, scalar);

        System.out.println("Matrix after multiplication by " + scalar + ":");
        printMatrix(matrix);
    }
}
