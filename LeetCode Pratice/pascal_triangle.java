import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class pascal_triangle {

  public static void main(String[] args) {
    int numRows = Integer.valueOf(args[0]);
    List<Integer> pascalsTriangle = new Solution().getRow(numRows);

    // Print the generated Pascal's Triangle
    // for (List<Integer> row : pascalsTriangle) {
    System.out.println(pascalsTriangle);
    // }
  }
}

class Solution {

  public List<Integer> getRow(int rowIndex) {
    List<List<Integer>> triangle = new ArrayList<>();

    // First row
    triangle.add(new ArrayList<>());
    triangle.get(0).add(1);
    if (rowIndex == 0) {
      return triangle.get(0);
    }
    triangle.add(new ArrayList<>());
    triangle.get(1).add(1);
    triangle.get(1).add(1);
    if (rowIndex == 1) {
      return triangle.get(1);
    }

    for (int rowNum = 2; rowNum <= rowIndex; rowNum++) {
      List<Integer> row = new ArrayList<>();
      List<Integer> prevRow = triangle.get(rowNum - 1);

      // The first element in each row is always 1
      row.add(1);

      for (int j = 1; j < rowNum; j++) {
        // Calculate the current element based on the previous row
        int sum = prevRow.get(j - 1) + prevRow.get(j);
        row.add(sum);
      }

      // The last element in each row is always 1
      row.add(1);

      triangle.add(row);
    }
    System.out.println(triangle);

    return triangle.get(rowIndex);
  }
}
