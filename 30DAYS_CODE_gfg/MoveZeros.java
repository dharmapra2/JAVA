//Initial Template for Java
import java.io.*;
// import java.util.*; 
class MoveZeros{
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
            ob.moveZeroe(a);

            for (int i=0;i<n;i++) 
                System.out.print(a[i]+" "); 
            System.out.println();
        }
    } 
}
class Solution {
    public void moveZeroe(int[] num) {
        for(int i=0;i<num.length;i++){
            if(num[i]==0){
                for(int j=i+1;j<num.length;j++){
                   if(num[j]>0 || num[j]<0){
                       int temp=num[j];
                       num[j]=num[i];
                       num[i]=temp;
                       break;
                   }
                    else{
                        continue;
                    }
                } 
            }
            else{
                continue;
            }
        }
    }
}