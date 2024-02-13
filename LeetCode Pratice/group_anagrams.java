import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * group_anagrams
 * https://leetcode.com/problems/group-anagrams/?envType=daily-question&envId=2024-02-06
 *
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *  Example 1:
 *      Input: strs = ["eat","tea","tan","ate","nat","bat"]
 *      Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *  Example 2:
 *      Input: strs = [""]
 *      Output: [[""]]
 *  Example 3:
 *      Input: strs = ["a"]
 *      Output: [["a"]]
 */
public class group_anagrams {

  public static void main(String[] args) {
    String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
    Innergroup_anagrams sol = new Innergroup_anagrams();
    System.out.println(sol.groupAnagrams(strs));
  }
}

/**
 * Innergroup_anagrams
 */
class Innergroup_anagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
    for (String strEle : strs) {
      // Convert the string to an array of characters
      char[] charArray = strEle.toCharArray();
      Arrays.sort(charArray);
      String sortedString = new String(charArray);
      if (!map.containsKey(sortedString)) {
        map.put(sortedString, new ArrayList<>());
      }
      map.get(sortedString).add(strEle);
    }
    return new ArrayList<>(map.values());
  }
}
