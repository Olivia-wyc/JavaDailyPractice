package Practice2;

import java.util.List;

public class Practice28 {
    /**
     * 1、给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        //先判断有没有环，再求入环的第一个节点
        ListNode slow = head;
        ListNode fast = head;
        while(true){
            if(fast == null || fast.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        //fast(slow)为相遇节点
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    /**
     * 2、给定一个链表和一个特定值 x,对链表进行分隔,使得所有小于 x 的节点都在大于或等于 x 的节点之前.
     * " 你应当保留两个分区中每个节点的初始相对位置. "
     * 输入: head = 1->4->3->2->5->2, x = 3
     * 输出: -1 ->1->2->2->4->3->5
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        //遍历链表的同时和 x 进行比较，比 x 小的插到新链表尾部,最终返回新链表的头节点
        ListNode dummyHead = new ListNode(-1);
        ListNode current = dummyHead;
        ListNode tmp = head;
        while(tmp != null) {
            if(tmp.val < x){
                ListNode node = new ListNode(tmp.val);
                current.next = node;
                tmp = tmp.next;
                current = current.next;
            }else{
                tmp = tmp.next;
            }
            //此时newHead中存在的数据是 1-->2-->2
        }
        tmp = head;
        while(tmp != null){
            if(tmp.val < x){
                tmp = tmp.next;
            }else{
                ListNode node1 = new ListNode(tmp.val);
                current.next = node1;
                tmp = tmp.next;
                current = current.next;
            }
        }
        return dummyHead.next;
    }

    /**
     * 3、给定一个链表,删除链表的倒数第 n 个节点,并且返回链表的头结点.
     * 这个题需要注意的时候，若删除 的是第一个节点怎么办,是单独处理这类情况还是引用虚拟头节点;
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode slow = dummyHead;
        ListNode fast = dummyHead;
        while(n != 0){
            fast = fast.next;
            n--;
            //让fast先走n步
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
            //此时slow为待删除节点的前驱节点
        }
        //此时slow.next就是待删除节点
        slow.next = slow.next.next;
        return dummyHead.next;
    }

}
