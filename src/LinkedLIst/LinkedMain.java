package LinkedLIst;

public class LinkedMain {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        Node f1 = new Node(3);
        Node f2 = new Node(4);
        Node f3 = new Node(5);
        Node f4 = new Node(6);
        linkedList.head = f1;
        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        linkedList.traverseLinkedList();
        linkedList.deleteBackHalfOfLinkedList();

    }
}
