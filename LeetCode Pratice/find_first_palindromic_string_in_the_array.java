/**
 * find_first_palindromic_string_in_the_array
 */
class find_first_palindromic_string_in_the_array {

  public static void main(String[] args) {
    String[] str = { "abc", "car", "ada", "racecar", "cool" };
    Innerfind_first_palindromic_string_in_the_array sol = new Innerfind_first_palindromic_string_in_the_array();
    System.out.println(sol.firstPalindrome(str));
  }
}

/**
 * Innerfind_first_palindromic_string_in_the_array
 */
class Innerfind_first_palindromic_string_in_the_array {

  boolean checkPalindrome(String str) {
    // Use two pointers to compare characters from the start and end
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left++) != str.charAt(right--)) {
        // Characters at the pointers do not match
        return false;
      }
    }

    // All characters matched, it's a palindrome
    return true;
  }

  public String firstPalindrome(String[] words) {
    for (String str : words) {
      if (checkPalindrome(str)) {
        return str;
      }
    }
    return "";
  }
}
