import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * relative_sort_array
 */
public class relative_sort_array {

  public static void main(String[] args) {
    int arr1[] = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
    int arr2[] = { 2, 1, 4, 3, 9, 6 };
    Innerrelative_sort_array sol = new Innerrelative_sort_array();
    int result[] = sol.relativeSortArray(arr1, arr2);
    System.out.println(Arrays.toString(result));
  }
}

/**
 * Innerrelative_sort_array
 */
class Innerrelative_sort_array {

  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    Arrays.sort(arr1);
    System.out.println(Arrays.toString(arr1));
    return new int[] { 2, 4, 5 };
  }
}
