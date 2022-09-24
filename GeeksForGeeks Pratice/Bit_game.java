import java.util.Stack;
import static java.lang.System.out;
class Bit_game {
    public static void main(String[] args) {
        Solution sb=new Solution();
        out.println(sb.swapBitGame(87));
    }
}
class Solution {
    public int swapBitGame(long N) {
        // code here
        if(N==1)return 1;
         Stack<Long> binary = new Stack<>();
        long num=N;
        while (num > 0) {
            // push only if value is 1 then push to stack
            if(num%2==1){
                binary.push(num%2);
            }
            num = num / 2;
        }
        // then decressing N till 0 also check weither stack is empty or not
        int count=0;
        while(!binary.isEmpty() && N-->0){
            binary.pop();
            count++;
        }
        return count%2==1?1:2;
    }
}