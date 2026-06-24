public class DesignLL {

    static class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
        }
    }

    static class MyLinkedList {
        Node head; //sentinal node
        int size;

        MyLinkedList() {
            head = new Node(0);
            size = 0;
        }

        public int get(int index) {
            if (index < 0) {
                return -1;
            }
            if (index >= size) {
                return -1;
            }
            Node curr = head;

            for (int i = 0; i <= index; i++) {
                curr = curr.next;
            }
            return curr.val;
        }

        public void addAtHead(int val){
           Node newNode =  new Node(val);
           Node curr = head;
           newNode.next=head.next;
           curr.next=newNode;
           size++;
        }

        public void addAtTail(int val){
            Node newNode = new Node(val);
            Node curr = head;
            for (int i = 0; i < size; i++) {
                curr=curr.next;
            }
            curr.next=newNode;
            size++;
        }

        public void addAtIndex(int index, int val){
            if (index<0 || index>size) {
                return ;
            }
            Node newNode = new Node(val);
            Node curr = head;
            for (int i = 0; i < index; i++) {
                curr=curr.next;
            }
            newNode.next=curr.next;
            curr.next=newNode;
            size++;
        }

        public void deleteAtIndex(int index){
            Node curr = head;
            if (index<0 || index >=size) {
                return;
            }
            for (int i = 0; i < index; i++) {
                curr=curr.next;
            }
            curr.next=curr.next.next;
            size--;
        }

        public void printlist(){
            Node curr = head.next;
            System.out.println("Current list:");
            while (curr!=null) {
                System.out.print(curr.val + "->");
                curr = curr.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(3);
        list.deleteAtIndex(4);
        list.addAtTail(5);
        list.printlist();
    }

}

// MyLinkedList list = new MyLinkedList();
//         list.addAtHead(1);
//         list.addAtTail(3);
//         list.addAtIndex(1, 2);    // List: dummy -> 1 -> 2 -> 3
//         System.out.println(list.get(1)); // Prints 2
//         list.deleteAtIndex(1);    // List: dummy -> 1 -> 3
//         System.out.println(list.get(1)); // Prints 3