package domain;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Ladik
 * Утилітний клас для роботи з двовимірними масивами (матрицями).
 * Містить методи для заповнення матриці послідовними числами та її транспонування.
 */
public class AdvArrays {

    /**
     * Створює матрицю розміру rows x cols, заповнену числами від 1 до rows*cols.
     *
     * @param rows кількість рядків
     * @param cols кількість стовпців
     * @return заповнена матриця
     */
    public static int[][] createMatrix(int rows, int cols) {
        int[] flat = IntStream.rangeClosed(1, rows * cols).toArray();
        return IntStream.range(0, rows)
                .mapToObj(i -> Arrays.copyOfRange(flat, i * cols, (i + 1) * cols))
                .toArray(int[][]::new);
    }

    /**
     * Транспонує матрицю будь-якого розміру.
     *
     * @param matrix вхідна матриця
     * @return транспонована матриця
     */
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        return IntStream.range(0, cols)
                .mapToObj(i -> IntStream.range(0, rows)
                        .map(j -> matrix[j][i])
                        .toArray())
                .toArray(int[][]::new);
    }
}
