import java.util.Arrays;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string/u
 * reverse_words_in_a_string
 */
public class reverse_words_in_a_string {

  public static void main(String[] args) {
    String str = "the   sky  sd   is     blue";
    Innerreverse_words_in_a_string sol = new Innerreverse_words_in_a_string();
    System.out.println(sol.reverseWords(str));
  }
}


/**
 * Innerreverse_words_in_a_string
 */
class Innerreverse_words_in_a_string {

  public String reverseWords(String s) {
    StringBuilder reversedString = new StringBuilder();
    // Split the string by whitespace
    String[] words = s.trim().split("\\s+");

    // Append words to the StringBuilder in reverse order
    for (int i = words.length - 1; i >= 0; i--) {
      reversedString.append(words[i]);
      if (i > 0) {
        // Add space between words
        reversedString.append(" ");
      }
    }
    
    return reversedString.toString();
  }
}
