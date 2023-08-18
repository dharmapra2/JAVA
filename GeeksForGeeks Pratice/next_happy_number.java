import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * For a given non-negative integer N, find the next smallest Happy Number.
 * A number is called Happy if it leads to 1 after a sequence of steps.
 * Wherein at each step the number is replaced by the sum of squares of its digits that is,
 * if we start with Happy Number and keep replacing it with sum of squares of its digits, we reach 1 at some point.
 */
public class next_happy_number {

  public static void main(String[] args) {
    int n = 64;
    System.out.println(nextHappy(n));
  }

  static int nextHappy(int n) {
    // code here
    n++;
    while (n <= 1e5) {
      if (happy(n)) {
        return n;
      }
      n++;
    }
    return -1;
  }

  static boolean happy(int i) {
    if (i <= 9) {
      if (i == 1 || i == 7) return true; else return false;
    }
    int sum = 0, temp = i;
    while (temp > 0) {
      int digit = temp % 10;
      sum += digit * digit;
      temp /= 10;
    }
    boolean check = happy(sum);
    return check;
  }
}
