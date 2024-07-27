package LinkedLIst;

public class CustomLinkedList {
    Node head;

    public void traverseLinkedList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();

    }

    public void deleteBackHalfOfLinkedList(){
        if(head == null || head.next == null){
            head = null;
        }
        Node fast = head;
        Node slow = head;
        Node prev = null;
        while(fast!=null && fast.next !=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
        traverseLinkedList();
    }

}
