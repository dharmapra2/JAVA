import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * maximum_length_of_a_concatenated_string_with_unique_characters
 */
public class maximum_length_of_a_concatenated_string_with_unique_characters {

  public static void main(String[] args) {
    String s[] = { "un", "iq", "ue" };
    List<String> str = Arrays.asList(s);
    Innermaximum_length_of_a_concatenated_string_with_unique_characters sol = new Innermaximum_length_of_a_concatenated_string_with_unique_characters();
    System.out.println(sol.maxLength(str));
  }
}

/**
 * Innermaximum_length_of_a_concatenated_string_with_unique_characters
 */
class Innermaximum_length_of_a_concatenated_string_with_unique_characters {

  int max_length = 0;

  private boolean isUniqeCharacters(String str1) {
    // Combine the two strings
    String combined = str1;
    int check[] = new int[26];

    // Iterate through each character in the combined string
    for (char c : combined.toCharArray()) {
      int temp_index = c - 'a';
      // If the character is already in the set, it's a duplicate
      if (check[temp_index] > 0) {
        return false; // Found a duplicate
      } else {
        check[temp_index] = 1;
      }
    }
    // No duplicates found
    return true;
  }

  public int maxLength(List<String> arr) {
    dfs(arr, "", 0);
    return max_length;
  }

  private void dfs(List<String> arr, String path, int index) {
    System.out.printf(
      "path=%s,  inx=%d, max_length=%d\n",
      path,
      index,
      max_length
    );
    boolean have_unique_characters = isUniqeCharacters(path);
    if (have_unique_characters) {
      max_length = Math.max(max_length, path.length());
    }
    if (index == arr.size() || !have_unique_characters) {
      return;
    }
    for (int i = index; i < arr.size(); i++) {
      dfs(arr, path + arr.get(i), i + 1);
    }
  }
}
