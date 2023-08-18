import java.util.Arrays;

public class setMatrixZero {

  public static void main(String[] args) {
    int[][] matrix = { { 1, 0, 2, 3 }, { 3, 4, 0, 2 }, { 1, 3, 1, 5 } };
    int cornor = 1;
    for (int[] a : matrix) {
      System.out.println(Arrays.toString(a));
    }
    System.out.println();
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 0) {
          if (i == 0) {
            cornor = 0;
            matrix[i][0] = 1;
          } else {
            matrix[i][0] = 0;
            matrix[0][j] = 0;
          }
        }
      }
    }
    for (int[] a : matrix) {
      System.out.println(Arrays.toString(a));
    }
    System.out.println(cornor);

    for (int i = 1; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[0][j] == 0 || matrix[i][0] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    if (cornor == 0) {
      for (int i = 0; i <= matrix.length; i++) {
        matrix[0][i] = 0;
      }
    }
    for (int[] a : matrix) {
      System.out.println(Arrays.toString(a));
    }
  }
}
