import java.util.ArrayList;
import java.util.Stack;

/**
 * minimum_remove_to_make_valid_parentheses
 */
class minimum_remove_to_make_valid_parentheses {

  public static void main(String[] args) {
    String str = "lee(t(c)o)de)";
    Innerminimum_remove_to_make_valid_parentheses sol = new Innerminimum_remove_to_make_valid_parentheses();
    System.out.println(sol.minRemoveToMakeValid(str));
  }
}

/**
 * Innerminimum_remove_to_make_valid_parentheses
 */
class Innerminimum_remove_to_make_valid_parentheses {

  public String minRemoveToMakeValid(String s) {
    Stack<Integer> stack;
    stack = new Stack<>();
    ArrayList<Integer> set = new ArrayList<Integer>();
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = 0; i < s.length(); i++) {
      char character = s.charAt(i);
      if (character == '(') {
        stack.push(i);
        set.add(i);
      } else if (character == ')') {
        int len = stack.size();
        if (len > 0) {
          stack.pop();
        }
      }
    }
    System.out.println(set);
    for (int i = 0; i < s.length(); i++) {
      char character = s.charAt(i);
      if (!set.contains(i)) {
        stringBuffer.append(character);
      }
    }
    return stack.size() == 0 ? stringBuffer.toString() : "";
  }
}
