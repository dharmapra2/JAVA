import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class zigzag_string {

  public static void main(String[] args) {
    String str = "PAYPALISHIRING";
    int numRows = 6;
    Solution sol = new Solution();
    System.out.println(sol.convert(str, numRows));
  }
}

class Solution {

  public String convert(String s, int numRows) {
    if (numRows <= 1) return s;
    List<StringBuilder> rows = new ArrayList<>();
    /**
     * We create a StringBuilder object for each row up to
     * the minimum of numRows and the length of the input string.
     */
    for (int i = 0; i < Math.min(numRows, s.length()); i++) {
      rows.add(new StringBuilder());
    }
    int curRow = 0;
    boolean goingDown = false;
    for (char c : s.toCharArray()) {
      rows.get(curRow).append(c);
      if (curRow == 0 || curRow == numRows - 1) {
        goingDown = !goingDown;
      }
      curRow += goingDown ? 1 : -1;
    }
    StringBuilder ret = new StringBuilder();
    for (StringBuilder row : rows) {
      ret.append(row);
    }
    return ret.toString();
  }
}
