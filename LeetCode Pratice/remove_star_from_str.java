class remove_star_from_str {

  public static void main(String[] args) {
    String str = "erase*****";
    Solution sol = new Solution();
    System.out.println(sol.removeStars(str));
  }
}

class Solution {

  public String removeStars(String s) {
    StringBuilder sb = new StringBuilder();
    for (char ch : s.toCharArray()) {
      if (ch == '*') {
        System.out.println("before delete = " + sb);
        sb.delete(sb.length() - 1, sb.length());
        System.out.println("after delete = " + sb);
      } else {
        System.out.println("before append = " + sb);
        sb.append(ch);
        System.out.println("after append = " + sb);
      }
    }
    return sb.toString();
  }
}
