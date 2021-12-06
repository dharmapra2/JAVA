public class Middle_of_LinkedList {
    public int count(ListNode head){
        if(head==null)
            return 0;
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public ListNode middleNode(ListNode head) {
        int n=count(head)/2;
        ListNode temp=head;
        while(temp!=null && n-->0){
            temp=temp.next;
        }
        return temp;
    }
}
