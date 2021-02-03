package 30DAYS_CODE_gfg;
import java.io.*;
import java.util.*;
class gfg2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            Solution s=new Solution();
            long nth=s.findNth(n);
            System.out.println(nth);
        }
    }
}
class Solution {
 long findNth(long N)
    {
       long ans=0;
long mul=1;
while(N!=0)
{
long dig=N%9;
N=N/9;
ans+=(mul*dig);
mul=mul*10;
}
return ans;
        }
    }