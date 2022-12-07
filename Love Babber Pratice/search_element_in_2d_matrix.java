class search_element_in_2d_matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
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
    public static void main(String ...args){
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,3));
    }
}