import java.io.*;
// import java.util.*; 
class Search_position{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            String input_line[] = read.readLine().trim().split("\\s+");
            int a[]= new int[n];
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(input_line[i]);
            Solution ob = new Solution();
            System.out.println(ob.searchInsert(a,target));
        }
    } 
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<=nums.length-1;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return i;
    }
}