class search_in_rotate_array {

  public static void main(String[] args) {
    int[] arr = { 3, 4, 5, 6, 7, 1, 2 };
    int k = 2;
    System.out.println(searchItem(arr, k));
  }

  private static int searchItem(int[] ar, int k) {
    int l = 0, r = ar.length - 1, mid = -1;
    while (l < r) {
      mid = (l + r) / 2;
      int midItem = ar[mid];
      System.out.printf("midItem=%d,l=%d,r=%d\n", midItem, l, r);
      if (midItem == k) {
        return midItem;
      } else if (midItem < k) {
        if (k < r) {
          l = mid + 1;
        } else {
          r = mid - 1;
        }
      } else {
        r = mid - 1;
      }
    }
    return mid == k ? mid : -1;
  }
}
