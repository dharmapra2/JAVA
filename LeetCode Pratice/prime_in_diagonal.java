import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class prime_in_diagonal {

  public static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public int diagonalPrime(int[][] nums) {
    int n = nums.length;
    Set<Integer> primes = new HashSet<>();
    for (int i = 0; i < n; i++) {
      if (isPrime(nums[i][i])) {
        primes.add(nums[i][i]);
      }
      if (isPrime(nums[i][n - i - 1])) {
        primes.add(nums[i][n - i - 1]);
      }
    }
    if (!primes.isEmpty()) {
      return Collections.max(primes);
    } else {
      return 0;
    }
  }
}
