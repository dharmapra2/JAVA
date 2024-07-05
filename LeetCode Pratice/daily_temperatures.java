import java.util.Arrays;
import java.util.Stack;

/**
 * https://leetcode.com/problems/daily-temperatures/description/?envType=daily-question&envId=2024-01-31
 * daily_temperatures
 *
 *
 * Example 1:
 *     Input: temperatures = [73,74,75,71,69,72,76,73]
 *     Output: [1,1,4,2,1,1,0,0]
 *
 * Example 2:
 *     Input: temperatures = [30,40,50,60]
 *     Output: [1,1,1,0]
 *
 * Example 3:
 *     Input: temperatures = [30,60,90]
 *     Output: [1,1,0]
 *
 * Constraints:
 *      1 <= temperatures.length <= 105
 *      30 <= temperatures[i] <= 100
 */
public class daily_temperatures {
  
  public static void main(String[] args) {
    int arr[] = { 73, 74, 75, 71, 69, 72, 76, 73 };
    Innerdaily_temperatures sol = new Innerdaily_temperatures();
    System.out.println(Arrays.toString(sol.dailyTemperatures_2(arr)));
  }
}

/**
 * Innerdaily_temperatures
 */
class Innerdaily_temperatures {

  public int[] dailyTemperaturesBruteForce(int[] temperatures) {
    /**
     * here time limit will be exceed for
     */
    int len = temperatures.length;
    int temp[] = new int[len];
    for (int i = 0; i < len; i++) {
      int count = 0, currEle = temperatures[i];
      boolean hasMax = false;
      for (int j = i + 1; j < len; j++) {
        if (currEle < temperatures[j]) {
          count++;
          hasMax = true;
          break;
        } else {
          count++;
        }
      }
      temp[i] = hasMax ? count : 0;
    }
    return temp;
  }

  public int[] dailyTemperatures(int[] temperatures) {
    // O(n)
    int len = temperatures.length;
    int[] result = new int[len];
    int[] stack = new int[len];
    int top = -1;

    for (int i = 0; i < len; i++) {
      while (top >= 0 && temperatures[i] > temperatures[stack[top]]) {
        int index = stack[top--];
        result[index] = i - index;
      }
      stack[++top] = i;
    }
    return result;
  }

  public int[] dailyTemperatures_2(int[] temperatures) {
    // O(n)
    int len = temperatures.length;
    int[] result = new int[len];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < len; i++) {
      while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
        int index = stack.pop();
        result[index] = i - index;
      }
      stack.push(i);
    }

    return result;
  }
}
