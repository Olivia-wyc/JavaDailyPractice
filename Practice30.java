package Practice2;

import java.util.HashSet;
import java.util.Set;

public class Practice30 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        ListNode tmp = head;
        int length = 1;
        while(tmp != null){
            tmp = tmp.next;
            length++;
            //将链表最后一个元素的值先保存到tmp中，为下面旋转做准备(tmp.next = head)形成闭环
        }
        //为什么要这样呢？-->因为旋转可能是循环旋转，以防万一k的值大于链表长度，其实当K的值大于链表长度时，就可以判定，是闭环循环旋转，此时只需要计算 第一轮 的结果即可。
        int cir = k % length;
        if(cir == 0){
            return head;
        }
        ListNode current = head;
        int i = 1;
        while(current != null && i < length - cir) {
            current = current.next;
            i++;
            //目的是找到倒数第k个节点的前驱节点
        }
        ListNode ret = current.next;//找到倒数第K个节点
        current.next = null;//将倒数第K个节点的前驱节点与其本身断开连接
        tmp.next = head;//让断开连接后的尾部节点再接到链表头部
        return ret;
    }

    /**
     * 给定一个排序链表,删除所有含有重复数字的节点,只保留原始链表中 没有重复出现 的数字.
     * 输入: -1->1->1->1->2->3
     * 输出: 2->3
     * * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode tmp = dummyHead;
        while(tmp.next != null && tmp.next.next != null){
            if(tmp.next.val == tmp.next.next.val){
                //这样做的目的是方便删除最后一个重复元素;所以需要引入另一个变量来进行删除
                ListNode cur = tmp.next;
                while(cur != null && cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                //此时重复元素只剩一个
                tmp.next = cur.next;
//                dummyHead.next = dummyHead.next.next;
//                tmp = tmp.next;
//                tmp.val = tmp.next.val;
//                tmp.next = tmp.next.next;
            }else{
                tmp = tmp.next;
            }
        }
        return dummyHead.next;
    }
    public ListNode deleteDuplicates1(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next =  head;
        ListNode slow = dummyHead;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            if(slow.next.val != fast.next.val){
                slow = slow.next;
                fast = fast.next;
            }else{
                fast = fast.next;
            }
            slow.next = fast.next;
        }
        return dummyHead.next;
    }
}
