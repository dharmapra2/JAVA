import java.util.Arrays;

/**
 * set_mismatch
 */
public class set_mismatch {

  public static void main(String[] args) {
    int num[] = { 1, 1 };
    Innerset_mismatch in = new Innerset_mismatch();
    System.out.println(Arrays.toString(in.findErrorNums(num)));
  }
}

/**
 * Innerset_mismatch
 */
class Innerset_mismatch {

  public int[] findErrorNums(int[] nums) {
    int ans[] = new int[2];
    int n = nums.length;
    HashSet<Integer> set = new HashSet<>();
    int sum = n * (n + 1) / 2;
    int repeat = -1;
    for (int val : nums) {
      if (set.contains(val)) {
        repeat = val;
      } else {
        set.add(val);
        sum -= val;
      }
    }
    ans[0] = repeat;
    ans[1] = sum;
    return ans;
  }
}
