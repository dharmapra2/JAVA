import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class unique_no_of_occurrence {

  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 5, 5 };
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
    for (int i : arr) {
      list.put(i, list.getOrDefault(i, 0) + 1);
    }
    System.out.println(list);
    HashSet<Integer> set = new HashSet<>();

    for (int i : list.values()) {
      if (set.contains(i)) {
        System.out.println(false);
      } else {
        set.add(i);
      }
    }
    System.out.println(true);
  }
}
