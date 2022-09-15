import java.util.*;
class Node {
        char data;
        Node next;
 
        // Constructor to create a new node
        Node(char d) 
        {
            data = d;
            next = null;
        }
    }

    class Compare_two_linked_lists
    {
     Node head;
     
     public void addToTheLast(Node node)
     {
         if (head == null) 
         {
            head = node;
         } else 
         {
            Node temp = head;
            while (temp.next != null)
             temp = temp.next;
 
            temp.next = node;
         }
     }
  
      public static void main(String args[])
     {
        
          
         /* Constructed Linked List is 1->2->3->4->5->6->
            7->8->8->9->null */
          Scanner sc = new Scanner(System.in);
          int t=sc.nextInt();
          
          while(t>0)
          {
              Compare_two_linked_lists llist1 = new Compare_two_linked_lists();
              Compare_two_linked_lists llist2 = new Compare_two_linked_lists();
             int n1 = sc.nextInt();
             
             int value = 0;
             
                     char a1=sc.next().charAt(0);
                             Node head1= new Node(a1);
                             llist1.addToTheLast(head1);
                             
                             for (int i = 1; i < n1; i++) 
                             {
                                     char a = sc.next().charAt(0); 
                                     llist1.addToTheLast(new Node(a));
                                  
                             }
                 
             
                 int n2 = sc.nextInt();
                         char b1=sc.next().charAt(0);
                         Node head2 = new Node(b1);
                         llist2.addToTheLast(head2);
                          
                         for (int i = 1; i < n2; i++) 
                         {
                             //int b;
                             
                              char b = sc.next().charAt(0); 
                             llist2.addToTheLast(new Node(b));
                         }
  
         //int value=0;
         GfG g = new GfG();
         value = g.compare(llist1.head, llist2.head);
         System.out.println(value);
     t--;
     }
     sc.close();
     
 }}// } Driver Code Ends
 
 
 /*  Structure of Node
 class Node
  {
     char data;
     Node next;
  
     // Constructor to create a new node
     Node(char d) 
     {
        data = d;
        next = null;
     }
  }*/
 
 class GfG
 {
     int compare(Node node1, Node node2)
     {
       //Your code here
       String s1="",s2="";
       while(node1!=null || node2!=null){
           if(node1!=null){
             s1=s1+node1.data;
             node1=node1.next;
           }
          if(node2!=null){
             s2=s2+node2.data;
             node2=node2.next;
          }
       }
       if(s1.compareTo(s2)==0)
       return 0;
       else if(s1.compareTo(s2)<0)
       return -1;
       else
       return 1;
     }
 }