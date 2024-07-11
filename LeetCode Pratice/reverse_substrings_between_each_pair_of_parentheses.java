import java.util.Stack;

/**
 * reverse_substrings_between_each_pair_of_parentheses
 */
public class reverse_substrings_between_each_pair_of_parentheses {

  public static void main(String[] args) {
    // String str = "(ed(et(oc))el)";
    String str = "a(bcdefghijkl(mno)p)q";
    Innerreverse_substrings_between_each_pair_of_parentheses sol = new Innerreverse_substrings_between_each_pair_of_parentheses();
    System.out.println(sol.reverseParentheses(str));
  }
}

/**
 * Innerreverse_substrings_between_each_pair_of_parentheses
 */
class Innerreverse_substrings_between_each_pair_of_parentheses {

  public String reverseParentheses(String s) {
    Stack<StringBuffer> stack = new Stack<>();
    stack.push(new StringBuffer());

    for (char ch : s.toCharArray()) {
      if (ch == '(') {
        stack.push(new StringBuffer());
      } else if (ch == ')') {
        StringBuffer reversedSubstring = stack.pop().reverse();
        stack.peek().append(reversedSubstring);
      } else {
        stack.peek().append(ch);
      }
    }

    return stack.peek().toString();
  }
}
