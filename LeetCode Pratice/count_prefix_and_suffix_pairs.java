/**
 * count_prefix_and_suffix_pairs
 */
class count_prefix_and_suffix_pairs {

  public static void main(String[] args) {
    String[] str = { "a", "aba", "ababa", "aa" };
    Innercount_prefix_and_suffix_pairs sol = new Innercount_prefix_and_suffix_pairs();
    System.out.println(sol.countPrefixSuffixPairs(str));
  }
}

/**
 * Innercount_prefix_and_suffix_pairs
 */
class Innercount_prefix_and_suffix_pairs {

  public int countPrefixSuffixPairs(String[] words) {
    int count = 0, len = words.length;
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) {
          count++;
        }
      }
    }
    return count;
  }
}
