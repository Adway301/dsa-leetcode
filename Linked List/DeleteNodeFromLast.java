import java.util.HashSet;

/**
 * DeleteNodeFromLast
 */
public class DeleteNodeFromLast {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    // approach 1 .
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int size =0;
        while (curr!=null) {  
            curr=curr.next;
            size++;
        }
        int index=size-n;
        if (index==0) {
            return head.next;
        }
        curr=head;
        for (int i = 0; i <index-1; i++) {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }

    // approach 2
    public static ListNode removeElement(ListNode head, int n){
        ListNode pHead = new ListNode(0);
        pHead.next= head;

        ListNode curr = pHead;
        ListNode temp = pHead;

        int i = 0;
        while (i<=n) {
            curr=curr.next;
            i++;
        }
        while (curr!=null) {
            curr=curr.next;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return pHead.next;
    }
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;

        ListNode res = removeElement(a1, 01);
        System.out.println(res.val);

    }
}
