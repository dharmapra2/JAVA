import java.util.ArrayList;
import java.util.List;

public class merge_2_2d_arr_by_summing_2570 {

  public static void main(String[] args) {
    int num1[][] = { { 1, 2 }, { 2, 3 }, { 4, 5 } };
    int num2[][] = { { 1, 4 }, { 3, 2 }, { 4, 1 } };

    // getting length of two arrays
    int len1 = num1.length, len2 = num2.length, f = 0, s = 0, c = 0;
    List<int[]> op = new ArrayList<int[]>();

    while (len1 != f && len2 != s && c != (len1 + len2 - 1)) {
      if (num1[f][0] == num2[s][0]) {
        op.add(new int[] { num1[f][0], num1[f][1] + num2[s][1] });
        s++;
        f++;
      } else if (num1[f][0] < num2[s][0]) {
        op.add(new int[] { num1[f][0], num1[f][1] });
        f++;
      } else if (num2[s][0] < num1[f][0]) {
        op.add(new int[] { num2[s][0], num2[s][1] });
        s++;
      }
      c++;
    }
    while (f != len1) {
      op.add(new int[] { num1[f][0], num1[f][1] });
      f++;
    }
    while (s != len2) {
      op.add(new int[] { num2[s][0], num2[s][1] });
      s++;
    }
    for (int[] ele : op) {
      for (int e : ele) {
        System.out.print(e + " ");
      }
      System.out.println();
    }
  }
}
