import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * convert-an-array-into-a-2d-array-with-conditions
 * https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/?envType=daily-question&envId=2024-01-02
 */
public class convert_an_array_into_a_2d_array_with_conditions {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 2, 1, 2, 3, 1 };
    Innerconvert_an_array_into_a_2d_array_with_conditions sol = new Innerconvert_an_array_into_a_2d_array_with_conditions();
    System.out.println(sol.findMatrix2(arr).toString());
  }
}

/**
 * Innerconvert_an_array_into_a_2d_array_with_conditions
 */
class Innerconvert_an_array_into_a_2d_array_with_conditions {

  public List<List<Integer>> findMatrix(int[] nums) {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    list.add(new ArrayList<Integer>());

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int temp_val = nums[i];
      if (map.containsKey(temp_val)) {
        int val = map.getOrDefault(temp_val, 0) + 1;
        // System.out.printf("lists=%d, val=%d\n", list.size(), val);
        if (list.size() <= val) {
          list.add(new ArrayList<Integer>());
        }
        list.get(val).add(temp_val);
        map.put(temp_val, val);
      } else {
        list.get(0).add(temp_val);
        map.put(temp_val, 0);
      }
    }
    map.clear();
    return list;
  }

  public List<List<Integer>> findMatrix2(int[] nums) {
    int freq[] = new int[nums.length + 1];

    ArrayList<List<Integer>> ans = new ArrayList<>();
    for (int c : nums) {
      System.out.println(Arrays.toString(freq));
      if (freq[c] >= ans.size()) {
        ans.add(new ArrayList<>());
      }

      // Store the integer in the list corresponding to its current frequency.
      ans.get(freq[c]).add(c);
      freq[c]++;
    }

    return ans;
  }
}
