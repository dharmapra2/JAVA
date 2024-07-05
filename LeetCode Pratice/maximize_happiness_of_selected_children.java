import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * maximize_happiness_of_selected_children
 * https://leetcode.com/problems/maximize-happiness-of-selected-children
 */
public class maximize_happiness_of_selected_children {

  public static void main(String[] args) {
    int[] happiness = { 1, 2, 3 };
    int k = 2;
    Innermaximize_happiness_of_selected_children sol = new Innermaximize_happiness_of_selected_children();
    System.err.println(sol.maximumHappinessSum_using_heap(happiness, k));
  }
}

/**
 * Innermaximize_happiness_of_selected_children
 */
class Innermaximize_happiness_of_selected_children {

  // here it get's time out error for large no of arrays like 10^8
  public long maximumHappinessSum(int[] happiness, int k) {
    int arrLen = happiness.length - 1, diff = 0;
    long maxHappiness = 0;
    Arrays.sort(happiness);
    System.out.println(Arrays.toString(happiness));

    for (int i = arrLen; i >= 0 && k > diff; i--, diff++) {
      int getEle = happiness[i] - diff;
      maxHappiness += getEle;
      System.out.printf("diff: %d, ele=%d\n", diff, happiness[i]);
    }
    return maxHappiness;
  }

  public long maximumHappinessSum_using_heap(int[] happiness, int k) {
    int arrLen = happiness.length - 1, diff = 0;
    long maxHappiness = 0;
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(
      Comparator.reverseOrder()
    );

    for (int ele : happiness) {
      maxHeap.add(ele);
    }

    System.out.println(maxHeap);

    for (int i = arrLen; i >= 0 && k > diff; i--, diff++) {
      int getEle = happiness[i] - diff;
      maxHappiness += getEle;
    }
    return maxHappiness;
  }
}
