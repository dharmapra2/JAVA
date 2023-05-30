import java.util.Arrays;
import java.util.HashMap;

class Valid_Anagram_242 {

  public static void main(String[] args) {
    String s = "anagram", t = "nagaram";
    System.out.println(new Solution().isAnagram(s, t));
  }
}

class Solution {

  public boolean isAnagram1(String s, String t) {
    HashMap<Character, Integer> list = new HashMap<Character, Integer>();
    for (char ele : s.toCharArray()) {
      int count = 1;
      if (list.containsKey(ele)) {
        int val = list.getOrDefault(ele, 0);
        list.replace(ele, val + 1);
      } else {
        list.put(ele, count);
      }
    }
    System.out.println(list);
    for (char ele : t.toCharArray()) {
      if (!list.containsKey(ele)) {
        System.out.println("false=" + ele);
        return false;
      } else {
        if (list.getOrDefault(ele, 0) <= 0) {
          System.out.println("remove=" + ele);
          list.remove(ele);
        } else {
          int val = list.get(ele) - 1;
          System.out.println("put=" + ele + " ,val=" + val);
          list.replace(ele, val);
        }
      }
    }
    return true;
  }

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] count = new int[26]; // Assuming lowercase English letters only

    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i) - 'a']++;
      count[t.charAt(i) - 'a']--;
    }
    for (int i = 0; i < count.length; i++) {
      if (count[i] != 0) {
        return false;
      }
    }
    System.gc();
    return true;
  }
}
