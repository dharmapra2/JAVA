class BitonicPoint {
    static int findMaximum(int[] arr, int n) {
        int left=0,right=n-1,mid=n-1;
        while(left!=right){
            mid = left + (right - left) / 2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
                return arr[mid];
            }
            if(arr[mid]>arr[mid+1]&&arr[mid]<arr[mid-1]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return arr[right];
    }
    public static void main(String[] args) {
        int []arr={10,20,45,4};
        System.out.println(findMaximum(arr,4));
    }
}