import java.util.ArrayList;

public class Fibo_with_memozition {

  /**
   * this code provides an efficient implementation of the Fibonacci sequence using memoization.
   * The memoization technique stores previously calculated Fibonacci numbers,
   * reducing the number of function calls and avoiding redundant calculations.
   * This results in faster execution times and improved performance.
   */
  public static int holdFiboValue(ArrayList<Integer> list, int num, int limit) {
    if (num <= 1) return num;
    if (num >= list.size()) {
      int temp1 = (int) list.get(list.size() - 1);
      int temp2 = (int) list.get(list.size() - 2);
      list.add(temp1 + temp2);
    }
    if (limit > num) {
      holdFiboValue(list, num + 1, limit);
    }
    return list.get(list.size() - 1);
  }

  public static void main(String... args) {
    int n = 10;
    if (n <= 1) System.out.println(n);
    ArrayList<Integer> li = new ArrayList<Integer>();
    li.add(0);
    li.add(1);
    System.out.println(holdFiboValue(li, 2, n));
  }
}
