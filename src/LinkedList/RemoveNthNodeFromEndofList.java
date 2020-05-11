package LinkedList;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode pre = head;
        ListNode post = preHead;
        int step = 0;
        while(pre!=null && step<n){
            pre = pre.next;
            step++;
        }

        while(pre!=null){
            pre = pre.next;
            post = post.next;
        }

        post.next = post.next.next;
        return preHead.next;
    }
}
