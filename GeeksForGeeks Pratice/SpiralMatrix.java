//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    class SpiralMatrix
    {
        public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int r = sc.nextInt();
                int c = sc.nextInt();
                
                int matrix[][] = new int[r][c];
                
                for(int i = 0; i < r; i++)
                {
                    for(int j = 0; j < c; j++)
                     matrix[i][j] = sc.nextInt();
                }
                Solution ob = new Solution();
                ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
                for (Integer val: ans) 
                    System.out.print(val+" "); 
                System.out.println();
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution
    {
        //Function to return a list of integers denoting spiral traversal of matrix.
        static ArrayList<Integer> spirallyTraverse(int matrix[][], int row, int col)
        {
            // taking array list
            ArrayList<Integer> list=new ArrayList<Integer>();
        
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
    