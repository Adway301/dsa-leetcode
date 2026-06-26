// 160. Intersection of Two Linked Lists


import java.util.HashSet;

public class IntersectionOfLL {
    static class Node{
        int val;
        Node next;
        Node(int x){
            val=x;
        }
    }

    // Method 1 hashset approach
    public static Node Intersection(Node headA, Node headB){
        HashSet<Node> set = new HashSet<>();
        Node currA = headA;
        Node currB = headB;
        while (currA!=null) {
            set.add(currA);
            currA=currA.next;
        }
        while (currB!=null) {
            if (set.contains(currB)) {
                return currB;
            }
            currB=currB.next;
        }
        return null;
    }
public static void main(String[] args) {  
    Node a1 = new Node(1); 
    Node a2 = new Node(2); 
    Node c1 = new Node(3); 
    Node c2 = new Node(4); 
    Node c3 = new Node(5); 
    Node b1 = new Node(5); 
    Node b2 = new Node(5); 
    Node b3 = new Node(5);
    a1.next=a2;
    a2.next=c1;
    c1.next=c2;
    c2.next=c3;
    b1.next=b2;
    b2.next=b3;
    b3.next=c1;
    Node res=Intersection(a1, b1);
    System.out.println(res.val);
}
}