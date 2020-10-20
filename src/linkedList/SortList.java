package linkedList;

public class SortList {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = head;
        while(fast!=null && fast.next!=null){
            pre = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        pre.next = null;
        return merge(sortList(head), sortList(slow));
    }

    public ListNode merge(ListNode node1, ListNode node2){
        if(node1==null) return node2;
        if(node2==null) return node1;
        if(node1.val<node2.val){
            node1.next = merge(node1.next, node2);
            return node1;
        }else{
            node2.next = merge(node1, node2.next);
            return node2;
        }
    }
}
