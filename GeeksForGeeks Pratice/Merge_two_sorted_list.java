class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Merge_two_sorted_list
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
        Node sort=new Node(0);
        Node temp=sort;
        while(head1!=null && head2!=null){
            if(head1.data>head2.data){
                temp.next=head2;
                head2=head2.next;
            }
            else{
                temp.next=head1;
                head1=head1.next;
            }
                temp=temp.next;
        }
        if(head1==null){
            temp.next=head2;
        }
        if(head2==null){
            temp.next= head1;
        }
        return sort.next;
   } 
}