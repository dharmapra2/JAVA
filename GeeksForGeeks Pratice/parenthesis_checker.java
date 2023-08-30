import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class parenthesis_checker {

  public static void main(String[] args) {
    String str = "[()]{}{[()()]()}";
    Map<Character, Character> bracketToIntMap = new HashMap<>();
    bracketToIntMap.put('{', '}');
    bracketToIntMap.put('}', '{');
    bracketToIntMap.put('(', ')');
    bracketToIntMap.put(')', '(');
    bracketToIntMap.put('[', ']');
    bracketToIntMap.put(']', '[');
    Stack<Character> st = new Stack<Character>();
    for (char ch : str.toCharArray()) {
      System.out.println(st.toString());
      if (!st.isEmpty() && bracketToIntMap.get(st.peek()) == ch) {
        st.pop();
      } else {
        st.push(ch);
      }
    }
    // return st.size() == 0;
  }
}
