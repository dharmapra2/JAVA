public class power_of_2 {

  public static void main(String[] args) {
    int n = 9;
    System.out.printf("%b", ((n&(n-1)) == 0));
  }
}
