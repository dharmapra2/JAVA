/**
 * Here we need to store the mid val and then make travers to left side for first occourence
 *
 * Here we need to store the mid val and then make travers to right side for last occourence
 */

public class find_first_occourence {

  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 30, 30, 40, 50 };
    int target = 10, start = 0, end = arr.length - 1, ans = -1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (arr[mid] == target) {
        ans = mid;
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    System.out.println(ans);
  }
}
