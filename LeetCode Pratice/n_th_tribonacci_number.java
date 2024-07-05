import java.util.Arrays;

/**
 * n_th_tribonacci_number
 */
public class n_th_tribonacci_number {

  public static void main(String[] args) {
    int num = 8;
    Innern_th_tribonacci_number sol = new Innern_th_tribonacci_number();
    System.out.println(sol.tribonacci(num));
  }
}

/**
 * Innern_th_tribonacci_number
 */
class Innern_th_tribonacci_number {

  public int tribonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1 || n == 2) {
      return 1;
    }
    int tribonacci_arr[] = new int[n + 1];
    tribonacci_arr[1] = 1;
    tribonacci_arr[2] = 1;

    for (int i = 3; i <= n; i++) {
      tribonacci_arr[i] =
        tribonacci_arr[i - 1] + tribonacci_arr[i - 2] + tribonacci_arr[i - 3];
    }
    return tribonacci_arr[n];
  }

  public int tribonacci_2(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1 || n == 2) {
      return 1;
    }

    int a = 0, b = 1, c = 1;
    int nextTrib;

    for (int i = 3; i <= n; i++) {
      nextTrib = a + b + c;
      a = b;
      b = c;
      c = nextTrib;
    }

    return c;
  }
}
