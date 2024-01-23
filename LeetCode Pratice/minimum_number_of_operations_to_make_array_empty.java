import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * minimum_number_of_operations_to_make_array_empty
 *
 * https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/editorial/?envType=daily-question&envId=2024-01-04
 *
 * https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/description/
 */
public class minimum_number_of_operations_to_make_array_empty {

  public static void main(String[] args) {
    int arr[] = {
      14,
      12,
      14,
      14,
      12,
      14,
      14,
      12,
      12,
      12,
      12,
      14,
      14,
      12,
      14,
      14,
      14,
      12,
      12,
    };
    // int arr[] = { 3, 3 };
    Innerminimum_number_of_operations_to_make_array_empty sol = new Innerminimum_number_of_operations_to_make_array_empty();
    System.out.println(sol.minOperations3(arr));
  }
}

class Innerminimum_number_of_operations_to_make_array_empty {

  public int minOperations(int[] nums) {
    int minimum_operations = 0;
    HashMap<Integer, Integer> counts = new HashMap<>();

    for (int no : nums) {
      counts.putIfAbsent(no, 0);
      counts.computeIfPresent(no, (key, val) -> val + 1);
    }

    for (int key : counts.keySet()) {
      int temp = counts.get(key);
      if (temp > 0) {
        if (temp == 1) return -1;

        minimum_operations += temp / 3;
        if (temp % 3 != 0) minimum_operations++;
      }
    }
    return minimum_operations;
  }

  public int minOperations2(int[] nums) {
    int minimum_operations = 0;
    HashMap<Integer, Integer> counts = new HashMap<>();

    for (int no : nums) {
      counts.put(no, counts.getOrDefault(no, 0) + 1);
    }

    for (int key : counts.keySet()) {
      int temp = counts.get(key);
      if (temp == 1) return -1;
      minimum_operations += (temp + 2) / 3;
    }

    return minimum_operations;
  }

  public int minOperations3(int[] nums) {
    Arrays.sort(nums);
    int minimum_operations = 0, low = 0, high = 0;

    while (high < nums.length) {
        
      int temp = counts.get(key);
      if (temp == 1) return -1;
      minimum_operations += (temp + 2) / 3;
    }

    return minimum_operations;
  }
}
