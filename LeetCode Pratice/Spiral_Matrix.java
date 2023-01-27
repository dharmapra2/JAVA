import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // taking array list
        ArrayList<Integer> list=new ArrayList<Integer>();
        int row=matrix.length,col=matrix[0].length;
        int count=0,total=row*col;
        int startingRow=0,startingCol=0,endingRow=row-1,endingCol=col-1;
        
        while(count<total){
            // travering from left to right
            for(int index=startingRow;count<total&&index<=endingCol;index++){
                // push array element to list
                list.add(matrix[startingRow][index]);
                // with counting no.of traversed elements
                count++;
            }
            startingRow++;
             // travering from top to buttom
            for(int index=startingRow;count<total&&index<=endingRow;index++){
                // push array element to list
                list.add(matrix[index][endingCol]);
                // with counting no.of traversed elements
                count++;
            }
            endingCol--;
             // travering from right to left
            for(int index=endingCol;count<total&&index>=startingCol;index--){
                // push array element to list
                list.add(matrix[endingRow][index]);
                // with counting no.of traversed elements
                count++;
            }
            endingRow--;
             // travering from buttom to top
            for(int index=endingRow;count<total&&index>=startingRow;index--){
                // push array element to list
                list.add(matrix[index][startingCol]);
                // with counting no.of traversed elements
                count++;
            }
            startingCol++;
        }
        return list;
    }
}