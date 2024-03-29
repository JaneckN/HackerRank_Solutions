package thirty_days_of_code.Day15_Linked_List;

import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {

    int count;

    public static  Node insert(Node head,int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            head.next = null;
            return head;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}