import java.io.*;
import java.util.*;

class list_of_anagrams {

  public static void main(String[] args) throws IOException {
    String string_list[] = { "ddddddddddg", "dgggggggggg" };

    Solution ob = new Solution();
    List<List<String>> ans = ob.Anagrams(string_list);
    Collections.sort(
      ans,
      new Comparator<List<String>>() {
        public int compare(List<String> l1, List<String> l2) {
          String s1 = l1.get(0);
          String s2 = l2.get(0);

          return s1.compareTo(s2);
        }
      }
    );

    for (int i = 0; i < ans.size(); i++) {
      for (int j = 0; j < ans.get(i).size(); j++) {
        System.out.print(ans.get(i).get(j) + " ");
      }
      System.out.println();
    }
  }
}

class Solution {

  public List<List<String>> Anagrams(String[] string_list) {
    HashMap<String, List<String>> map = new HashMap<>();
    for (String str : string_list) {
      int ch[] = new int[26];
      for (char c : str.toCharArray()) {
        ch[c - 'a']++;
      }
      StringBuilder sb = new StringBuilder();
      for (int character : ch) {
        sb.append(character);
        sb.append("#");
      }
      String temp_str = new String(sb.toString());
      map.computeIfAbsent(temp_str, k -> new ArrayList<>()).add(str);
    }
    System.out.println(map);
    return new ArrayList<>(map.values());
  }
}
