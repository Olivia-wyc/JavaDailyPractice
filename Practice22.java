package Practice2;

class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) {
        val = x;
        next = null;
    }
}

public class Practice22 {

    /**
     * 反转链表:
     * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = new ListNode(head.val);
        while(head.next != null){
            ListNode node = new ListNode(head.next.val);
            node.next = newHead;
            newHead = node;
            head = head.next;
        }
        return newHead;
    }

    /**
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值(用数组返回)
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        if(head == null){
            return null;
        }
    }
    
}
