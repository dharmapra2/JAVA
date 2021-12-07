// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class add_two_no_by_LinkedList{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
        sc.close();
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
  Node reverse(Node head)
   {
       Node prev=null;
       Node curr=head;
       Node nex=null;
       while(curr!=null)
       {
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
       }
       return prev;
   }
    Node addTwoLists(Node first, Node second){
    Node l1=reverse(first);
    Node l2=reverse(second);
    
    Node temp=new Node(0);
    Node temp2=temp;
    
    int carry =0;
    int sum=0;
    while(l1!=null || l2!=null|| carry==1)
    {
      sum=0;
      if(l1!=null)
      {
          sum+=l1.data;
          l1=l1.next;
      }
      if(l2!=null)
    {
        sum+=l2.data;
        l2=l2.next;       
    }
    sum+=carry;
    carry=sum/10;
    Node n=new Node(sum%10);
    temp2.next=n;
    temp2=temp2.next;
    }
    
   Node ans=reverse(temp.next);
    return ans;
    }
}