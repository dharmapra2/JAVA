//{ Driver Code Starts
    import java.util.*;

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
      public class ReorderList {
        Node head; // head of lisl
        Node last; // last of linked list
    
        /* Linked list Node*/
    
        /* Utility functions */
    
        /* Inserts a new Node at front of the list. */
        public void addToTheLast(Node node) {
    
            if (head == null) {
                head = node;
                last = head;
            } else {
                // Node temp = head;
                // while (temp.next != null) temp = temp.next;
    
                last.next = node;
                last = last.next;
            }
        }
        /* Function to print linked list */
        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    
        /* Drier program to test above functions */
        public static void main(String args[]) {
    
            try (/* Constructed Linked List is 1->2->3->4->5->6->
                           7->8->8->9->null */
            Scanner sc = new Scanner(System.in)) {
                int t = sc.nextInt();
                while (t > 0) {
                    int n = sc.nextInt();
                    ReorderList llist = new ReorderList();
   
                    int a1 = sc.nextInt();
                    Node head = new Node(a1);
                    llist.addToTheLast(head);
                    for (int i = 1; i < n; i++) {
                        int a = sc.nextInt();
                        llist.addToTheLast(new Node(a));
                    }
   
                    llist.head = new gfg().reorderlist(llist.head);
   
                    llist.printList();
   
                    t--;
                }
            }
        }
    }
    
    class gfg {
        public Node reverseList(Node head) {
            if (head == null)
                {
                    return null;
                    
                }
            Node prev = null,curr=head;
            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
        Node reorderlist(Node head) {
            // first return same node if thier only 2 nodes
            if(head.next==null){
                return head;
            }
            // then we need to get the middle of list
            Node slow=head,fast=head;
            while(fast.next!=null&&fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            // then we'll pass the node from middle of the list for reversing 
            Node reversedList=reverseList(slow.next);
            Node orderedList=new Node(0);
            Node temp=orderedList;
            // joining the two lists
            while(head!=slow.next&&reversedList!=null){
                temp.next=new Node(head.data);
                temp=temp.next;
                temp.next=new Node(reversedList.data);
                temp=temp.next;
                head=head.next;
                reversedList=reversedList.next;
            }
            // for odd number of nodes the 1st half of last node is left so we assign it again
            if(head!=slow.next){
                temp.next=new Node(head.data);
            }
            return orderedList.next;
        }
    }
    