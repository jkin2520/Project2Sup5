public class MagicSquare {
    public static boolean isMagicSquare(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return false;

        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[0][i];
        }

        // Check sums of each row, column, and diagonals
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != sum || colSum != sum) {
                return false;
            }
        }

        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += matrix[i][i];
            diag2 += matrix[i][n - i - 1];
        }

        return diag1 == sum && diag2 == sum;
    }
}
