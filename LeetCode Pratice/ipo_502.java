import static java.lang.System.out;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ipo_502 {

  public static void main(String[] args) {
    int profits[] = { 1, 2, 3 };
    int Capital[] = { 0, 1, 1 };
    Solution sol = new Solution();
    System.out.println(sol.findMaximizedCapital(2, 0, profits, Capital));
  }
}

class Solution {

  public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
    PriorityQueue<int[]> pqCap = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
    PriorityQueue<int[]> pqPro = new PriorityQueue<>((a, b) -> (b[1] - a[1]));

    for (int i = 0; i < Profits.length; i++) {
      pqCap.add(new int[] { Capital[i], Profits[i] });
    }
    out.println("After adding capital with profit in a sorting format");
    out.println(Arrays.deepToString(pqCap.toArray()));

    for (int i = 0; i < k; i++) {
      while (!pqCap.isEmpty() && pqCap.peek()[0] <= W) {
        pqPro.add(pqCap.poll());
      }

      if (pqPro.isEmpty()) break;

      W += pqPro.poll()[1];
    }

    return W;
  }
}
