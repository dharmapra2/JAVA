package Basics;

import java.util.Scanner;
import java.lang.Math;

class gfg3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int convertfive(int n) {
        // Your code here
        int num=0,count=1,rem,res;
        boolean b = (n!=0);
        while(b){
            res=n/10;
            rem=n%10;
            if(rem==0){
                num=num+count*5;
            }
            else{
                num=num+rem*count;
            }
            count=count*10;
            n=n/10;
            b = (n!=0);
        }
        return num;
    }
}