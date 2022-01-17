import java.util.TreeSet;

// } Driver Code Ends


    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    Node head=null,current=null;
	     TreeSet<Integer> set = new TreeSet<>();
	     while(head1!=null){
	         set.add(head1.data);
	         head1=head1.next;
	     }
	     while(head2!=null){
	         set.add(head2.data);
	         head2=head2.next;
	     }
	     for(Integer i:set){
	         Node node = new Node(i);
	         if(head==null){
	             head = node;
	             current = node;
	         }else{
	             current.next=node;
	             current = current.next;
	         }
	     }
	     return head;
	}
}