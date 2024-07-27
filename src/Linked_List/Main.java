package Linked_List;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(1);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        traversal(n1);
        recursion_traversal(n1);
        reverse_traversal(n1);
        System.out.println("\n"+"Interative reverse traversal");
        reverseIterative(n1);
        System.out.println("\n"+"Reverse traversal using stack");
        reverseTraversalUsingStack(n1);
        System.out.println("Length of linked list");
        lengthLinkedList(n1);
        insertAtPosition(n1, 1, 6);
        insertAtEnd(8, n1);
        removeElement(n1, 4);
        traversal(n1);

    }
    //T.C = O(N) and S.C = 0(N)
    public static void recursion_traversal(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data);
        recursion_traversal(head.next);
    }
    public static void reverse_traversal(Node head) {
        if (head == null) {
            return;
        }
        reverse_traversal(head.next);
        System.out.print(head.data);
    }
    public static void traversal(Node head) {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        //Note : why we use temp variable here?
        // Because if we use directly head , at last it will end up to the last node.
        // we cannot traverse it again.
//        while(head!=null)
//        {
//            System.out.print(head.data+" ");
//            head = head.next;
//        }

    }
    public static void removeElement(Node head, int data) {
     if (head == null) {
         return;
     }
     if (head.data == data) {
         head = head.next;
         return;
     }
     Node current = head;
     while (current.next != null) {
         if (current.next.data == data) {
             current.next = current.next.next;
             return;
         }
         current = current.next;
     }

    }
    //T.C = O(n) & S.C = O(1)
    public static void reverseIterative(Node node) {
        Node temp = node;
        Node prev = null;
        Node current = temp;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        temp = prev;
        while (temp!= null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void reverseTraversalUsingStack(Node head){
        Stack<Node> stack = new Stack<>();
        Node temp = head;
        while(temp!= null)
        {
            stack.push(temp);
            temp = temp.next;
        }
        while (!stack.isEmpty())
        {
            System.out.println(stack.pop().data);
        }
    }


    public static void lengthLinkedList(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        System.out.println(length);
    }
    public static void insertAtPosition(Node head, int position, int data)
    {
        if(position<0){
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        if(position==0) {
            newNode.next = head;
            head = newNode;
        }
        else {
            Node current = head;
            int count =0;
            while(current!=null && count<position-1){
                current = current.next;
                count++;
            }
            if(current==null){
                System.out.println("position exceeds the current list size");
                return;
            }
            newNode.next = current.next;
            current.next = newNode;
            traversal(head);
        }
    }
    public static void insertAtEnd(int n, Node head) {
        Node newNode = new Node(n);
        if (head == null) {
            newNode = head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            traversal(head);
        }
    }
//    public static void insertAtFirst(int n, Node head){
//        Node newNode = new Node(n);
//        if()
//    }

}
