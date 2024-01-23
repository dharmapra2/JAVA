import java.util.Arrays;

/**
 * number_of_laser_beams_in_a_bank
 */
public class number_of_laser_beams_in_a_bank {

  public static void main(String[] args) {
    String arr[] = { "011001", "000000", "010100", "001000" };
    // String arr[] = { "1", "1" };
    Innernumber_of_laser_beams_in_a_bank sol = new Innernumber_of_laser_beams_in_a_bank();
    System.out.println(sol.numberOfBeams_2(arr));
  }
}

/**
 * Innernumber_of_laser_beams_in_a_bank
 */class Innernumber_of_laser_beams_in_a_bank {

  public int numberOfBeams(String[] bank) {
    int len = bank.length;
    int no_of_beams[] = new int[len];
    int ind = 0;
    for (int i = 0; i < len; i++) {
      int strlen = bank[i].length(), no_beams = 0;
      int startFrom = 0;
      while (bank[i].indexOf('1', startFrom) >= 0 && startFrom <= strlen) {
        no_beams++;
        startFrom = bank[i].indexOf('1', startFrom) + 1;
        // System.err.printf("no_beams=%d at i=%d\n", no_beams, i);
      }
      if (no_beams > 0) {
        no_of_beams[ind++] = no_beams;
      }
    }
    System.err.println(Arrays.toString(no_of_beams));
    int num_of_leasers = 0;
    if (ind <= 1) {
      return 0;
    }
    System.out.println(ind);
    for (int i = 0; i < ind - 1; i++) {
      num_of_leasers += (no_of_beams[i] * no_of_beams[i + 1]);
    }
    return num_of_leasers;
  }

  public int numberOfBeams_2(String[] bank) {
    int prevRowCount = 0;
    int num_of_leasers = 0;

    for (String row : bank) {
      int curRowCount = countBeams(row);
      if (curRowCount == 0) continue;

      num_of_leasers += curRowCount * prevRowCount;
      prevRowCount = curRowCount;
    }
    return num_of_leasers;
  }

  private int countBeams(String str) {
    int count = 0;
    int startFrom = 0;

    while ((startFrom = str.indexOf('1', startFrom)) >= 0) {
      count++;
      startFrom++;
    }

    return count;
  }
}
