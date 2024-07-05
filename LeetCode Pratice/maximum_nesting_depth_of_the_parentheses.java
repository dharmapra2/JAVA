import java.util.Stack;

/**
 * maximum_nesting_depth_of_the_parentheses
 */
public class maximum_nesting_depth_of_the_parentheses {

  public static void main(String[] args) {
    String str = "(1+(2*3)+((8)/4))+1";
    Innermaximum_nesting_depth_of_the_parentheses sol = new Innermaximum_nesting_depth_of_the_parentheses();
    System.out.println(sol.maxDepth(str));
  }
}

/**
 * Innermaximum_nesting_depth_of_the_parentheses
 */
class Innermaximum_nesting_depth_of_the_parentheses {

  public int maxDepth(String s) {
    Stack<Character> stack = new Stack<Character>();
    int depth = 0;
    for (Character ch : s.toCharArray()) {
      if (ch == '(') {
        stack.push(ch);
      } else if (ch == ')') {
        stack.pop();
      }
      depth = Math.max(stack.size(), depth);
    }
    return depth;
  }

  public int maxDepth_2(String s) {
    int max_depth = 0, depth = 0;
    for (Character ch : s.toCharArray()) {
      if (ch == '(') {
        depth++;
      } else if (ch == ')') {
        depth--;
      }
      max_depth = Math.max(depth, max_depth);
    }
    return max_depth;
  }
}
