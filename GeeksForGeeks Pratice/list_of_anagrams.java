import java.io.*;
import java.util.*;

class list_of_anagrams {

  public static void main(String[] args) throws IOException {
    String string_list[] = {
      "eat",
      "nat",
      "ate",
      "tan",
      "bat",
      "eye",
      "tab",
      "ant",
    };

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
      char ch[] = new char[26];
      for (int i = 0; i < str.length(); i++) {
        int temp = str.charAt(i);
        ch[temp - 'a'] = (char) temp;
      }
      String temp_str = new String(ch);
      map.computeIfAbsent(temp_str, k -> new ArrayList<>()).add(str);
    }
    return new ArrayList<>(map.values());
  }
}
