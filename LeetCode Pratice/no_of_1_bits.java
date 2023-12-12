public class no_of_1_bits {

  public static void main(String[] args) {
    int n = 1111111111;
    System.out.println(new Solution().hammingWeight(n));
  }
}

class Solution {

  public int bulti_in_java_method(int n) {
    return Integer.bitCount(n);
  }

  // Brian Kernighan's Algorithm
  public int hammingWeight(int n) {
    int count = 0;
    while (n > 0) {
      n = n & (n - 1);
      count++;
    }
    return count;
  }

  public int String_Conversion_hammingWeight(int n) {
    String binaryString = Integer.toBinaryString(n);
    int count = 0;
    for (char c : binaryString.toCharArray()) {
      if (c == '1') {
        count++;
      }
    }
    return count;
  }

  public int Bit_Manipulation_hammingWeight(int n) {
    int count = 0;
    while (n != 0) {
      count += n & 1;
      n >>>= 1;
    }
    return count;
  }
}
/**
 * Methods To Solve This Problem:
 * Brian Kernighan's Algorithm
 * Bit Manipulation
 * String Conversion
 *
 * 1. Brian Kernighan's Algorithm:
 *   Initialize a count variable to 0.
 *   Iterate through each bit of the number using the following steps:
 *   If the current bit is 1, increment the count.
 *   Set the current bit to 0 using the expression n = n & (n - 1).
 *   The count variable now holds the number of 1 bits.
 *  Complexity
 * ⏱️ Time Complexity: O(k), where k is the number of set bits in the binary representation of the number.
 * 🚀 Space Complexity: O(1)
 *
 *
 *
 *
 * 2. Bit Manipulation:
 *    Initialize a count variable to 0.
 *    Iterate through each bit of the number using a loop.
 *    If the current bit is 1, increment the count.
 *    The count variable now holds the number of 1 bits.
 *
 * Complexity
 *      ⏱️ Time Complexity: O(log n), where n is the value of the input number.
 *      🚀 Space Complexity: O(1)
 *
 *
 *
 * 3. String Conversion:
 * Convert the integer to its binary string representation.
 * Count the number of '1' characters in the binary string
 *
 * Complexity
 * ⏱️ Time Complexity: O(log n), where n is the value of the input number.
 * 🚀 Space Complexity:O(log n)
 */
