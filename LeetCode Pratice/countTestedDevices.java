/**
 * countTestedDevices
 */
class countTestedDevices {

  public static void main(String[] args) {
    int arr[] = { 1, 1, 2, 1, 3 };
    System.out.println(new Solution().countTestedDevices(arr));
  }
}

class Solution {

  public int countTestedDevices(int[] bp) {
    int testedD = 0;
    for (int i = 0; i < bp.length; i++) {
      System.out.printf("tes: %d, arr: %d \t", testedD - bp[i], bp[i]);
      if ((bp[i] - testedD) > 0) {
        testedD++;
      }
      System.out.println(testedD);
    }
    return testedD;
  }
}
