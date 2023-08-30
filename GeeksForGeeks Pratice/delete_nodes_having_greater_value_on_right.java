import java.util.*;

class Node {

  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }
}

public class delete_nodes_having_greater_value_on_right {

  /* Function to print linked list */
  public static void print(Node root) {
    Node temp = root;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int a1 = sc.nextInt();
    Node head = new Node(a1);
    Node tail = head;

    for (int i = 1; i < n && sc.hasNextInt(); i++) {
      int a = sc.nextInt();
      tail.next = new Node(a);
      tail = tail.next;
    }

    Node result = new Solution().compute(head);
    print(result);
    System.out.println();
  }
}

class Solution {

  Node compute(Node head) {
    /**
     * Approach 1
     */
    if (head == null || head.next == null) {
      return head;
    }

    Node curr = head;
    Node temp = head.next;

    while (temp != null) {
      if (curr.data < temp.data) {
        curr = temp;
      } else {
        curr.next = temp;
        curr = temp;
      }
      temp = temp.next;
    }

    curr.next = null;
    return head;
    /*
     * Reverse the string
     * approach 2
     */

    // curr = head;
    // temp = compute(head.next);
    // System.out.printf("%d %d\n", curr.data, temp.data);

    // if (curr.data < temp.data) {
    //   curr = temp;
    // } else {
    //   curr.next = temp;
    // }
    // head = curr;
    // return head;
  }
}
