//{ Driver Code Starts
// driver code

import java.io.*;
import java.lang.*;
import java.util.*;

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

class GFG {

  public static void makeLoop(Node head, Node tail, int x) {
    if (x == 0) return;

    Node curr = head;
    for (int i = 1; i < x; i++) curr = curr.next;

    tail.next = curr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int num = sc.nextInt();
    Node head = new Node(num);
    Node tail = head;

    for (int i = 0; i < n - 1; i++) {
      num = sc.nextInt();
      tail.next = new Node(num);
      tail = tail.next;
    }

    int pos = sc.nextInt();
    makeLoop(head, tail, pos);

    Solution x = new Solution();
    System.out.println(x.countNodesinLoop(head));
  }
}

class Solution {

  int countNodesinLoop(Node head) {
    // Declare fast and slow pointer
    Node slow = head, fast = head;
    boolean isLoop = false;
    // finding loop
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        isLoop = true;
        break;
      }
    }

    if (!isLoop) {
      // if loop not present
      return 0;
    }
    int length = 0;
    while (slow.next != fast) {
      slow = slow.next;
      length++;
    }
    return ++length;
  }
}
