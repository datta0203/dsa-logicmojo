package LinkedList;

import java.util.HashSet;

public class LinkedListOperations {

    static Node insertAtEnd(Node head, int x) {
        Node node = new Node(x);
        Node curr = head;
        if (head == null) {
            return node;
        }
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
        return head;
    }

    static int getKthFromLast(Node head, int k) {

        Node curr = head;
        int size = 1;
        if (head != null) {
            while (curr != null) {
                curr = curr.next;
                size++;
            }
            curr = head;
            return GetNth(head, size - k);
        }
        return -1;
    }

    static Node middleNode(Node head) {
        Node fast = head, slow = head;

        int size = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static int GetNth(Node head, int index) {
        Node curr = head;
        if (head != null) {
            while (curr != null) {
                if (index == 1) {
                    return curr.data;
                }
                curr = curr.next;
                index--;
            }
        }
        return -1;
    }

    static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        if (head == null || head.next == null)
            return head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return head;

    }

    static Node deleteNodeAtX(Node head, int x) {
        Node curr = head;
        int index = 1;

        if (head == null) {
            return null;
        }
        if (x == 1) {
            curr = curr.next;
            head = curr;
        }
        while (curr != null) {

            if (null != curr.next && index == x - 1) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
            ++index;
        }

        return head;
    }

    static void printLinkedList(Node head) {
        Node curr = head;
        HashSet<Node> visited = new HashSet<>();
        while (curr != null) {
            System.out.print(curr.data + " ");
            if (visited.contains(curr)) {
                break;
            }
            visited.add(curr);
            curr = curr.next;
        }
        System.out.println();
    }

    static boolean checkForPallindrome(Node head) {
        Node curr = head, forward = head, prev = null;

        if (head == null || head.next == null) return true;


        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        while (prev.next != null && forward.next != null) {
            if (prev.data != forward.data) return false;
        }
        return true;
    }

    static boolean checkForACycle(Node head) {
        if (head == null || head.next == null)
            return false;
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }

    static Node addACycle(Node head, int x) {
        Node curr = head;
        Node tailConnect = null;
        while (curr.next != null) {
            if (x == 1) {
                tailConnect = curr;
            }
            curr = curr.next;
            x--;
        }
        curr.next = tailConnect;
        return head;
    }


    public static void main(String[] args) {
        int[] myNum = {10, 20, 30, 40, 50};
        Node head = null;
        for (int num : myNum) {
            head = insertAtEnd(head, num);
        }
        printLinkedList(head);
        int x = 2;
        System.out.println("Node at position " + x + " is " + GetNth(head, x));
        System.out.println("Node at position " + x + " from the end is " + getKthFromLast(head, x));
        //----------------------------------------
        //  head = deleteNodeAtX(head, 1);
        //   printLinkedList(head);
        head = reverseList(head);
        Node middle = middleNode(head);
        printLinkedList(head);
        printLinkedList(middle);

        // check for a cycle
        System.out.println("The linked list has a cycle ? " + checkForACycle(head));
        // add a cycle
        Node cyclehead = addACycle(head, 1);
        printLinkedList(cyclehead);
        System.out.println("The linked list has a cycle ? " + checkForACycle(cyclehead));

        myNum = new int[]{10, 20, 30, 40, 40, 30, 20, 10};
        Node pallinhead = null;
        for (int num : myNum) {
            pallinhead = insertAtEnd(pallinhead, num);
        }
        printLinkedList(pallinhead);
        System.out.println("Is this a pallindrome linked list ? " + checkForPallindrome(pallinhead));


    }

}
