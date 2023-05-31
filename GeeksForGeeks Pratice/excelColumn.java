import java.io.*;
import java.util.*;

class excelColumn {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    Solution T = new Solution();

    System.out.println(T.calExcelColumn(n));
  }
}

class Solution {

  public String calExcelColumn(int N) {
    StringBuilder sb = new StringBuilder();
    while (N > 0) {
      int mod = --N % 26;
      char c = (char) ('A' + mod);
      sb.append(c);
      N /= 26;
    }
    return sb.reverse().toString();
  }
}
