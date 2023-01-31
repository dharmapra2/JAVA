import java.util.ArrayList;
class Search_a_2d_matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length, col=matrix[0].length;
        int start=0,end=(row*col)-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            int element=matrix[mid/col][mid%col];
            if(element==target){
                return true;
            }
            if(element<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }  
}

class Search_a_2d_matrix_2 {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		// Write your code here.
		int start=0,end=(n*m)-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			int element=mat.get(mid/n).get(mid%n);
			if(element==target){
				return true;
			}else if(element<target){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		return false;
	}
}
