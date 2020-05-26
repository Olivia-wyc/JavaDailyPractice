package Practice2;

public class Practice29 {
    /**
     * 给定一个链表,旋转链表,将链表每个节点向右移动 k 个位置,其中 k 是非负数.
     * @param head
     * @param k
     * @return
     * 输入: 1->2->3->4->5->NULL, k = 2
     * 输出: 4->5->1->2->3->NULL
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
    }
        int size = 1;
        ListNode tmp = head;

        while(tmp != null){
            tmp = tmp.next;
            size++;
        }
        //将该链表反转，反转之后将前K个再进行反转，后K个进行相同的操作
        reverse(head,size);//得到5-->4-->3-->2-->1-->NULL
        reverse(head, k);
        return head;

//        tmp = head;
//        int i = 1;
//        while(tmp != null && i < size - k + 1){
//            tmp = tmp.next;
//            i++;
//            //找到第K个元素 就是tmp
//        }
//        //将该链表反转，反转之后将前K个再进行反转，后K个进行相同的操作
//        //ListNode newHead = new ListNode(tmp.val);
//        while(tmp.next != null && i <= k){
//            ListNode node = new ListNode(tmp.val);
//            node.next = t;
//            newHead = node;
//            tmp = tmp.next;
//            i++;
//        }
//        return newHead;
//        //reverse(tmp,k);

//        tmp = head;
//        int i = 1;
//        while(tmp != null && i < size - k + 1){
//            tmp = tmp.next;
//            i++;
//            //找到第K个元素 就是tmp
//        }
//        //将该链表反转，反转之后将前K个再进行反转，后K个进行相同的操作
//        reverse(tmp,k);
//        return head;
    }
    //反转前K个元素
    public ListNode reverse (ListNode head,int k){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = new ListNode(head.val);
        ListNode tmp = head;
        int i = 1;
        while(tmp.next != null && i <= k){
            ListNode node = new ListNode(tmp.next.val);
            node.next = newHead;
            newHead = node;
            tmp = tmp.next;
            i++;
        }
        return newHead;
    }
}
