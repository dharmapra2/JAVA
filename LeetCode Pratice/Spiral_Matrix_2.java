class Spiral_Matrix_2 {
    public int[][] generateMatrix(int n) {
        // taking array list
            int [][]list=new int[n][n];
        
            int count=1,total=n*n;
            int startingRow=0,startingCol=0,endingRow=n-1,endingCol=n-1;
            
            while(count<=total){
                // travering from left to right
                for(int index=startingRow;count<=total&&index<=endingCol;index++){
                    // push array element to list
                    // with counting no.of traversed elements
                    list[startingRow][index]=count++;
                }
                startingRow++;
                 // travering from top to buttom
                for(int index=startingRow;count<=total&&index<=endingRow;index++){
                    // push array element to list
                    // with counting no.of traversed elements
                    list[index][endingCol]=count++;
                }
                endingCol--;
                 // travering from right to left
                for(int index=endingCol;count<=total&&index>=startingCol;index--){
                    // push array element to list
                    // with counting no.of traversed elements
                    list[endingRow][index]=count++;
                }
                endingRow--;
                 // travering from buttom to top
                for(int index=endingRow;count<=total&&index>=startingRow;index--){
                    // push array element to list
                    // with counting no.of traversed elements
                   list[index][startingCol]=count++;
                }
                startingCol++;
            }
            return list;
    }
}