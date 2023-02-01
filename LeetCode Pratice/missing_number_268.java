class missing_number_268 {
    static int missingNumber(int[] nums) {
        int nums_size=nums.length;
        int total_num_sum=(nums_size*(nums_size+1))/2;
        for(int ele:nums){
            total_num_sum-=ele;
        }
    return total_num_sum;
    }
    public static void main(String ...args){
        int []arr={2,3,2,4,5};
        System.out.print(missingNumber(arr));
    }
}