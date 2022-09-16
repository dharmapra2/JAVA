import java.io.*;
    class SearchNumber
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            
            while(t-- > 0)
            {
                int sizeOfArray = Integer.parseInt(read.readLine());
                int arr[] = new int[sizeOfArray];
                
                String st[] = read.readLine().trim().split("\\s+");
                for(int i = 0; i < sizeOfArray; i++)
                  arr[i] = Integer.parseInt(st[i]);
                  
                int x = Integer.parseInt(read.readLine());
                
                Solution1 obj = new Solution1();
                
                System.out.println(obj.search(arr, sizeOfArray, x));
            }
        }
    }
    class Solution1{
            
        int search(int arr[], int N, int X)
        {
            for(int i=0;i<N;i++){
                if(arr[i]==X)
                {
                    return i;
                }
                
            }
            return -1;
            
        }
        
    }
    