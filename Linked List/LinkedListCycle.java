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

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(4);
        a.next =b;
        b.next=c;
        c.next=d;
        d.next=b;
        System.out.println(cycle(a));
    }
}