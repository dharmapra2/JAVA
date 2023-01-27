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