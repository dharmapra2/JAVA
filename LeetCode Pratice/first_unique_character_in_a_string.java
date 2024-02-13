import java.util.Arrays;
import java.util.HashMap;

/**
 * first_unique_character_in_a_string
 * https://leetcode.com/problems/first-unique-character-in-a-string/?envType=daily-question&envId=2024-02-05
 */
public class first_unique_character_in_a_string {

  public static void main(String[] args) {
    String str = "aabb";
    Innerfirst_unique_character_in_a_string sol = new Innerfirst_unique_character_in_a_string();
    System.out.println(sol.firstUniqChar_3(str));
  }
}

/**
 * Innerfirst_unique_character_in_a_string
 */
class Innerfirst_unique_character_in_a_string {

  public int firstUniqChar(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    char[] ch = s.toCharArray();
    for (Character character : ch) {
      map.put(character, map.getOrDefault(character, 0) + 1);
    }
    for (int i = 0; i < ch.length; i++) {
      if (map.get(ch[i]) == 1) {
        return i;
      }
    }
    return -1;
  }

  public int firstUniqChar_2(String s) {
    int[] ch = new int[26];
    int strLen = s.length();
    for (int i = 0; i < strLen; i++) {
      int index = s.charAt(i) - 'a';
      ch[index]++;
    }
    System.out.println(Arrays.toString(ch));
    for (int i = 0; i < strLen; i++) {
      int index = s.charAt(i) - 'a';
      if (ch[index] == 1) {
        return i;
      }
    }
    return -1;
  }

  public int firstUniqChar_3(String s) {
    int strLen = s.length();
    for (int i = 0; i < strLen; i++) {
      char c = s.charAt(i);
      int index = s.indexOf(c);
      if (index == s.lastIndexOf(c)) {
        return i;
      }
    }
    return -1;
  }
}
