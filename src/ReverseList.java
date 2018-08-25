class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseList {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        ReverseList.reverse(l);
    }
     public static void reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        while (cur!= null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        while (pre!=null) {
            System.out.println(pre.val);
            pre = pre.next;
        }

    }
}

