import java.util.*;

class Node {

  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }
}

class remove_all_occurenece_of_duplicate {

  Node head;
  Node tail;

  public void addToTheLast(Node node) {
    if (head == null) {
      head = node;
      tail = node;
    } else {
      tail.next = node;
      tail = node;
    }
  }

  void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  /* Drier program to test above functions */
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      duplicates llist = new duplicates();
      int a1 = sc.nextInt();
      Node head = new Node(a1);
      llist.addToTheLast(head);
      for (int i = 1; i < N; i++) {
        int a = sc.nextInt();
        llist.addToTheLast(new Node(a));
      }

      Solution ob = new Solution();
      head = ob.removeAllDuplicates(llist.head);
      llist.printList(head);
  }
}

class Solution {

  public Node removeAllDuplicates(Node head) {
    Node temp = head.next, prev = head;
    Node newList;
    while(temp!=null){
        if(prev.data!=temp.data){
            newList=new 
        }
    }
    return head;
  }
}
