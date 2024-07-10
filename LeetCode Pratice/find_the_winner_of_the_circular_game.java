import java.util.LinkedList;
import java.util.List;

/**
 * find_the_winner_of_the_circular_game
 */
public class find_the_winner_of_the_circular_game {

  public static void main(String[] args) {
    int n = 5, k = 2;
    Innerfind_the_winner_of_the_circular_game sol = new Innerfind_the_winner_of_the_circular_game();
    System.out.println(sol.findTheWinner_method_1(n, k));
  }
}

/**
 * Innerfind_the_winner_of_the_circular_game
 */
class Innerfind_the_winner_of_the_circular_game {

  // using array index
  public int findTheWinner_method_1(int n, int k) {
    List<Integer> list = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      list.add(i);
    }

    int index = 0;
    while (list.size() > 1) {
      index = (index + k - 1) % list.size();
      System.out.printf("Index=%d, Removing=%d\n", index, list.get(index));
      list.remove(index);
    }

    return list.get(0);
  }
}
