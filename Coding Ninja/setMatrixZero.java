import java.util.Arrays;

public class setMatrixZero {

  public static void main(String[] args) {
    int[][] matrix = {
      { 4, 3, 1, 4 },
      { 9, 0, 1, 4 },
      { 0, 2, 1, 3 },
      { 70, 80, 1, 0 },
    };

    boolean fr = false, fc = false;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          if (i == 0) fr = true;
          if (j == 0) fc = true;
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }
      }
    }
    System.out.println();

    for (int[] a : matrix) {
      System.out.println(Arrays.toString(a));
    }
    System.out.println();
    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[0].length; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    System.out.println();

    for (int[] a : matrix) {
      System.out.println(Arrays.toString(a));
    }
    System.out.println();
    if (fr) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[0][j] = 0;
      }
    }
    System.out.println();

    for (int[] a : matrix) {
      System.out.println(Arrays.toString(a));
    }
    System.out.println();
    if (fc) {
      for (int i = 0; i < matrix.length; i++) {
        matrix[i][0] = 0;
      }
    }
    System.out.println();

    for (int[] a : matrix) {
      System.out.println(Arrays.toString(a));
    }
    System.out.println();
  }
}
