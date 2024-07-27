package Linked_List;

public class LinkedListImpl {
    public static void main(String[] args) {

    }
    //Add element at the last
    public void addLast(int n, Node head) {
        Node newNode = new Node(n);
        if(head == null)
        {
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    //Insert an element at a specific position
    public void insertAtspecificPosition(int n, Node head, int position) {
        if(position < 0)
        {
            System.out.println("Invalid Position");
        }
        Node newNode = new Node(n);
        if(position == 0){
            newNode.next = head;
        }else{
            Node temp = head;
            int count = 0;

        }
    }
}
