import java.util.Stack;

/**
 * evaluate_reverse_polish_notation
 * https://leetcode.com/problems/evaluate-reverse-polish-notation/?envType=daily-question&envId=2024-01-30
 *
 * Example 1:
 *     Input: tokens = ["2","1","+","3","*"]
 *     Output: 9
 *     Explanation: ((2 + 1) * 3) = 9
 * Example 2:
 *     Input: tokens = ["4","13","5","/","+"]
 *     Output: 6
 *     Explanation: (4 + (13 / 5)) = 6
 * Example 3:
 *     Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 *     Output: 22
 *     Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 *     = ((10 * (6 / (12 * -11))) + 17) + 5
 *     = ((10 * (6 / -132)) + 17) + 5
 *     = ((10 * 0) + 17) + 5
 *     = (0 + 17) + 5
 *     = 17 + 5
 *     = 22
 */
public class evaluate_reverse_polish_notation {

  public static void main(String[] args) {
    String[] token = { "2", "1", "+", "3", "*" };
    Innerevaluate_reverse_polish_notation sol = new Innerevaluate_reverse_polish_notation();
    System.out.println(sol.evalRPN(token));
  }
}

/**
 * Innerevaluate_reverse_polish_notation
 */
class Innerevaluate_reverse_polish_notation {

  int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    String conatins = "+/-*";
    for (String str : tokens) {
      if (!conatins.contains(str)) {
        int num = Integer.parseInt(str);
        stack.push(num);
      } else {
        int val1 = stack.pop();
        int val2 = stack.pop();

        switch (str) {
          case "+":
            stack.push(val2 + val1);
            break;
          case "-":
            stack.push(val2 - val1);
            break;
          case "/":
            stack.push(val2 / val1);
            break;
          case "*":
            stack.push(val2 * val1);
            break;
        }
      }
    }

    return stack.pop();
  }
}
