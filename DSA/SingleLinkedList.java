
// package DSA;
import static java.lang.System.*;
import java.util.Scanner;

public class SingleLinkedList {
    private static final String NULL = "null\n";// define constant variable
    private ListNode head, temp, prev = null;// declearing datatype for list
    int count = 0;

    private static class ListNode {// inner class
        private int data;
        private ListNode next; // referance to next ListNode in list

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void display() {
        if (head == null) {
            out.println("List is Empty.");
        }
        temp = head;
        out.print("\t");
        while (temp != null) {
            out.print(temp.data + "--->");
            temp = temp.next;
        }
        out.print(NULL);
    }

    // Display method overload for reverse
    public void display(ListNode node) {
        if (node == null) {
            out.println("List is Empty.");
        }
        temp = node;
        out.print("\t");
        while (temp != null) {
            out.print(temp.data + "--->");
            temp = temp.next;
        }
        out.print(NULL);
    }

    public void length() {
        count = 0;
        temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        out.println("Length is :" + count);
    }

    // inserting a node -----------------------------
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            out.println("After Succesfully inserted list:");
            display();
            return;
        }
        newNode.next = head;
        head = newNode;
        out.println("After Succesfully inserted list:");
        display();
    }

    public void insertAtEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            out.println("After Succesfully inserted list:");
            display();
            return;
        }
        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        out.println("After Succesfully inserted list:");
        display();
    }

    public void insertAtPos(int pos, int value) {
        ListNode newNode = new ListNode(value);
        if (pos == 1) {
            insertFirst(value);
        } else {
            count = 1;
            prev = head;
            while (count < pos - 1) {
                prev = prev.next;
                count++;
            }
            temp = prev.next;
            prev.next = newNode;
            newNode.next = temp;
        }
        out.println("After Succesfully inserted list:");
        display();
    }

    public int deleteFirst() {
        if (head == null) {

            out.println("List is empty.");
            return 0;

        }
        temp = head;
        head = head.next;
        temp.next = null;
        return temp.data;

    }

    public int deleteAtEnd() {
        if (head == null || head.next == null) {
            out.println("List is empty.");
            return 0;
        }
        temp = head;
        prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp.data;
    }

    public int deleteAtPos(int pos) {
        if (pos == 1) {
            head = head.next;
        } else {
            prev = head;
            count = 1;
            while (count < pos - 1) {
                prev = prev.next;
                count++;
            }
            temp = prev.next;
            prev.next = temp.next;
        }
        return temp.data;
    }

    public void deleteItem(int value) {
        ListNode current = head;
        temp = null;
        while (current != null && current.data != value) {
            temp = current;
            current = current.next;
        }
        if (current == null)
            return;
        temp.next = current.next;
    }

    public int searchItem(int item) {
        if (head == null) {
            out.println("List is Empty.");
        }
        temp = head;
        int pos = 0;
        while (temp != null) {
            pos++;
            if (temp.data == item)
                return pos;
            temp = temp.next;
        }
        return 0;
    }

    public ListNode reverse(ListNode head) {
        if (head == null)
            return head;
        temp = head;
        prev = null;
        ListNode next = null;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    public void middleOfList() {
        if (head == null)
            out.println("List is Empty");
        ListNode slowPtr, fastPtr;
        slowPtr = fastPtr = head;
        while (fastPtr != null && slowPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        out.println("Middle of the node is:" + slowPtr.data);
    }

    public void Nth_end_node(ListNode node, int n) {
        if (node == null)
            out.println("List is Empty");
        temp = node;
        while (n - 1 > 0 && temp != null) {
            n--;
            temp = temp.next;
        }
        out.println("The nth end node is:" + temp.data);
    }

    public static void main(String[] args) throws NullPointerException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList sll = new SingleLinkedList();
        out.println("What's ur name:");
        String name = sc.next();
        Thread.sleep(1000);
        out.println("Hyy " + name + " glad to see u again ('-'*).");
        Thread.sleep(1200);
        out.println("Let's pratice some DSA stuff :)\n------------------------------");
        int choice;
        do {
            Thread.sleep(980);
            out.println(
                    "1.for inseting\n2.for deleting\n3.For Display\n4.Find out length of the list\n5.Search an item into the list\n6.Reverse a list\n7.Find middle of node\n8.Find Nth node from the end of list");
            Thread.sleep(1000);
            out.println("Enter Choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    int ch, value;
                    Thread.sleep(800);
                    out.println("--------------------------------------------------");
                    out.println("1.Insert at Begining.\n2.Insert at end.\n3.Insert at specific position.");
                    out.println("Enter Choice for inserting:");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1: {
                            Thread.sleep(500);
                            out.println("Enter the value:");
                            value = sc.nextInt();
                            sll.insertFirst(value);
                            break;
                        }
                        case 2: {
                            Thread.sleep(500);
                            out.println("Enter the value:");
                            value = sc.nextInt();
                            sll.insertAtEnd(value);
                            break;
                        }
                        case 3: {
                            Thread.sleep(500);
                            out.println("Enter the value:");
                            value = sc.nextInt();
                            Thread.sleep(500);
                            out.println("Enter the position:");
                            int pos = sc.nextInt();
                            sll.insertAtPos(pos, value);
                            break;
                        }
                        default:
                            Thread.sleep(500);
                            out.println("Select valid Choice");
                    }
                    Thread.sleep(800);
                    out.println("--------------------------------------------------");
                    break;
                }
                case 2: {
                    int ch;
                    Thread.sleep(800);
                    out.println("--------------------------------------------------");
                    out.println(
                            "1.Delete at Begining.\n2.Delete at end.\n3.Delete at specific position.\n4.Delete Data Item.");
                    Thread.sleep(500);
                    out.println("Enter Choice for deleteing:");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1: {
                            out.println("Before list:");
                            Thread.sleep(500);
                            sll.display();
                            if (sll.deleteFirst() != 0) {
                                Thread.sleep(500);
                                out.println("Deleted data item is:" + sll.deleteFirst());
                                Thread.sleep(500);
                                sll.display();
                            }
                            break;
                        }
                        case 2: {
                            Thread.sleep(500);
                            out.println("Before list:");
                            Thread.sleep(500);
                            sll.display();
                            if (sll.deleteAtEnd() != 0) {
                                out.println("Deleted data item is:" + sll.deleteAtEnd());
                                Thread.sleep(500);
                                sll.display();
                            }
                            break;
                        }
                        case 3: {
                            Thread.sleep(500);
                            out.println("Enter the position:");
                            int pos = sc.nextInt();
                            out.println("Before list:");
                            Thread.sleep(500);
                            sll.display();
                            if (sll.deleteAtPos(pos) != 0) {
                                out.println("Deleted data item is:" + sll.deleteAtPos(pos));
                                Thread.sleep(500);
                                sll.display();
                            }
                            break;
                        }
                        case 4: {
                            Thread.sleep(500);
                            sll.display();
                            Thread.sleep(500);
                            out.println("Enter the data element:");
                            int data = sc.nextInt();
                            Thread.sleep(500);
                            out.println("Before deletion list:");
                            sll.display();
                            Thread.sleep(500);
                            sll.deleteItem(data);
                            out.println("After delete list:");
                            Thread.sleep(500);
                            sll.display();
                            break;
                        }
                        default:
                            out.println("Select valid Choice");
                    }
                    out.println("--------------------------------------------------");
                    break;
                }
                case 3: {
                    Thread.sleep(800);
                    sll.display();
                    break;
                }
                case 4: {
                    Thread.sleep(800);
                    sll.length();
                    break;
                }
                case 5: {
                    Thread.sleep(800);
                    out.println("--------------------------------------------------");
                    Thread.sleep(600);
                    out.println("Enter the data item that u want to Search:");
                    int data = sc.nextInt();
                    Thread.sleep(600);
                    out.println(sll.searchItem(data) > 0 ? ("Item is found at loc:") + sll.searchItem(data)
                            : "No item found.");
                    Thread.sleep(600);
                    out.println("--------------------------------------------------");
                    break;
                }
                case 6: {
                    Thread.sleep(800);
                    out.println("--------------------------------------------------");
                    Thread.sleep(600);
                    out.println("Before Reversing a list:");
                    Thread.sleep(500);
                    sll.display();
                    Thread.sleep(500);
                    out.println("After Reversing a list:");
                    ListNode revNode = sll.reverse(sll.head);
                    sll.display(revNode);
                    Thread.sleep(500);
                    out.println("--------------------------------------------------");
                    break;
                }
                case 7: {
                    Thread.sleep(800);
                    out.println("--------------------------------------------------");
                    Thread.sleep(600);
                    sll.display();
                    sll.middleOfList();
                    Thread.sleep(600);
                    out.println("--------------------------------------------------");
                    break;
                }
                case 8: {
                    Thread.sleep(800);
                    out.println("--------------------------------------------------");
                    Thread.sleep(600);
                    sll.display();
                    Thread.sleep(500);
                    out.println("Enter the nth  node:");
                    ListNode revNode = sll.reverse(sll.head);
                    int nth = sc.nextInt();
                    sll.Nth_end_node(revNode, nth);
                    Thread.sleep(500);
                    out.println("--------------------------------------------------");
                    break;
                }
            }
        } while (choice <= 8);
        sc.close();
        Thread.sleep(1700);
        out.println("------------------------------------------------------------------------------------");
        Thread.sleep(2000);
        out.println("\n\t\tThanks a milllion  " + name + " ('-'*) ('-'*)\n");
    }
}