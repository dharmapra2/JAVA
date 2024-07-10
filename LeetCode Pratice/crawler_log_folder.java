import java.util.Stack;

/**
 * https://leetcode.com/problems/crawler-log-folder/description/?envType=daily-question&envId=2024-07-10
 * crawler_log_folder
 */
public class crawler_log_folder {

  public static void main(String[] args) {
    // String[] log = { "d1/", "d2/", "./", "d3/", "../", "d31/" };
    String[] log = { "./", "../", "./" };

    Innercrawler_log_folder sol = new Innercrawler_log_folder();
    System.out.println(sol.minOperations(log));
  }
}

/**
 * Innercrawler_log_folder
 */
class Innercrawler_log_folder {

  public int minOperations(String[] logs) {
    Stack<String> stack = new Stack<>();
    for (String string : logs) {
      if (string.equals("./")) {
        continue;
      } else if (string.equals("../") && !stack.empty()) {
        stack.pop();
      } else if (!string.equals("../")) {
        stack.push(string);
      }
    }
    System.out.println(stack);
    return stack.size();
  }
}
