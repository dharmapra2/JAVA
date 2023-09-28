class stickler_thief {

  public static void main(String[] args) {
    int arr[] = { 9, 4, 11, 12, 6, 12 };
    int even = 0, odd = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        even += arr[i];
      } else {
        odd += arr[i];
      }
    }
    System.out.println(Math.max(even, odd));
  }
}
