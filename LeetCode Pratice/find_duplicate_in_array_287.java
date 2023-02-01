import java.util.HashMap;
class find_duplicate_in_array_287 {
    static int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
            if(arr[nums[i]]==1)
            return nums[i];
            arr[nums[i]]++;

        }
        return -1;
    }
    
    // another approach
    static int findDuplicate_2(int[] nums) {
        HashMap<Integer,Integer> list=new HashMap<Integer,Integer>();
        for(int ele:nums){
            if(!list.containsKey(ele)){
                list.put(ele,ele);
            }
            else{
                return ele;
            }
        }
        return -1;
    }


    public static void main(String ...args){
        int []arr={2,3,2,4,5};
        System.out.print(findDuplicate(arr));
        System.out.print(findDuplicate_2(arr));
    }
}
