// 142. Linked List Cycle II

public class LinkedListCycleII {
    static class Node{
        int val;
        Node next;
        Node(int x){
            val=x;
        }
    }
    public static Node cycle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                break; 
            }
        }
        if (fast==null || fast.next==null) {
            return null;
        }

        Node curr = head;
        while (curr!=slow) {
            curr=curr.next;
            slow=slow.next;
        }
        return curr;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=b;
        System.out.println(cycle(a));
    }
    // public static void print(Node head){
    //     Node curr = head;
    //     while (curr!=null) {
    //         System.out.print(curr.val+"->");
    //         curr=curr.next;
    //     }
    //     System.out.println("end");
    // }
}
