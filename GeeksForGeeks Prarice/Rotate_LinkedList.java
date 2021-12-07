import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

public class Rotate_LinkedList {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;
            
            for (int i=0; i<n-1; i++)
            {
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution ob = new Solution();
            head = ob.rotate(head,k);
            printList(head);
        }
        sc.close();
    }
    
    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
// } Driver Code Ends


/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        // Node temp=head,temp1=null;
        // while(temp!=null && k-- >0){
        //     // temp1=temp1.next;
        //     temp=temp.next;
        // }
        // temp1=temp;
        // // temp.next=null;
        // while(temp1!=null && temp1.next!=null){
        //     temp1=temp1.next;
        // }
        // temp1.next=temp;
        // return temp1;
        //-----------------------------------------------
        Node temp=head,tail=null;
        while(temp!=null && temp.next!=null){
            temp=temp.next;
            tail=temp;
        }
        temp=head;
        while(k-->0){
           Node t=head,t1=head.next;
           head=t1;
           tail.next=t;
           tail=tail.next;
           tail.next=null;     
        }
        return head;
    }
}
