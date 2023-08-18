import java.util.HashMap;

class equal_012 {

  public static void main(String[] args) {
    String str = "1212101111";
    Solution T = new Solution();

    System.out.println(T.getSubstringWithEqual012(str));
  }
}

class Solution {

  long getSubstringWithEqual012(String str) {
    int countString = 0, count_0 = 0, count_1 = 0, count_2 = 0;
    HashMap<String, Integer> checkEqalSubString = new HashMap<>();
    checkEqalSubString.put("0$0", 1);
    long largestValue = 0;

    for (char ch : str.toCharArray()) {
      switch (ch) {
        case '0':
          count_0++;
          break;
        case '1':
          count_1++;
          break;
        case '2':
          count_2++;
          break;
      }
      String temp_str = (count_1 - count_0) + "$" + (count_2 - count_1);
      if (checkEqalSubString.containsKey(temp_str)) {
        largestValue += checkEqalSubString.get(temp_str);
        checkEqalSubString.put(temp_str, checkEqalSubString.get(temp_str) + 1);
      } else {
        checkEqalSubString.put(temp_str, 1);
      }
      //   checkEqalSubString.compute(
      //     temp_str,
      //     (key, value) -> (value == null) ? 1 : value + 1
      //   );
    }
    return largestValue;
  }
}
