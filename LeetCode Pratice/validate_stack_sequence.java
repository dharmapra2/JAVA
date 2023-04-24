import java.util.Arrays;
import java.util.Stack;

public class validate_stack_sequence {

  public static void main(String[] args) {
    // creating two arrays which conatins push & pop values
    int[] pushVal = { 1, 2, 3, 4, 5 };
    int[] popVal = { 4, 3, 5, 1, 2 };

    Solution res = new Solution();
    System.out.println(res.validateStackSequences1(pushVal, popVal));
    System.out.println(res.validateStackSequences2(pushVal, popVal));
  }
}

class Solution {

  // Approach 1
  public boolean validateStackSequences1(int[] pushVal, int[] popVal) {
    Stack<Integer> pushed = new Stack<>();
    int j = 0;
    for (int val : pushVal) {
      // push value to the stack
      pushed.push(val);

      // now weither able to pop from stack
      //   System.out.println(pushed.toString());
      while (!pushed.isEmpty() && pushed.peek() == popVal[j]) {
        pushed.pop();
        j++;
      }
    }
    return pushed.isEmpty();
  }

  //   Approarch 2
  public boolean validateStackSequences2(int[] pushVal, int[] popVal) {
    int i = 0, j = 0;
    for (int k : pushVal) {
      pushVal[i++] = k;
      while (i > 0 && pushVal[i - 1] == popVal[j]) {
        System.out.println(pushVal[i - 1] + "    " + popVal[j]);
        i--;
        j++;
      }
    }
    return i == 0;
  }
}
