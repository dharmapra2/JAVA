import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class Left_most_and_right_most_index {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        }
	}
}


class Solution {
    
    int findFirstOccurrenceIndex(long arr[], int low, int high, long x) {
        int index = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] > x) {
                high = mid - 1;
            }
            else if(arr[mid] < x) {
                low = mid + 1;
            }
            else {
                index = mid;
                high = mid - 1;
            }
        }
        return index;
    }
    int findLastOccurrenceIndex(long arr[], int low, int high, long x) {
        int index = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] > x) {
                high = mid - 1;
            }
            else if(arr[mid] < x) {
                low = mid + 1;
            }
            else {
                index = mid;
                low = mid + 1;
            }
        }
        return index;
    }
    public pair indexes(long v[], long x)
    {
        long firstIndex = findFirstOccurrenceIndex(v, 0, v.length - 1, x);
        long lastIndex;
        //Optimization here
        if(firstIndex == -1) { 
            lastIndex = -1;
        }
        else {
            lastIndex = findLastOccurrenceIndex(v, 0, v.length - 1, x);
        }
        return (new pair(firstIndex, lastIndex));
    }
}