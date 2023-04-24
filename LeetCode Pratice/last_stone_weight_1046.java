import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

class last_stone_weight_1046 {

  public static void main(String[] args) {
    int[] stones = { 2, 7, 4, 1, 8, 1, 1 };
    Solution sol = new Solution();
    System.out.println(sol.lastStoneWeight(stones));
  }
}

class Solution {

  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> last = new PriorityQueue<>(
      Collections.reverseOrder()
    );
    // adding stones values into the queue
    last.addAll(Arrays.stream(stones).boxed().collect(Collectors.toList()));
    System.out.println("list = " + last.toString());

    while (last.size() > 1) {
      int y = last.poll();
      int x = last.poll();
      System.out.println("x=" + x + " ,y=" + y);
      if (x != y) {
        last.add(y - x);
      }
      System.out.println("list = " + last.toString());
    }
    return last.isEmpty() ? 0 : last.peek();
  }
}
