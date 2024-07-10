import java.util.ArrayList;
import java.util.List;

/**
 * words_within_two_edits_of_dictionary
 */
public class words_within_two_edits_of_dictionary {

  public static void main(String[] args) {
    String[] queries = { "word", "note", "ants", "wood" };
    String[] dictionary = { "wood", "joke", "moat" };
    Innerwords_within_two_edits_of_dictionary sol = new Innerwords_within_two_edits_of_dictionary();
    System.out.println(sol.twoEditWords(queries, dictionary));
  }
}

/**
 * Innerwords_within_two_edits_of_dictionary
 */
class Innerwords_within_two_edits_of_dictionary {

  int difference(String array1, String array2) {
    int maxLength = Math.min(array1.length(), array2.length()); // Compare up to the shorter length
    int differences = 0;

    for (int i = 0; i < maxLength; i++) {
      if (array1.charAt(i) != array2.charAt(i)) {
        differences++;
        if (differences > 2) {
          return differences; // Return early if more than 2 differences are found
        }
      }
    }

    // Account for length differences
    differences += Math.abs(array1.length() - array2.length());

    return differences;
  }

  public List<String> twoEditWords(String[] queries, String[] dictionary) {
    List<String> result = new ArrayList<String>();
    for (int i = 0; i < queries.length; i++) {
      String chs = queries[i];
      for (int j = 0; j < dictionary.length; j++) {
        String inn_chs = dictionary[j];
        int diff_len = difference(chs, inn_chs);
        if (diff_len <= 2) {
          result.add(queries[i]);
          break; // Break inner loop once condition is met
        }
      }
    }
    return result;
  }
}
