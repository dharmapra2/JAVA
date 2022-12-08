import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
class Add_to_array_from_integer {
    public static void main(String ...args){
        Solution s=new Solution();
        int tempA[] ={2,4,6,7,3};
        out.println(s.addToArrayForm(tempA,7837));
    }
}

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> nums = new ArrayList<Integer>();
        // traverse number from right to left
        for(int index=num.length-1;index>=0&&k>0;index--){
            // add k to num[index] 
            int sum=num[index]+k;
            num[index]=sum%10;
            k=sum/10;
        }
        // for left carry
        if(k>0){
            while(k>0){
                nums.add(k%10);
                k/=10;
            }
            // after adding carry reverse the list
            Collections.reverse(nums);
        }
        nums.addAll(Arrays.stream(num).boxed().collect(Collectors.toList()));
        return nums;
    }
}