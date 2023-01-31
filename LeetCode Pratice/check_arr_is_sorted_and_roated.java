class check_arr_is_sorted_and_roated {
    public boolean check(int[] nums) {
        if(nums.length<=1){
            return true;
        }
        int ack=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                ack++;
            }
        }
        if(nums[nums.length-1] > nums[0])
        ack++;

        return ack<=1?true:false;
    }
}