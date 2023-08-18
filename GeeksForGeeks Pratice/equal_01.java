import java.util.HashMap;

class equal_01 {

  public static void main(String[] args) {
    String str = "0100110101";
    Solution T = new Solution();

    System.out.println(T.maxSubStr(str));
  }
}

class Solution {

  int maxSubStr(String str) {
    int countString = 0, count_0 = 0, count_1 = 0;
    HashMap<String, Integer> checkEqalSubString = new HashMap<>();
    checkEqalSubString.put("0$0", 0);

    for (char ch : str.toCharArray()) {
      switch (ch) {
        case '0':
          count_0++;
          break;
        case '1':
          count_1++;
          break;
      }
      String temp_str = (count_1 - count_0) + "$" + (count_0 - count_1);
      System.out.printf(
        "\n temp_str = %S , count_1=%d,count_0=%d \n",
        temp_str,
        count_1,
        count_0
      );
      if (checkEqalSubString.containsKey(temp_str)) {
        countString = checkEqalSubString.get(temp_str) + 1;
        checkEqalSubString.put(temp_str, countString);
      } else {
        checkEqalSubString.put(temp_str, 1);
      }
      System.out.println(checkEqalSubString);
    }
    return countString;
  }
}
