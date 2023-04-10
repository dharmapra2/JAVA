import java.util.Stack;

public class vaild_parenthesis {

  public boolean isValid(String str) {
    Stack<Character> stack = new Stack<Character>();
    for (char c : str.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else if (c == ')' || c == '}' || c == ']') {
        if (stack.empty()) {
          return false;
        }
        char top = stack.pop();
        if (
          (c == ')' && top != '(') ||
          (c == '}' && top != '{') ||
          (c == ']' && top != '[')
        ) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
