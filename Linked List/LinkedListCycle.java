// 141 linked list cycle 

// brut force hashset method


import java.util.HashSet;
public class LinkedListCycle {
    static class Node{
        int val;
        Node next;
        Node(int x){
            val=x;
        }
    }
    // Method 1 brut force
    public static boolean cycle(Node head){
        HashSet<Node> set = new HashSet<>();
        Node curr = head;
        while (curr!=null) {
            if (set.contains(curr)) {
                return true;
            }
            set.add(curr);
            curr=curr.next;
        }
        return false;
    }

    // Method 2 optimal floyd hare and tortoise algorithm
    public static boolean cycleO(Node head){
        
        if (head==null) {
            return false;
        }
        Node slow= head;
        Node fast= head.next;
        while (slow!=fast) {
            if (fast==null || fast.next==null) {
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
        public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(4);
        a.next =b;
        b.next=c;
        c.next=d;
        d.next=c;
        System.out.println(cycleO(a));
    }
}