class complete_staircase_aug_27_23 {

  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]), i, count;
    for (i = count = 1; count <= num; ++i, count += i) {
      System.out.printf("i=%d,count=%d\n", i, count);
    }
    // return i-1;
  }
}
