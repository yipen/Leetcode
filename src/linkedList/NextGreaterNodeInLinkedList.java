package linkedList;

import java.util.Stack;

public class NextGreaterNodeInLinkedList {
    int[] result;
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        calFunction(head, 0, stack);
        return result;
    }

    public void calFunction(ListNode node, int index, Stack<Integer> stack){
        if(node==null){
            result = new int[index];
            return;
        }
        calFunction(node.next, index+1, stack);
        while(!stack.isEmpty()&&stack.peek()<=node.val){
            stack.pop();
        }
        result[index]= stack.isEmpty()?0:stack.peek();
        stack.push(node.val);
    }

    public static class RemoveNthNode {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head==null){
                return head;
            }
            int pre = 0;
            ListNode nNode = head;
            ListNode preNode = head;
            while(pre<=n){
                nNode = nNode.next;
                pre++;
            }
            while(nNode.next!=null){
                preNode=preNode.next;
                nNode=nNode.next;
            }
            preNode.next=preNode.next.next;
            return head;
        }
    }
}
