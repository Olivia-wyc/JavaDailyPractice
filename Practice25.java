package Practice2;

public class Practice25 {
    /**
     * 1、链表中倒数第k个节点(暴力解法:)
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tmp = head;
        int size = 0;
        while(tmp != null){
            tmp = tmp.next;
            size++;
        }
        tmp = head;
        int i = 1;
        while(tmp != null && i < size - k + 1){
            tmp = tmp.next;
            i++;
        }
        return tmp;
    }

    /**
     *  2、链表的中间结点:
     *  给定一个带有头结点 head 的'非空'单链表,返回链表的中间结点.如果有两个中间结点,则返回第二个中间结点。
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode tmp = head;
        int size = 0;
        while(tmp != null){
            tmp = tmp.next;
            size++;
        }
        tmp = head;
        int j = 1;
        while(tmp != null && j < size/2+1){
            tmp = tmp.next;
            j++;
        }
//        for (int i = 1; i < size/2+1; i++) {
//
//        }
        return tmp;
    }
}
