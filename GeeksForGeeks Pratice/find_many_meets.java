class find_many_meets {

  public static void main(String[] args) {
    System.out.println(new Solution().meetThem(3, 5, 35));
  }
}

class Solution {

  public long meetThem(long A, long B, long C) {
    long lcm = A * B / gcd(A, B);
    return C / lcm;
  }

  public long gcd(long a, long b) {
    if (b == 0) return a;
    System.out.println("a = " + a + " b= " + b + " a % b= " + a % b);
    return gcd(b, a % b);
  }
}
