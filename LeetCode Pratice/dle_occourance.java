import java.io.*;
import java.util.*;

// a node of the doubly linked list
class Node {

  int data;
  Node next, prev;
}

class dle_occourance {

  /* Function to insert a node at the beginning
        of the Doubly Linked List */
  static Node push(Node head, int new_data) {
    // allocate node
    Node new_node = new Node();

    // put in the data
    new_node.data = new_data;

    /* since we are adding at the beginning,
        prev is always NULL */
    new_node.prev = null;

    // link the old list off the new node
    new_node.next = head;

    // change prev of head node to new node
    if (head != null) head.prev = new_node;

    // move the head to point to the new node
    head = new_node;

    return head;
  }

  /* Function to print nodes in a given doubly
        linked list */
  static void printList(Node temp) {
    if (temp == null) System.out.print(-1);

    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  // Driver code
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    Node head = null;
    int n = sc.nextInt();
    int inp[] = new int[n];
    for (int i = 0; i < n; i++) inp[i] = sc.nextInt();
    for (int i = n - 1; i >= 0; i--) {
      head = push(head, inp[i]);
    }
    int x = sc.nextInt();
    Solution obj = new Solution();
    head = obj.deleteAllOccurOfX(head, x);
    printList(head);
    System.out.println();
  }
}

class Solution {

  Node deleteAllOccurOfX(Node head, int x) {
    Node curr = head, previous = null, temp = null;

    while (curr != null) {
      if (curr.data == x) {
        temp = curr.next;
        curr.prev = previous;
        curr.next = previous;
      } else {
        temp = curr.next;
        curr.prev = previous;
        previous = curr;
      }
      curr = temp;
    }
    return head;
  }
}
