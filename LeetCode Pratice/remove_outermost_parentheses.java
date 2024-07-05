import java.util.Stack;

/**
 * remove_outermost_parentheses
 */
class remove_outermost_parentheses {

  public static void main(String[] args) {
    String str = "(()())(())";
    Innerremove_outermost_parentheses sol = new Innerremove_outermost_parentheses();
    System.out.println(sol.removeOuterParentheses2(str));
  }
}

/**
 * Innerremove_outermost_parentheses
 */
class Innerremove_outermost_parentheses {

  public String removeOuterParentheses(String s) {
    Stack<Character> stack = new Stack<>();
    StringBuilder str = new StringBuilder();
    for (char ch : s.toCharArray()) {
      if (ch == '(') {
        if (stack.empty()) {
          stack.push(ch);
          continue;
        }
        stack.push(ch);
        str.append(ch);
      } else {
        int len = stack.size();
        if (len == 1) {
          stack.pop();
          continue;
        }
        stack.pop();
        str.append(ch);
      }
    }
    return str.toString();
  }

  public String removeOuterParentheses2(String S) {
    StringBuilder s = new StringBuilder();
    int opened = 0;
    for (char c : S.toCharArray()) {
      if (c == '(' && opened++ > 0) s.append(c);
      if (c == ')' && opened-- > 1) s.append(c);
    }
    return s.toString();
  }
}
